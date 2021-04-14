package z3.postac;

import z3.bron.Miecz;

public class Rycerz implements Postac {
    @Override
    public void display () {
        System.out.println("Rycerz");
    }
    Miecz bron= new Miecz();

    @Override
    public void equip () {
        this.display();
        bron.wyposaz();
    }

    @Override
    public void prezentujBron () {
        bron.prezentuj();
    }
}
