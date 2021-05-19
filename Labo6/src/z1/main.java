package z1;

import z1.c1.FasadaProgram;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner( System.in );
        System.out.println("Podaj wielkość tablicy");
        int n=scan.nextInt();
        scan.nextLine();
        FasadaProgram program=new FasadaProgram( n );
    }
    /* Wydaje mi się, że nie trzeba by stosować wzorca Fasady, aby rozwiązać to rozwiązanie, przynajmniej przy sposobie
    *  w jaki zostało to zadanie wykonane w tym przypadku ( nie wiem czy miało tak być rozwiązane, lecz działa).
    * */
}
