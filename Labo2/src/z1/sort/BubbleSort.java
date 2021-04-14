package z1.sort;

import z1.ducks.Duck;

import java.util.List;

public class BubbleSort extends Sort implements SortListOrArray {
    public BubbleSort(){
        this.name = "BubbleSort";
    }

    @Override
    public String getSortName() {
        return this.name;
    }

    @Override
    public List<Duck> sort(List<Duck> ducks) {
        Duck temp;
        int change = 1;
        while(change > 0){
            change = 0;
            for(int i=0; i<ducks.size()-1; i++){
                if(ducks.get(i).getName().compareTo(ducks.get(i+1).getName()) > 0){
                    temp = ducks.get(i+1);
                    ducks.set(i+1 ,ducks.get(i));
                    ducks.set(i, temp);
                    change++;
                }
            }
        }
        return ducks;
    }

    @Override
    public Duck[] sort(Duck[] ducks) {
        Duck temp;
        int change = 1;
        while(change > 0){
            change = 0;
            for(int i=0; i<ducks.length-1; i++){
                if(ducks[i].getName().compareTo(ducks[i+1].getName()) > 0){
                    temp = ducks[i+1];
                    ducks[i+1] = ducks[i];
                    ducks[i] = temp;
                    change++;
                }
            }
        }
        return ducks;
    }
}
