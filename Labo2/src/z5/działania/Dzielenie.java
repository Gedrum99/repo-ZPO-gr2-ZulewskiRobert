package z5.działania;

public class Dzielenie implements Działanie{
    public int waga=2;
    public String symbol="/";

    @Override
    public String getSymbol () {
        return symbol;
    }

    @Override
    public int getWaga () {
        return waga;
    }
}
