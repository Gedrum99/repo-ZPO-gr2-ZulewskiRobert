package z3.postac;

import z3.bron.Karabin;

public class Strzelec implements Postac {
    @Override
    public void display () {
        System.out.println("Strzelec");
    }
    Karabin bron= new Karabin();

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
