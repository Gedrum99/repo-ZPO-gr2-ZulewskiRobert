package z6;

import z6.dojazd.Rower;
import z6.praca.RoznoszenieListow;
import z6.wolnyCzas.LiteraturaPopularnoNaukowa;

public class PracownikTest {
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("listonosz");
        p1.setDojezdzac(new Rower());
        p1.setPracowac(new RoznoszenieListow());
        p1.setSpedzanieWolnegoCzasu(new LiteraturaPopularnoNaukowa());

        p1.display();
        p1.pracuj();
        p1.spedzajCzasWolny();
        p1.dojezdzaj();

    }
}