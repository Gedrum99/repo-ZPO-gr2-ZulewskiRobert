package z3;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scan = new Scanner( System.in );
        Boolean Z1 = false;
        Boolean Z2 = false;
        Boolean Z3 = false;
        Boolean Z4 = true;
        Boolean O1 = false;
        int liczba = 1;
        while(true) {
            while (Z4) {
                liczba = scan.nextInt();
                System.out.println( liczba );
                if (liczba == 0) {
                    Z4 = false;
                }
            }
            if (liczba == 0) {
                System.out.println( "Wybierz program: " );
                System.out.println( "1. Tylko liczby większe od zera" );
                System.out.println( "2. Tylko liczby równe 3" );
                System.out.println( "3. Tylko liczby podzielne przez 2" );
                liczba = scan.nextInt();
                if (liczba == 1) {
                    System.out.println("Wchodzisz w inny wymiar");
                    Z1 = true;
                    while (Z1) {
                        liczba = scan.nextInt();
                        if (liczba > 0) {
                            System.out.println( liczba );
                        }
                        if (liczba == 0) {
                            Z1 = false;
                            Z4 = true;
                            System.out.println("Wydostałeś się z tej pętli jesteś obecnie w pierwszym wymiarze");
                        }
                    }
                }
                if (liczba == 2) {
                    System.out.println("Wchodzisz w inny wymiar");
                    Z2 = true;
                    while (Z2) {
                        liczba = scan.nextInt();
                        if (liczba == 3) {
                            System.out.println( liczba );
                        }
                        if (liczba == 0) {
                            Z2 = false;
                            Z4 = true;
                            System.out.println("Wydostałeś się z tej pętli jesteś obecnie w pierwszym wymiarze");
                        }
                    }
                }
                if (liczba == 3) {
                    System.out.println("Wchodzisz w inny wymiar");
                    Z3 = true;
                    while (Z3) {
                        liczba = scan.nextInt();
                        if (liczba % 2 == 0) {
                            System.out.println( liczba );
                        }
                        if (liczba == 0) {
                            Z3 = false;
                            Z4 = true;
                            System.out.println("Wydostałeś się z tej pętli jesteś obecnie w pierwszym wymiarze");
                        }
                    }
                }
            }
        }
    }
}
