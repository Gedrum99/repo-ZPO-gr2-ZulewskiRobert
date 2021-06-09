package z2;

import java.util.Scanner;

public class Transfer implements Operation{
    Account from;
    Account to;

    public Transfer(Account from, Account to){
        this.from=from;
        this.to=to;
    }

    @Override
    public void execute () {
        Scanner scanner=new Scanner( System.in );
        System.out.print("Please write amount: ");
        long amount =scanner.nextLong();
        scanner.nextLine();
        if(amount<from.balance){
            from.balance=from.balance-amount;
            to.balance=to.balance+amount;
            System.out.println("After transfer your funds are: "+ from.balance);
        }else
        {
            System.out.println("Insufficient funds on account to do this operation");
        }
    }
}
