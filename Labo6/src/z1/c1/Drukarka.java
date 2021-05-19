package z1.c1;

import java.util.ArrayList;
import java.util.List;

public class Drukarka {
    public Drukarka(){
    }

    public void Drukuj(int lista[]){
        System.out.println("Pobrane liczby: ");
        for(int i=0;i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
    }
}
