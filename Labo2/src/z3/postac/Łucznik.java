package z3.postac;

import z3.bron.Łuk;

public class Łucznik implements Postac{
    @Override
    public void display () {
        System.out.println("Łucznik");
    }
    Łuk bron= new Łuk();

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
