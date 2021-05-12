package z3.klasy.dodatki;

import z3.klasy.Pizza;

public class DodatkowySer extends Dodatki{
    public double cena=1;
    public DodatkowySer (Pizza nowa) {
        super( nowa );
    }
    public DodatkowySer () { }

    @Override
    public String opis () {
        return super.opis()+"Dodatkowy Ser";
    }
    @Override
    public String getOpis () {
        return super.getOpis()+"Dodatkowy Ser, ";
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }
}
