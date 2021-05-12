package z3;

import z3.fabryka.FabrykaMebli;
import z3.fabryka.FabrykaStyli;
import z3.fabryka.meble.Mebel;
import z3.fabryka.meble.style.Styl;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        FabrykaMebli fabryka1=new FabrykaMebli();
        FabrykaStyli fabryka2=new FabrykaStyli();
        Mebel mebel=null;
        Styl styl=null;

        Scanner scan=new Scanner( System.in );

        System.out.println("Wybierz Styl który cię interesuje (ArtDeco, Wiktoriański, Nowoczesny)");

        if(scan.hasNextLine()) {
            String wybrany= scan.nextLine();
            styl=fabryka2.nowyStyl( wybrany );

            System.out.println( "Wybierz rodzaj mebla (Fotel, Sofa, Stolik)" );

            if (scan.hasNextLine()) {
                String rodzaj = scan.nextLine();

                mebel = fabryka1.nowyMebel( rodzaj );
                mebel.setStyl( styl );
            }
            if (mebel != null) {
                mebel.display();
            } else {
                System.out.println( "Wybrano rodzaj mebla, który nie istnieje" );
            }
        }
        else{
            System.out.println("Wybrano Styl, który nie jest oferowany przez sklep");
        }
    }
}
