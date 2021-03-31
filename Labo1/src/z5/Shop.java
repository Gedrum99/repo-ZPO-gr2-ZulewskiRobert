package z5;

import z5.countries.Country;
import z5.countries.Germany;
import z5.countries.Poland;
import z5.countries.UK;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {
        Germany germany = new Germany();
        Poland poland = new Poland();
        UK uk = new UK();

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(germany);
        countries.add(poland);
        countries.add(uk);

        for(Country country : countries){
            country.display();
            country.getTax();
        }

    }
}