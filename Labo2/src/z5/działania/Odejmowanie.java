package z5.działania;

public class Odejmowanie implements Działanie{
    public int waga=1;
    public String symbol="-";
    @Override
    public int getWaga () {
        return waga;
    }

    @Override
    public String getSymbol () {
        return symbol;
    }
}
