package z5;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Obserwator{

    double minimalnaCena;
    List kupioneSpolki;

    public Bank(){
        this.minimalnaCena=10000.0;
        this.kupioneSpolki=new ArrayList<>();
    }

    public String kupSpolke(String nazwa,double cena){
        String wynik="Bank nie dokonał zakupu spółek";
        if(cena > this.minimalnaCena){
            this.kupioneSpolki.add( nazwa );
            wynik="Bank dokonał zakupu spółki: "+nazwa+" za "+cena+" zł";
        }
        return wynik;
    }

    @Override
    public void aktualizuj (String nazwa,double cena,double cenaPoprzednia) {
        System.out.println();
        System.out.println("Bank");
        System.out.println();
        System.out.println("Kupione spółki");
        for(int i=0;i<kupioneSpolki.size();i++){
            System.out.println(kupioneSpolki.get( i ));
        }
        System.out.println();
        System.out.println("Na giełdzie nastąpiły zmiany");
        System.out.println();
        System.out.println(kupSpolke(nazwa,cena ));
    }
}
