package z5.countries;

import z5.taxes.TaxPoland;

public class Poland extends Country {
    public Poland(){
        this.tax = new TaxPoland();
    }
    public void display(){
        System.out.println(" -- Poland -- ");
    }
}
