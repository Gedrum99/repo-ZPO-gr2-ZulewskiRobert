package z4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Account extends Bank {
    int PIN=1234;
    long balance=1000;
    long credit=0;
    String name;
    String interest;
    List<Long>takeout;
    List<String> summary;
    List<Long> summary1;
    boolean OK=false;

    public Account(String name){
        this.name=name;
        takeout=new ArrayList<>();
        summary1=new ArrayList<>();
        summary=new ArrayList<>();
    }

    public void doOperation(Operation operation){
        if(operation.getAuthorized()){
            operation.execute();
            OK=false;
        }else {
            authorize();
            if (OK == true) {
                operation.execute();
                OK = false;
            }
        }
    }

    public void checkBalance(){
        System.out.println("Your balance: "+ balance);
    }

    public void checkTakeOuts(){
        for(int i=0;i<takeout.size();i++){
            System.out.println("Take out #"+(i+1)+" "+ takeout.get( i ));
        }
    }
    public void checkSummaries(){
        for(int i=0;i<summary.size();i++){
            System.out.println("Summary #"+(i+1)+" "+ summary1.get( i )+" "+summary.get( i ));
        }
    }

    public void takeCredit(long amount){
        this.credit=amount;
        this.balance+=amount;
        summary.add("Credit" );
        summary1.add( amount );
    }

    public void authorize(){
        Scanner scan= new Scanner( System.in );
        System.out.print( "Please authorize operation with your PIN: " );
        Integer check=scan.nextInt();
        scan.nextLine();
        if(check==PIN){
            System.out.println("Welcome");
            OK=true;
        }
        else
            System.out.println("A PIN u sent is wrong");
    }

    public void setPermanentOperations(List<Operation>operations){
        System.out.println("Authorize operations");
        authorize();
        if(OK==true){
            for(Operation o: operations){
                o.setAuthorized(true);
            }
            OK=false;
        }
    }

    public void summarise(String s,long amount){
        this.summary.add(s);
        this.summary1.add( amount );
    }
}
