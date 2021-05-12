package z3;

import z3.klasy.Pizza;
import z3.klasy.Podstawowa;
import z3.klasy.dodatki.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzeria {
    public static void main(String []args){
        Scanner scan=new Scanner( System.in );
        while(true){
            List<Pizza>dodatek=new ArrayList<>();
            dodatek.add(new Anszua() );
            dodatek.add(new Boczek());
            dodatek.add(new DodatkowySer() );
            dodatek.add(new Szynka() );
            boolean składniki=false;
            boolean dodatki=false;
            System.out.println("Czy chcesz zamówić pizze?");
            System.out.println("1.tak");
            System.out.println("2.nie");
            int answer= scan.nextInt();
            scan.nextLine();
            if(answer==1){
                Pizza nowa=new Podstawowa();
                while(true){
                    while(true) {
                        System.out.println( "Wybierz rozmiar pizzy" );
                        System.out.println();
                        System.out.println( "1.mała" );
                        System.out.println( "2.średnia" );
                        System.out.println( "3.duża" );
                        answer = scan.nextInt();
                        scan.nextLine();
                        if (answer == 1) {
                            ((Podstawowa) nowa).setRozmiar( "mała" );
                            break;
                        }
                        if (answer == 2) {
                            ((Podstawowa) nowa).setRozmiar( "średnia" );
                            break;
                        }
                        if (answer == 3) {
                            ((Podstawowa) nowa).setRozmiar( "duża" );
                            break;
                        }
                        if (answer < 1 || answer > 3) {
                            System.out.println( "Nie ma takiej pizzy, wybierz ponownie" );
                        }
                    }
                    System.out.println("Twoja obecna pizza to:");
                    System.out.println(nowa.getOpis());
                    System.out.println("Cena za tą pizzę to: "+ nowa.getCena()+" zł");
                    System.out.println();
                    System.out.println("Czy chcesz zrezygnować z jakichś składników?");
                    System.out.println("1.tak");
                    System.out.println("2.nie");
                    answer= scan.nextInt();
                    scan.nextLine();
                    if(answer==1){
                        while(true) {
                            System.out.println();
                            System.out.println( "Obecne składniki na pizzy: " + ((Podstawowa) nowa).getSkładniki() );
                            System.out.println();
                            if(((Podstawowa) nowa).składniki.size()==0){
                                System.out.println("Na pizzy nie ma składników, został sam placek");
                                składniki=true;
                                break;
                            }
                            System.out.println( "Który składnik chcesz usunać?" );
                            String answer2= scan.nextLine();
                            if(answer2.equals( "Mozzarella" )){
                                ((Podstawowa) nowa).ZrezygnujZeSkładnika( "Mozzarella" );
                            }
                            if(answer2.equals( "Sos pomidorowy" )){
                                ((Podstawowa) nowa).ZrezygnujZeSkładnika( "Sos pomidorowy" );
                            }
                            if(answer2.equals( "Oregano" )){
                                ((Podstawowa) nowa).ZrezygnujZeSkładnika( "Oregano" );
                            }
                            if(answer2.equals( "Bazylia" )){
                                ((Podstawowa) nowa).ZrezygnujZeSkładnika( "Bazylia" );
                            }
                            System.out.println();
                            System.out.println("Czy chcesz usunać jeszcze jakiś składnik?");
                            System.out.println("1.tak");
                            System.out.println("2.nie");
                            answer= scan.nextInt();
                            scan.nextLine();
                            if(answer==1){
                                continue;
                            }
                            if(answer==2){
                                składniki=true;
                                break;
                            }
                        }
                    }
                    if(answer==2 || składniki==true)
                    {
                        System.out.println();
                        System.out.println("Czy chcesz wybrać jakieś dodatki?");
                        System.out.println("1.tak");
                        System.out.println("2.nie");
                        answer= scan.nextInt();
                        scan.nextLine();
                        if(answer==1) {
                            while (true) {
                                System.out.println();
                                System.out.println( nowa.getOpis() );
                                System.out.println();
                                System.out.println( "Dostępne dodatki:" );
                                for (int i = 0; i < dodatek.size(); i++) {
                                    System.out.println( dodatek.get( i ).opis() );
                                }
                                String answer2 = scan.nextLine();
                                if (answer2.equals( "Anszua" )) {
                                    System.out.println( "Dodano Anszua" );
                                    Anszua kolejna = new Anszua( nowa );
                                    nowa = kolejna;
                                    dodatek.remove( 0 );
                                }
                                if (answer2.equals( "Boczek" )) {
                                    System.out.println( "Dodano Boczek" );
                                    Boczek kolejna = new Boczek( nowa );
                                    nowa = kolejna;
                                    dodatek.remove( 1 );
                                }
                                if (answer2.equals( "Dodatkowy Ser" )) {
                                    System.out.println( "Dodano Dodatkowy Ser" );
                                    DodatkowySer kolejna = new DodatkowySer( nowa );
                                    nowa = kolejna;
                                    dodatek.remove( 2);
                                }
                                if (answer2.equals( "Szynka" )) {
                                    System.out.println( "Dodano Szynkę" );
                                    Szynka kolejna = new Szynka( nowa );
                                    nowa = kolejna;
                                    dodatek.remove( 3 );
                                }
                                if (answer < 1 || answer > 3) {
                                    System.out.println( "Nie ma takiego dodatku" );
                                }
                                System.out.println();
                                System.out.println( "Czy chcesz dodać jeszcze jakieś dodatki?" );
                                System.out.println( "1.tak" );
                                System.out.println( "2.nie" );
                                answer = scan.nextInt();
                                scan.nextLine();
                                if(dodatek.size()==0){
                                    System.out.println();
                                    System.out.println("Nie ma więcej dodatków do dodania");
                                    dodatki=true;
                                    break;
                                }
                                if (answer == 1) {
                                    continue;
                                }
                                if (answer == 2) {
                                    dodatki = true;
                                    break;
                                }
                            }
                        }
                        if(answer==2||dodatki==true){
                            System.out.println();
                            System.out.println("Twoja końcowa pizza to:");
                            System.out.println();
                            System.out.println(nowa.getOpis());
                            System.out.println();
                            System.out.println(nowa.getCena()+ " zł");
                            break;
                        }
                        System.out.println();
                        System.out.println("Żegnamy i zapraszamy ponownie");
                        break;
                    }
                }
            }
            if(answer==2){
                System.out.println("W takim razie żegnamy");
                break;
            }
        }
    }
}
