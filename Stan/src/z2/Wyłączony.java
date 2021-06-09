package z2;

public class Wyłączony implements State{
    Telewizor telewizor;

    public Wyłączony(Telewizor telewizor){
        this.telewizor=telewizor;
    }
    @Override
    public void włącz () {
        System.out.println("Włączasz telewizor");
        telewizor.setState( telewizor.getWłączony() );
    }

    @Override
    public void wyłącz () {
        System.out.println("Telewizor jest już wyłączony");
    }

    @Override
    public void przełączDoPrzodu () {
        System.out.println("Telewizor jest wyłączony");
    }

    @Override
    public void przełączDoTyłu () {
        System.out.println("Telewizor jest wyłączony");
    }

    @Override
    public void wysNrKanału () {
        System.out.println("Telewizor jest wyłączony");
    }
}
