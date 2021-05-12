package z3.Obserwator;

public class O3 implements Obserwator{
    public int nr=3;
    boolean czyAktywny=false;
    public String name="3. Tylko liczby podzielne przez 2 ";
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
