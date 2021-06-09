package z2;

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
        Tester1.doOperation( Tester2.transfer( Tester2,Tester1 ) );
        System.out.println();
        System.out.println("Checking balance of Tester1...:    "+Tester1.balance);
        System.out.println();
        Tester1.doOperation( Tester1.interestChange( Tester1,interestB ) );
        System.out.println();
        System.out.println("Another look at Tester1's interest...:    "+ Tester1.interest);

    }
}
