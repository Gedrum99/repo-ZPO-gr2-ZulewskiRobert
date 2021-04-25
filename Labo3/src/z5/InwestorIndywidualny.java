package z5;

import java.util.ArrayList;
import java.util.List;

public class InwestorIndywidualny implements Obserwator{
    //metoda wywoływana do kupna spółki; zwraca String z informacją jaka spółka, ile akcji i za ile kupione
    //metoda wywoływana do sprzedaży spółki; zwraca String z informacją jaka spółka, ile akcji i za ile sprzedane
    List s;
    List w;
    List kupioneSpolki;

    public InwestorIndywidualny(){
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.kupioneSpolki = new ArrayList();
    }

    public String kupSpolke(String nazwa,double cena,double cenaPoprzednia){

        String wynik="Inwestor indywidualny nie dokonał zakupu";
        if(kupioneSpolki.indexOf( nazwa )<0) {
            if (cena * 0.95 < cenaPoprzednia) {
                wynik = "Inwestor Indiwidualny dokonał zakupu spółki: " + nazwa + " za " + cena + "zł ";
                this.kupioneSpolki.add( nazwa );
            }
        }
        return wynik;
    }

    public String SprzedajSpolke(String nazwa,double cena,double cenaPoprzednia){
        String wynik="Inwestor indywidualny nic nie sprzedał";
        if(cena>cenaPoprzednia*1.1) {
            int x = kupioneSpolki.indexOf( nazwa );
            if (x >= 0) {
                kupioneSpolki.remove( x );
                wynik="Inwestor indywidualny sprzedał spółkę: "+nazwa+" za "+cena+"zł";
            }
        }
        return wynik;
    }
    @Override
    public void aktualizuj (String nazwa,double cena,double cenaPoprzednia) {
        System.out.println();
        System.out.println("Inwestor indywidualny");
        System.out.println();
        System.out.println("Kupione spółki");
        for(int i=0;i<kupioneSpolki.size();i++){
            System.out.println(kupioneSpolki.get( i ));
        }
        System.out.println();
        System.out.println("Na giełdzie nastąpiły zmiany");
        System.out.println();
        System.out.println(kupSpolke(nazwa,cena,cenaPoprzednia ));
        System.out.println(SprzedajSpolke(nazwa,cena,cenaPoprzednia ));
    }
}
