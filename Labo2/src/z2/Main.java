package z2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wybierz program (wprowadz odpowiedznią liczbę): ");
        System.out.println("1. DolbyProLogic ");
        System.out.println("2. DolbyDigital ");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input == 1){
            DolbyProLogic dolbyProLogic = new DolbyProLogic();
            dolbyProLogic.program();
        }
        else if(input == 2){
            DolbyDigital dolbyDigital = new DolbyDigital();
            dolbyDigital.program();
        }
        else {
            System.out.println("Nie ma takiego programu");
        }
    }
}