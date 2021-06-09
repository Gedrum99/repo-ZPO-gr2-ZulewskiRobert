package z4;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String []args){
        Account Tester1=new Account("Tester1");
        Account Tester2=new Account("Tester2");

        Interest interestA=new InterestA();
        Interest interestB=new InterestB();
        Interest interestC=new InterestC();

        Tester1.doOperation( Tester1.income( Tester1,4000 ));
        System.out.println();
        Tester2.doOperation( Tester2.income( Tester2, 2000 ) );
        System.out.println();
        Tester1.doOperation( Tester1.transfer( Tester1,Tester2 ) );
        System.out.println();
        Tester1.checkBalance();
        System.out.println();
        Tester1.doOperation( Tester1.interestChange( Tester1,interestB ) );
        System.out.println();
        System.out.println("Another look at Tester1's interest...:    "+ Tester1.interest);


        System.out.println();
        List<Operation>operations=new ArrayList<>();
        operations.add( new PayOut(Tester1) );
        operations.add( new Transfer(Tester1,Tester2) );
        Tester1.setPermanentOperations(operations);
        System.out.println();
        Tester1.doOperation( Tester1.transfer( Tester1,Tester2 ) );
        System.out.println();
        Tester1.checkBalance();
        System.out.println();
        Tester1.checkTakeOuts();
        System.out.println();
        Tester1.checkSummaries();
        System.out.println();
        Tester2.takeCredit( 2000 );
        System.out.println();
        Tester2.checkSummaries();
        System.out.println();
        Tester2.checkBalance();
    }
}
