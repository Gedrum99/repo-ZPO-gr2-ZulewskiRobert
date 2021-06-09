package z4;

import java.util.Scanner;

public class PayOut implements Operation{
    Account account;
    Boolean Authorized=false;

    public PayOut(Account account){
        this.account=account;
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
        if(amount<account.balance){
            account.balance=account.balance-amount;
            account.takeout.add( amount );
            account.summarise( "Take Out", amount );
            System.out.println("After pay out your funds are: "+ account.balance);
        }else
        {
            System.out.println("Insufficient funds on account to do this operation");
        }
    }
}
