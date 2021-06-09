package polecenieZ1;

import java.util.Scanner;

public class Wpłata implements Operacja {
    Konto właściciel;

    public Wpłata(Konto account){
        this.właściciel=account;
    }

    @Override
    public void wykonaj () {
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Proszę podaj kwotę: " );
        long amount = scanner.nextLong();
        scanner.nextLine();
        właściciel.balance = właściciel.balance + amount;
        System.out.println( "Środki na koncie po wpłacie: " + właściciel.balance );
    }
}
