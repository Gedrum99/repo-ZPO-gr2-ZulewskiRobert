package z4.klasy.dodatki;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Smycz extends Dodatki {
    public double cena=1;


    public Smycz (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Smycz do Pendrive'a "+ cena +" zł\n";
    }
}
