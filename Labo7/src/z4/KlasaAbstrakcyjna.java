package z4;

public abstract class KlasaAbstrakcyjna {
    final void Przygotowanie(){
        PrzygotujCiasto();
        DodajSosPomidorowy();
        DodajSer();
        DodajTopping();
        DodajPrzyprawy();
        Piecz();
        System.out.println();
    }

    abstract void PrzygotujCiasto();

    abstract void DodajSosPomidorowy();

    abstract void DodajSer();

    abstract void DodajTopping();

    abstract void DodajPrzyprawy();

    final void Piecz(){
        System.out.println("Pieczę przez 15 minut");
    }

}
