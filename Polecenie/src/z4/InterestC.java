package z4;

public class InterestC implements Interest {
    String name="InterestC";
    double interest=0.12;

    public String getName(){
        return name;
    }
    @Override
    public void compute () {
        System.out.println("Computing InterestC");
        System.out.println("InterestA = "+interest+"%");
    }
}
