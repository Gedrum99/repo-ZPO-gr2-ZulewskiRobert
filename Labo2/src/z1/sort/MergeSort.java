package z1.sort;

import z1.ducks.Duck;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends Sort implements SortListOrArray {

    public MergeSort(){
        this.name = "MergeSort";
    }

    @Override
    public Duck[] sort(Duck[] ducks) {
        int n = ducks.length;
        if (n < 2) {
            return ducks;
        }
        int mid = n / 2;
        Duck[] l = new Duck[mid];
        Duck[] r = new Duck[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = ducks[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = ducks[i];
        }
        sort(l);
        sort(r);

        merge(ducks, l, r, mid, n - mid);

        return ducks;
    }

    @Override
    public String getSortName() {
        return this.name;
    }

    public static void merge( Duck[] a, Duck[] l, Duck[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getName().compareTo(r[j].getName()) < 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    @Override
    public List<Duck> sort(List<Duck> ducks) {
        int n = ducks.size();
        if (n < 2) {
            return ducks;
        }
        int mid = n / 2;
        List<Duck> l = new ArrayList<Duck>();
        List<Duck> r = new ArrayList<Duck>();

        for (int i = 0; i < mid; i++) {
            l.add(ducks.get(i) );
        }
        for (int i = mid; i < n; i++) {
            r.add( ducks.get(i));
        }
        sort(l);
        sort(r);

        merge(ducks, l, r, mid, n - mid);

        return ducks;
    }

    public void merge( List<Duck> a, List<Duck> l, List<Duck> r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l.get(i).getName().compareTo(r.get(j).getName()) < 0) {
                a.set(k++, l.get(i++));
            }
            else {
                a.set(k++,r.get(j++));
            }
        }
        while (i < left) {
            a.set(k++, l.get(i++));
        }
        while (j < right) {
            a.set(k++, r.get(j++));
        }
    }
}
