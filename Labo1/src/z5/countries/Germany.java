package z5.countries;

import z5.taxes.TaxGermany;

public class Germany extends Country {
    public Germany(){
        this.tax = new TaxGermany();
    }

    public void display(){
        System.out.println(" -- Germany -- ");
    }
}