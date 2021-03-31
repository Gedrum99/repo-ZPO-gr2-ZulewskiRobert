package z5.taxes;

public class TaxGermany implements Tax {
    @Override
    public double calculateTax() {
        double tax = 13.01;
        System.out.println("Obliczony podatek dla klientów z Niemiec "+tax);
        return tax;
    }
}