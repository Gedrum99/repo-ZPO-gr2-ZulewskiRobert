package z2;


import z2.fabryka.FabrykaTransportu;
import z2.fabryka.transport.Transport;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        FabrykaTransportu fabryka = new FabrykaTransportu();

        Transport transport=null;

        Scanner scan=new Scanner( System.in );

        System.out.println("Wybierz rodzaj transportu (Ciężarówka, Statek)");

        if(scan.hasNextLine()){
            String rodzaj= scan.nextLine();

            transport= fabryka.nowyTransport(rodzaj);
        }
        if(transport !=null){
            transport.send();
        }else
        {
            System.out.println("Wybrano rodzaj transportu, który nie istnieje");
        }
    }
}
