package z4;

public class Sycylijska extends KlasaAbstrakcyjna {
    @Override
    void PrzygotujCiasto () {
        System.out.println("Przygotowuję grube ciasto");
    }

    @Override
    void DodajSosPomidorowy () {
        System.out.println("Dodaję sos pomidorowy");
    }

    @Override
    void DodajSer () {

    }

    @Override
    void DodajTopping () {
        System.out.println("Dodaję oliwki i kapary");
    }

    @Override
    void DodajPrzyprawy () {
        System.out.println("Dodaję przyprawy");
    }
}
