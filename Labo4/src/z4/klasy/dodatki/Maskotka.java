package z4.klasy.dodatki;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Maskotka extends Dodatki {
    public double cena=0;


    public Maskotka (Zakup nowy) {
        super( nowy );
    }


    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Maskotka sklepu "+ cena +" zł\n";
    }
}
