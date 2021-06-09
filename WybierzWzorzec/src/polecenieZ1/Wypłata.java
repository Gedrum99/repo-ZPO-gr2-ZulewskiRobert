package polecenieZ1;

import java.util.Scanner;

public class Wypłata implements Operacja {
    Konto właściciel;

    public Wypłata(Konto account){
        this.właściciel=account;
    }

    @Override
    public void wykonaj () {
        Scanner scanner=new Scanner( System.in );
        System.out.print("Proszę podaj kwotę: ");
        long amount =scanner.nextLong();
        scanner.nextLine();
        if(amount<właściciel.balance){
            właściciel.balance=właściciel.balance-amount;
            System.out.println("Środki na koncie po wypłacie: "+ właściciel.balance);
        }else
        {
            System.out.println("Brak środków na koncie do wykonania operacji");
        }
    }
}
