package z1.sort;

import z1.ducks.Duck;

public interface SortArray {

    Duck[] sort(Duck[] ducks);

    default void display(Duck[] ducks){
        for(int i=0; i < ducks.length; i++){
            System.out.println(ducks[i].getName());
        }
    }
}
