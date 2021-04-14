package z3.postac;

import z3.bron.*;

public class Kanonier implements Postac{
    @Override
    public void display () {
        System.out.println("Kanonier");
    }
    Działo bron= new Działo();

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
