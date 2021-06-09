package polecenieZ1;

import java.util.Scanner;

public class Przelew implements Operacja{
    Konto wysyłający;
    Konto odbiorca;

    public Przelew(Konto from, Konto to){
        this.wysyłający=from;
        this.odbiorca=to;
    }

    @Override
    public void wykonaj () {
        Scanner scanner=new Scanner( System.in );
        System.out.print("Proszę podać kwotę: ");
        long amount =scanner.nextLong();
        scanner.nextLine();
        if(amount<wysyłający.balance){
            wysyłający.balance=wysyłający.balance-amount;
            odbiorca.balance=odbiorca.balance+amount;
            System.out.println("Środki po przelewie: "+ wysyłający.balance);
        }else
        {
            System.out.println("Brak środków na koncie do wykonania operacji");
        }
    }
}
