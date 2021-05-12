package z3.klasy.dodatki;

import z3.klasy.Pizza;

public class Szynka extends Dodatki{
    public double cena=1.5;

    public Szynka () { }
    public Szynka (Pizza nowa) {
        super( nowa );
    }
    @Override
    public String opis () {
        return super.opis()+"Szynka";
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Szynka, ";
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }
}
