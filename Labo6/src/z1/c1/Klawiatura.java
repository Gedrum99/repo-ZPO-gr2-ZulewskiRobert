package z1.c1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Klawiatura {
    private int liczby[];

    public Klawiatura(){
    }

    public int[] Pobierz(int n){
        liczby=new int[n];
        Scanner scan = new Scanner( System.in );
        for(int i=0;i<n;i++){
            int liczba=scan.nextInt();
            liczby[i]=liczba;
        }
        return liczby;
    }
}