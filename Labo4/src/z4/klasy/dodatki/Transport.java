package z4.klasy.dodatki;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Transport extends Dodatki {
    public double cena=13;


    public Transport (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Dodatkowy transport "+ cena +" zł\n";
    }
}
