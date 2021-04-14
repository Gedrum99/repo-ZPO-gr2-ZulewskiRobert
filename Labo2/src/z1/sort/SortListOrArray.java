package z1.sort;

import z1.ducks.Duck;

import java.util.ArrayList;
import java.util.List;

public interface SortListOrArray {
    List<Duck> sort(List<Duck> ducks);
    Duck[] sort(Duck[] ducks);

    String getSortName();

    default void display(Duck[] ducks){
        for(int i=0; i < ducks.length; i++){
            System.out.println(ducks[i].getName());
        }
    }

    default void display(List<Duck> ducks){
        for(int i=0; i < ducks.size(); i++){
            System.out.println(ducks.get(i).getName());
        }
    }
}