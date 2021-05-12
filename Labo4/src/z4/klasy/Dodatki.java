package z4.klasy;

import z3.klasy.Pizza;
import z4.klasy.Zakup;

public abstract class Dodatki implements Zakup {
    protected Zakup zakup;

    public Dodatki(){}
    public Dodatki(Zakup nowy){
        zakup=nowy;
    }

    @Override
    public String getOpis () {
        return zakup.getOpis();
    }

    @Override
    public double getCena () {
        return zakup.getCena();
    }
}
