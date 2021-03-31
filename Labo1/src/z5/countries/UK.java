package z5.countries;

import z5.taxes.TaxUK;

public class UK extends Country {
    public UK(){
        this.tax = new TaxUK();
    }
    public void display(){
        System.out.println(" -- UK -- ");
    }
}