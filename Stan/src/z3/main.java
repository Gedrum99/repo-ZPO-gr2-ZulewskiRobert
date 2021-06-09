package z3;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Autoryzacja auth= new Autoryzacja();
        Konto tester=new Konto( "Tester", "password", auth );

        tester.zaloguj( "niet","niet" );
        tester.zaloguj( "niet","niet" );
        tester.zaloguj( "niet","niet" );
        tester.zaloguj( "Tester","password" );

    }
}
