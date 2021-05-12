package z4.klasy.dodatki;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Rabat extends Dodatki {
    public double cena=-10;


    public Rabat (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        if((super.getCena()+cena<0)){
            return 0;
        }
        else {
            return super.getCena() + cena;
        }
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Rabat "+ cena +" zł\n";
    }
}
