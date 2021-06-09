package z4;

import java.util.Scanner;

public class Transfer implements Operation {
    Account from;
    Account to;
    Boolean Authorized=false;

    public Transfer(Account from, Account to){
        this.from=from;
        this.to=to;
    }

    @Override
    public void setAuthorized (boolean authorized) {
        Authorized = authorized;
    }
    @Override
    public boolean getAuthorized () {
        return Authorized;
    }
    @Override
    public void execute () {
        Scanner scanner=new Scanner( System.in );
        System.out.print("Please write amount: ");
        long amount =scanner.nextLong();
        scanner.nextLine();
        if(amount<from.balance){
            from.balance=from.balance-amount;
            from.summarise( "Transfer", -amount );
            to.balance=to.balance+amount;
            to.summarise( "Transfer", amount );
            System.out.println("After transfer your funds are: "+ from.balance);
        }else
        {
            System.out.println("Insufficient funds on account to do this operation");
        }
    }
}
