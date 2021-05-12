package z1.fabryka;

import z1.fabryka.wysyłka.*;

public class FabrykaWysyłek {

    public Wysyłka nowaWysyłka(String nowy){
        Wysyłka wysyłka = null;

        if(nowy.equals( "Poczta" )){
            return new Poczta();
        }else
        if(nowy.equals( "Paczka" )){
            return new Paczka();
        }else
        if(nowy.equals( "Gołąb" )){
            return new Gołąb();
        }else
        if(nowy.equals( "Kurier" )){
            return new Kurier();
        }else
        if(nowy.equals( "Dron" )){
            return new Dron();
        }
        else return null;
    }
}
