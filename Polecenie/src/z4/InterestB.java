package z4;

public class InterestB implements Interest {
    String name="InterestB";
    double interest=0.22;

    public String getName(){
        return name;
    }
    @Override
    public void compute () {
        System.out.println("Computing InterestB");
        System.out.println("InterestA = "+interest+"%");
    }
}
