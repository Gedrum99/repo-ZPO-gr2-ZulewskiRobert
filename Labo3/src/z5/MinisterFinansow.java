package z5;

import java.util.ArrayList;
import java.util.List;

public class MinisterFinansow implements Obserwator {

    List spółki;
    List wycena;
    List zmianaCeny;

    public MinisterFinansow() {
        this.spółki = new ArrayList();
        this.wycena = new ArrayList();
        this.zmianaCeny = new ArrayList();
    }
    public void diplay(){
        System.out.println();
        for(int i=0; i<this.spółki.size(); i++){
            System.out.println(" "+ (i+1)+". "+spółki.get(i)+" srednia cena: "+( (double)this.wycena.get(i)/(double)this.zmianaCeny.get(i)));
        }
    }
    @Override
    public void aktualizuj (String nazwa,double cena,double cenaPoprzednia) {
        System.out.println();
        System.out.println("Na giełdzie nastąpiły zmiany");
        int x=spółki.indexOf( nazwa );
        if(x<0)
        {
            this.spółki.add( nazwa );
            this.wycena.add( cena );
            this.zmianaCeny.add( 1.0);
        }
        else {
            if((double)this.wycena.get( x )!=cena)
            {
                this.wycena.set( x,(double)this.wycena.get( x )+cena );
                this.zmianaCeny.set( x,(double) this.zmianaCeny.get(x) + 1);
            }
        }
        System.out.println();
        diplay();
    }
}
