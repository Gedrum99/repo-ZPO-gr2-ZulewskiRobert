package z3.Obserwator;

public interface Obserwator {
    int nr=0;
    String name="";
    boolean czyAktywny=false;
    void aktualizuj();
    int getNr();
    void setCzyAktywny(boolean bool);
    boolean getCzyAktywny();
    String getName();
}
