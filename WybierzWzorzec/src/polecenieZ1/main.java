package polecenieZ1;

public class main {
    public static void main(String[] agrs){
        Konto Tester1=new Konto( "Tester 1" );
        Konto Tester2=new Konto( "Tester 2" );

        System.out.println("Sprawdzenie kont obu testerów");
        System.out.println(Tester1.getNazwa()+ " "+ Tester1.getBalance());
        System.out.println(Tester2.getNazwa()+ " "+ Tester2.getBalance());
        System.out.println();
        System.out.println("Jeden tester wypłaca 300 złotych, drugi próbuje wypłacić więcej środków niż ma na koncie");
        Tester1.wykonajOperację( Tester1.wypłata( Tester1 ) );
        Tester2.wykonajOperację( Tester2.wypłata( Tester2 ) );
        System.out.println();
        System.out.println("Sprawdzenie kont obu testerów");
        System.out.println(Tester1.getNazwa()+ " "+ Tester1.getBalance());
        System.out.println(Tester2.getNazwa()+ " "+ Tester2.getBalance());
        System.out.println();
        System.out.println("Jeden tester wpłaca 300 złotych, drugi wpłaca 500");
        Tester1.wykonajOperację( Tester1.wpłata( Tester1 ) );
        Tester2.wykonajOperację( Tester2.wpłata( Tester2 ) );
        System.out.println();
        System.out.println("Sprawdzenie kont obu testerów");
        System.out.println(Tester1.getNazwa()+ " "+ Tester1.getBalance());
        System.out.println(Tester2.getNazwa()+ " "+ Tester2.getBalance());
        System.out.println();
        System.out.println("Jeden tester przelewa środki drugiemu");
        Tester2.wykonajOperację( Tester2.przelew( Tester2,Tester1 ) );
        System.out.println();
        System.out.println("Sprawdzenie kont obu testerów");
        System.out.println(Tester1.getNazwa()+ " "+ Tester1.getBalance());
        System.out.println(Tester2.getNazwa()+ " "+ Tester2.getBalance());
    }
}
