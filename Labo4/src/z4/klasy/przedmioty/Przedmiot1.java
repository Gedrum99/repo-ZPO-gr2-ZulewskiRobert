package z4.klasy.przedmioty;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Przedmiot1 extends Dodatki {
    public double cena=10;


    public Przedmiot1 (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Przedmiot 1 "+ cena +" zł\n";
    }
}
