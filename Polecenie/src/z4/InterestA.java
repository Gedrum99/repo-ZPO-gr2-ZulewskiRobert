package z4;

public class InterestA implements Interest {
    String name="InterestA";
    double interest=0.1;

    public String getName(){
        return name;
    }
    @Override
    public void compute () {
        System.out.println("Computing InterestA");
        System.out.println("InterestA = "+interest+"%");
    }
}
