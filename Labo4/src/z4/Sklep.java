package z4;

import z4.klasy.Paragon;
import z4.klasy.Zakup;
import z4.klasy.dodatki.Maskotka;
import z4.klasy.dodatki.Rabat;
import z4.klasy.dodatki.Smycz;
import z4.klasy.dodatki.Transport;
import z4.klasy.przedmioty.Przedmiot1;
import z4.klasy.przedmioty.Przedmiot2;
import z4.klasy.przedmioty.Przedmiot3;
import z4.klasy.przedmioty.Przedmiot4;

import java.util.Random;
import java.util.Scanner;

public class Sklep {
    public static void main(String []args){
        Random rand = new Random();
        int n = rand.nextInt(5);
        Scanner scan=new Scanner( System.in );
        while(true){

            System.out.println("Czy chcesz zrobić zakupy?");
            System.out.println("1.tak");
            System.out.println("2.nie");
            int answer= scan.nextInt();
            scan.nextLine();
            if(answer==1){
                Zakup nowy=new Paragon();
                System.out.println("Co chcesz kupić?");
                while(true){
                    System.out.println("Przedmioty z oferty sklepu: ");
                    System.out.println("1.Przedmiot 1");
                    System.out.println("2.Przedmiot 2");
                    System.out.println("3.Przedmiot 3");
                    System.out.println("4.Przedmiot 4");
                    System.out.println("5.Mam już wszystko czego potrzebuję");
                    System.out.println();
                    System.out.println("Co wybierasz z oferty sklepu:");
                    answer=scan.nextInt();
                    scan.nextLine();
                    if(answer==1){
                        Zakup inny=new Przedmiot1( nowy );
                        nowy=inny;
                        continue;
                    }
                    if(answer==2){
                        Zakup inny=new Przedmiot2( nowy );
                        nowy=inny;
                        continue;
                    }
                    if(answer==3){
                        Zakup inny=new Przedmiot3( nowy );
                        nowy=inny;
                        continue;
                    }
                    if(answer==4){
                        Zakup inny=new Przedmiot4( nowy );
                        nowy=inny;
                        continue;
                    }
                    if(answer==5){
                        break;
                    }
                }
                if(n>0){
                    System.out.println("Sprzedawca postanowił dodać kilka dodatkow");
                    for(int i=0;i<n;i++)
                    {
                        int x=rand.nextInt(4)+1;
                        if(x==1){
                            Zakup inny=new Maskotka( nowy );
                            nowy=inny;
                        }
                        if(x==2){
                            Zakup inny=new Smycz( nowy );
                            nowy=inny;
                        }
                        if(x==3){
                            Zakup inny=new Rabat( nowy );
                            nowy=inny;
                        }
                        if(x==4){
                            Zakup inny=new Transport( nowy );
                            nowy=inny;
                        }
                    }
                    System.out.print(nowy.getOpis());
                    System.out.println("Razem: "+nowy.getCena()+" zł");
                    break;
                }
                if(n==0){
                    System.out.println("Sprzedawca nie postanowił dodać żadnych dodatków");
                    System.out.print(  nowy.getOpis());
                    System.out.println(nowy.getCena());
                    break;
                }
            }
            else{
                System.out.println("W takim razie dziękuję za wizytę, zapraszam ponownie, najlepiej z zamiarem kupna czegoś");
                break;
            }
        }
    }
}
