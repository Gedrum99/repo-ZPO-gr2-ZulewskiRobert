package z3.klasy.dodatki;

import z3.klasy.Pizza;

public class Boczek extends Dodatki{
    public double cena=2;

    public Boczek () { }
    public Boczek (Pizza nowa) {
        super( nowa );
    }

    @Override
    public String opis () {
        return super.opis()+"Boczek";
    }

    @Override
    public String getOpis () {
        return super.getOpis() +"Boczek, ";
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }
}
