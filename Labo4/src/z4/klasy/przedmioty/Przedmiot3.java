package z4.klasy.przedmioty;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Przedmiot3 extends Dodatki {
    public double cena=13.50;


    public Przedmiot3 (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Przedmiot 3 "+ cena +" zł\n";
    }
}
