package z1.c2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Plik {
    private int lista[];

    public Plik(int n){
        lista=new int[n];
    }
    public int[] Odczytaj() throws FileNotFoundException {
        File plik=new File( "tablica.txt" );
        int miejsce=0;
        Scanner odczyt=new Scanner( plik ).useDelimiter( ", " );
        while(odczyt.hasNext()){
            String x=odczyt.next();
            int liczba=Integer.parseInt( x );
            for(int i=0;i<lista.length;i++)
            {
                lista[miejsce]=liczba;
                miejsce++;
                break;
            }
            System.out.println(miejsce);
            if(miejsce>=lista.length){
                break;
            }
        }
        return lista;
    }
}
