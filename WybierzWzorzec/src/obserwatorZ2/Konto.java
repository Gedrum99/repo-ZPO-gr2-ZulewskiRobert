package obserwatorZ2;

import java.util.ArrayList;
import java.util.List;

public class Konto implements Obserwator{
    List<String>komunikaty;
    String nazwa;
    boolean zgoda=false;

    public Konto(String nazwa, boolean zgoda){
        this.nazwa=nazwa;
        this.zgoda=zgoda;
        this.komunikaty=new ArrayList<>();
    }

    public boolean isZgoda(){
        return this.zgoda;
    }

    public void wysKomunikaty(){
        if(komunikaty.size()>0) {
            for (int i = 0; i < komunikaty.size(); i++) {
                System.out.println( komunikaty.get( i ) );
            }
        }else
            System.out.println("Brak komunikatów");
    }
    public void wysNajnowszyKomunikaty(){
        if(komunikaty.size()>0) {
            System.out.println(komunikaty.get( komunikaty.size()-1 ));
        }else
            System.out.println("Brak komunikatów");
    }

    @Override
    public void aktualizuj (String komunikat) {
        komunikaty.add( komunikat );
    }
}
