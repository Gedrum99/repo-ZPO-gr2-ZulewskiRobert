package z2;

public class Włączony implements State{
    Telewizor telewizor;

    public Włączony(Telewizor telewizor){
        this.telewizor=telewizor;
    }

    @Override
    public void włącz () {
        System.out.println("Telewizor jest już włączony");
    }

    @Override
    public void wyłącz () {
        System.out.println("Wyłączasz telewizor");
        telewizor.setState( telewizor.getWyłączony() );
    }

    @Override
    public void przełączDoPrzodu () {
        telewizor.kanałDoPrzodu();
        System.out.println("Zmieniono kanał na "+telewizor.kanał);
    }

    @Override
    public void przełączDoTyłu () {
        telewizor.kanałDoTyłu();
        System.out.println("Zmieniono kanał na "+telewizor.kanał);
    }

    @Override
    public void wysNrKanału () {
        System.out.println("Obecny kanał "+telewizor.kanał);
    }
}
