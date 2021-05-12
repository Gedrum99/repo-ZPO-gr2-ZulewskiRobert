package z1;

import z1.fabryka.FabrykaWysyłek;
import z1.fabryka.wysyłka.Wysyłka;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        FabrykaWysyłek fabryka = new FabrykaWysyłek();

        Wysyłka wysyłka=null;

        Scanner scan=new Scanner( System.in );

        System.out.println("Wybierz rodzaj wysyłki (Poczta, Paczka, Kurier, Gołąb, Dron)");

        if(scan.hasNextLine()){
            String rodzaj= scan.nextLine();

            wysyłka= fabryka.nowaWysyłka(rodzaj);
        }
        if(wysyłka !=null){
            wysyłka.send();
        }else
        {
            System.out.println("Wybrano rodzaj wysyłki, który nie istnieje");
        }
    }
}
