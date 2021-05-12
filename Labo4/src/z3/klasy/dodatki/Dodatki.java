package z3.klasy.dodatki;

import z3.klasy.Pizza;
import z3.klasy.Podstawowa;

public abstract class Dodatki implements Pizza {
    protected Pizza pizza;

    public Dodatki(){}
    public Dodatki(Pizza nowa){
        pizza=nowa;
    }

    @Override
    public String opis () {
        return "";
    }

    @Override
    public String getOpis () {
        return pizza.getOpis();
    }

    @Override
    public double getCena () {
        return pizza.getCena();
    }
}
