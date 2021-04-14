package z3;

import z3.postac.Kanonier;
import z3.postac.Rycerz;
import z3.postac.Strzelec;
import z3.postac.Łucznik;
import z3.postac.Postac;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        System.out.println("Wprowadzić postacie!");
        System.out.println();
        Kanonier kan=new Kanonier();
        Rycerz ryc=new Rycerz();
        Łucznik łuk = new Łucznik();
        Strzelec str=new Strzelec();

        ArrayList<Postac>postacie=new ArrayList<Postac>();
        postacie.add(kan);
        postacie.add(ryc);
        postacie.add(łuk);
        postacie.add(str);
        System.out.println();

        for(Postac postac:postacie){
            postac.display();
        }

        System.out.println();
        System.out.println("Wyposażcie się w broń!!");
        System.out.println();

        for(Postac postac:postacie){
            postac.equip();
        }

        System.out.println();
        System.out.println("Teraz ją zaprezentujcie");
        System.out.println();

        for(Postac postac:postacie){
            postac.display();
            postac.prezentujBron();
        }
    }
}
