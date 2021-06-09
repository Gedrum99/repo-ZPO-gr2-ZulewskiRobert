package obserwatorZ2;

public class main {
    public static void main(String[] args){
        Konto Tester1=new Konto( "Tester 1",true );
        Konto Tester2=new Konto( "Tester 2",false );
        Konto Tester3=new Konto( "Tester 3",true );
        Bank bank =new Bank( "Czyżyk Bank" );

        bank.dodajObserwatora( Tester1 );
        bank.dodajObserwatora( Tester2 );
        bank.dodajObserwatora( Tester3 );


        System.out.println("Bank wysyła do testerów następujące komunikaty: ");
        System.out.println("Witamy w banku");
        System.out.println("Przypominamy o zmianach jeśli chodzi o korzystanie ze strony banku");
        System.out.println("Zapraszamy do brania kredytów");

        bank.aktualizujObserwatora("Witamy w banku" );
        bank.aktualizujObserwatora("Przypominamy o zmianach jeśli chodzi o korzystanie ze strony banku");
        Tester3.zgoda=false;
        bank.aktualizujObserwatora("Zapraszamy do brania kredytów" );

        System.out.println();
        System.out.println("Sprawdzamy komunikaty każdego z Testerów");
        System.out.println();
        System.out.println("Tester 1:");
        Tester1.wysKomunikaty();
        System.out.println();
        System.out.println("Tester 2:");
        Tester2.wysKomunikaty();
        System.out.println();
        System.out.println("Tester 3:");
        Tester3.wysKomunikaty();
        System.out.println();
        System.out.println("Sprawdzamy najnowszy komunikat każdego z Testerów");
        System.out.println();
        System.out.println("Tester 1:");
        Tester1.wysNajnowszyKomunikaty();
        System.out.println();
        System.out.println("Tester 2:");
        Tester2.wysNajnowszyKomunikaty();
        System.out.println();
        System.out.println("Tester 3:");
        Tester3.wysNajnowszyKomunikaty();
    }
}
