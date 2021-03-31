package z5.countries;

import z5.taxes.Tax;

public class Country {
    Tax tax;

    public double getTax(){
        return tax.calculateTax();
    }

    public void display(){
        System.out.println("Kraj");
    }
}