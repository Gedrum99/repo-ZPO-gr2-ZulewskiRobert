package z5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gielda implements Podmiot {
    List<Obserwator>obserwatorzy;
    List spółki;
    List wycena;
    List poprzedniaWycena;
    String obecnaSpolka;



    public Gielda () {
        this.spółki=new ArrayList();
        this.obserwatorzy=new ArrayList<>();
        this.wycena=new ArrayList();
        this.poprzedniaWycena=new ArrayList();

    }
    public void dodajSpółkę(String nazwa, double cena) {
        System.out.println("Nowa spólka: "+ nazwa+" wycena: "+cena);
        this.spółki.add( nazwa );
        this.wycena.add( cena );
        this.poprzedniaWycena.add(0.0);
        this.obecnaSpolka=nazwa;
        aktualizujObserwatorow ();
    }

    public void usuńSpółkę(String nazwa) {
        int x = this.spółki.indexOf( nazwa );
        this.obecnaSpolka=nazwa;
        if (x >= 0){
            this.spółki.remove( nazwa );
            this.wycena.remove( nazwa );
            this.poprzedniaWycena.remove( nazwa );
        }
    }

    public void zmieńCenę(String nazwa, double nowaCena) {
        int x = this.spółki.indexOf( nazwa );
        this.poprzedniaWycena.set( x,this.wycena.get( x ) );
        this.wycena.set( x,(double)nowaCena );
        this.obecnaSpolka=nazwa;
        System.out.println("Nastąpiła zmiana spółki: "+nazwa+" wycena wynosi: "+(double)nowaCena+" z poprzedniej wyceny: "+(double)poprzedniaWycena.get( x ));
        aktualizujObserwatorow ();
        
    }

    @Override
    public void dodajObserwatora (Obserwator o) {
        this.obserwatorzy.add( o );
    }

    @Override
    public void usunObserwatora (Obserwator o) {
        this.obserwatorzy.remove( o );
    }

    @Override
    public void aktualizujObserwatorow () {
        int x= spółki.indexOf(obecnaSpolka);
        for(Obserwator o:obserwatorzy){
            o.aktualizuj(obecnaSpolka,(double)wycena.get( x ),(double)poprzedniaWycena.get( x ));
        }
    }
}
