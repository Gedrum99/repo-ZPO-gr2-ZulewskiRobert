package z3.Obserwator;

public class O2 implements Obserwator{
    public int nr=2;
    boolean czyAktywny=false;
    public String name="2. Tylko liczby równe 3 ";
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
