package z4.klasy.przedmioty;

import z4.klasy.Dodatki;
import z4.klasy.Zakup;

public class Przedmiot2 extends Dodatki {
    public double cena=15;


    public Przedmiot2 (Zakup nowy) {
        super( nowy );
    }

    @Override
    public double getCena () {
        return super.getCena()+cena;
    }

    @Override
    public String getOpis () {
        return super.getOpis()+"Przedmiot 2 "+ cena +"\n";
    }
}
