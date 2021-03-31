package z5.taxes;

public class TaxUK implements Tax {
    @Override
    public double calculateTax() {
        double tax = 17.01;
        System.out.println("Obliczony podatek dla klientów z Wielkiej Brytani "+tax);
        return tax;
    }
}