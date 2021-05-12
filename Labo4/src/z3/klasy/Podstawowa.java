package z3.klasy;

import z3.klasy.składniki.*;

import java.util.ArrayList;
import java.util.List;

public class Podstawowa implements Pizza{

    public String opis="Nazwyklejsza pizza";
    public double cena=16;
    public List<Składnik>składniki=new ArrayList<>();
    public String rozmiar="mała";

    public Podstawowa(){
        składniki.add(new Ser());
        składniki.add(new Sos());
        składniki.add(new Oregano());
        składniki.add(new Bazylia());
    }

    public void ZrezygnujZeSkładnika(String składnik){
        for(Składnik s:składniki){
            if(s.getSkładnik()==składnik){
                składniki.remove( s );
                break;
            }
        }
    }

    public void setRozmiar (String rozmiar) {
        this.rozmiar = rozmiar;
        if(rozmiar=="mała"){
            this.cena=16;
        }
        if(rozmiar=="średnia"){
            this.cena=20;
        }
        if(rozmiar=="duża"){
            this.cena=24;
        }
    }

    public String getSkładniki(){
        String skład=" ";
        for(Składnik s:składniki){
            skład+=s.getSkładnik()+", ";
        }
        return skład;
    }

    @Override
    public double getCena () {
        return cena;
    }

    @Override
    public String getOpis () {
        String skład=" ";
        for(Składnik s:składniki){
            skład+=s.getSkładnik()+", ";
        }
        String wynik=opis+"\n"+"Składniki:\n"+skład+"\nRozmiar: "+rozmiar+"\nDodatki: ";
        return wynik;
    }

    @Override
    public String opis () {
        return null;
    }
}
