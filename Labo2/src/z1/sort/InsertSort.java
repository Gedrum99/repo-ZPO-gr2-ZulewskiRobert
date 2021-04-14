package z1.sort;

import z1.ducks.Duck;

import java.util.List;

public class InsertSort extends Sort implements  SortListOrArray {
    public InsertSort(){
        this.name = "InsertSort";
    }

    @Override
    public String getSortName() {
        return this.name;
    }

    @Override
    public Duck[] sort(Duck[] ducks) {
        int n = ducks.length;
        for (int i = 1; i < n; ++i) {
            Duck key = ducks[i];
            int j = i - 1;

            while (j >= 0 && ducks[j].getName().compareTo( key.getName()) > 0) {
                ducks[j + 1] = ducks[j];
                j = j - 1;
            }
            ducks[j + 1] = key;
        }
        return ducks;
    }


    @Override
    public List<Duck> sort(List<Duck> ducks) {
        int n = ducks.size();
        for (int i = 1; i < n; ++i) {
            Duck key = ducks.get(i);
            int j = i - 1;

            while (j >= 0 && ducks.get(j).getName().compareTo( key.getName()) > 0) {
                ducks.set(j + 1, ducks.get(j));
                j = j - 1;
            }
            ducks.set(j + 1, key);
        }
        return ducks;
    }


}
