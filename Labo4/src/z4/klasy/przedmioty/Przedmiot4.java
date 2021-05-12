package z4.klasy.przedmioty;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Przedmiot4 extends Dodatki {
    public double cena=6.50;


    public Przedmiot4 (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Przedmiot 4 "+ cena +" zł\n";
    }
}
