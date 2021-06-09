package obserwatorZ2;

import java.util.ArrayList;
import java.util.List;

public class Bank implements Podmiot{
    List<Konto>obserwators;
    String nazwa;

    public Bank(String nazwa){
        this.nazwa=nazwa;
        this.obserwators=new ArrayList<>();
    }


    @Override
    public void dodajObserwatora (Konto obserwator) {
        obserwators.add( obserwator );
    }

    @Override
    public void usunObserwatora (Konto obserwator) {
        obserwators.remove( obserwator );
    }

    @Override
    public void aktualizujObserwatora (String komunikat) {
        for(Konto o:obserwators){
            if(o.isZgoda()){
                o.aktualizuj( komunikat );
            }
        }
    }
}
