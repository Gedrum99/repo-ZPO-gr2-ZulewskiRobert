package z5.działania;

public class Dodawanie implements Działanie{
    public int waga=1;
    public String symbol="+";
    @Override
    public int getWaga () {
        return waga;
    }

    @Override
    public String getSymbol () {
        return symbol;
    }
}
