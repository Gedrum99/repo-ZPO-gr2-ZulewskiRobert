package z5.taxes;

public class TaxPoland implements Tax {
    @Override
    public double calculateTax() {
        double tax = 15.01;
        System.out.println("Obliczony podatek dla klientów z Polski " + tax);
        return tax;
    }
}
