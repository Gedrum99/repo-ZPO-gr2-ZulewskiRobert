package z1.c1;

import z1.c2.Plik;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FasadaProgram {
    private int n;
    private int[] lista;
    public FasadaProgram(int n) throws IOException {
        this.n=n;
        System.out.println("Wybierz sposób działania odczytu programu (K - Klawiatura/ P - Plik)");
        Drukarka drukarka=new Drukarka();
        Sortownik sortownik= new Sortownik();

        Scanner scan=new Scanner( System.in );
        String answer=scan.nextLine();
        if(answer.equals( "K" )){
            Klawiatura klawiatura=new Klawiatura();
            int[] lista=klawiatura.Pobierz( n );
            this.lista=lista;
        }
        if(answer.equals( "P" )){
            Plik plik=new Plik(n);
            int[] lista=plik.Odczytaj();
            this.lista=lista;
        }

        drukarka.Drukuj( lista );
        System.out.println();
        sortownik.Sortuj( lista );
        System.out.println();
        drukarka.Drukuj( lista );
    }
}
