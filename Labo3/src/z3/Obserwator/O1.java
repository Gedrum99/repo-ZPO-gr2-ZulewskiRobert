package z3.Obserwator;

public class O1 implements Obserwator{
    public int nr=1;
    boolean czyAktywny=false;
    public String name="1. Tylko liczby większe od zera ";
    @Override
    public void aktualizuj () {
        czyAktywny=!czyAktywny;
    }

    @Override
    public int getNr () {
        return nr;
    }
    @Override
    public void setCzyAktywny (boolean bool) {
        czyAktywny=bool;
    }
    @Override
    public boolean getCzyAktywny () {
        return czyAktywny;
    }
    @Override
    public String getName () {
        return name;
    }
}
