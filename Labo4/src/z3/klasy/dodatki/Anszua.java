package z3.klasy.dodatki;

import z3.klasy.Pizza;

public class Anszua extends Dodatki{
    public double cena=5;

    public Anszua(){}

    public Anszua (Pizza nowa) {
        super( nowa );
    }
    @Override
    public String opis () {
        return super.opis()+"Anszua";
    }
    @Override
    public String getOpis () {
        return super.getOpis()+"Anszua, ";
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }
}
