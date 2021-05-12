package z3;

import z3.Obserwator.O1;
import z3.Obserwator.O2;
import z3.Obserwator.O3;
import z3.Obserwator.OPodmiot;

import java.util.Scanner;

public class main {

    public static void main (String[] args) {
        Scanner scan = new Scanner( System.in );
        OPodmiot obserwowany = new OPodmiot();
        obserwowany.liczba = 1;
        obserwowany.dodajObserwatora( new O1() );
        obserwowany.dodajObserwatora( new O2() );
        obserwowany.dodajObserwatora( new O3() );

        System.out.println( "Sprawdzenie aktywności obserwatorów" );
        System.out.println();
        for (int i = 0; i < obserwowany.obserwatorzy.size(); i++) {
            System.out.println( "Czy obserwator " + obserwowany.obserwatorzy.get( i ).getName() + " aktywny?  : " + obserwowany.obserwatorzy.get( i ).getCzyAktywny() + " nr obserwatora: " + obserwowany.obserwatorzy.get( i ).getNr() );
        }
        while (true) {
            while (obserwowany.czyAktywny) {
                obserwowany.liczba = scan.nextInt();
                System.out.println( obserwowany.liczba );
                if (obserwowany.liczba == 0) {
                    obserwowany.czyAktywny = false;
                }
            }
            if (obserwowany.liczba == 0) {
                System.out.println( "Wybierz program: " );
                for (int i = 0; i < obserwowany.obserwatorzy.size(); i++) {
                    System.out.println(obserwowany.obserwatorzy.get( i ).getName());
                }
                obserwowany.liczba = scan.nextInt();
                obserwowany.aktualizujObserwatora( obserwowany.liczba );
                int nr = obserwowany.sprawdzStan();
                for (int i = 0; i < obserwowany.obserwatorzy.size(); i++)
                    if (nr == obserwowany.obserwatorzy.get( i ).getNr()) {
                        if (obserwowany.liczba == 1) {
                            System.out.println( "Wchodzisz w inny wymiar" );
                            while (obserwowany.obserwatorzy.get( nr - 1 ).getCzyAktywny()) {
                                obserwowany.liczba = scan.nextInt();
                                if (obserwowany.liczba > 0) {
                                    System.out.println( obserwowany.liczba );
                                }
                                if (obserwowany.liczba == 0) {
                                    obserwowany.obserwatorzy.get( nr - 1 ).setCzyAktywny( false );
                                    obserwowany.czyAktywny = true;
                                    System.out.println( "Wydostałeś się z tej pętli jesteś obecnie w pierwszym wymiarze, każda liczba jest przyjmowana" );
                                }
                            }
                        }
                        if (obserwowany.liczba == 2) {
                            System.out.println( "Wchodzisz w inny wymiar" );
                            while (obserwowany.obserwatorzy.get( nr - 1 ).getCzyAktywny()) {
                                obserwowany.liczba = scan.nextInt();
                                if (obserwowany.liczba == 3) {
                                    System.out.println( obserwowany.liczba );
                                }
                                if (obserwowany.liczba == 0) {
                                    obserwowany.obserwatorzy.get( nr - 1 ).setCzyAktywny( false );
                                    obserwowany.czyAktywny = true;
                                    System.out.println( "Wydostałeś się z tej pętli jesteś obecnie w pierwszym wymiarze, każda liczba jest przyjmowana" );
                                }
                            }
                        }
                        if (obserwowany.liczba == 3) {
                            System.out.println( "Wchodzisz w inny wymiar" );
                            while (obserwowany.obserwatorzy.get( nr - 1 ).getCzyAktywny()) {
                                obserwowany.liczba = scan.nextInt();
                                if (obserwowany.liczba % 2 == 0 && obserwowany.liczba!=0) {
                                    System.out.println( obserwowany.liczba );
                                }
                                if (obserwowany.liczba == 0) {
                                    obserwowany.obserwatorzy.get( nr - 1 ).setCzyAktywny( false );
                                    obserwowany.czyAktywny = true;
                                    System.out.println( "Wydostałeś się z tej pętli jesteś obecnie w pierwszym wymiarze, każda liczba jest przyjmowana" );
                                }
                            }
                        }
                    } else {
                        obserwowany.czyAktywny = true;
                        if(i==2 && obserwowany.liczba!=0)
                        {
                            System.out.println("Nie ma takiej opcji lub została usunięta");
                        }
                    }
            }
        }
    }

}
