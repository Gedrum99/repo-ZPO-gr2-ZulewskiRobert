package z4.klasy;

import java.util.ArrayList;
import java.util.List;

public class Paragon implements Zakup{
    public double cena=0;
    public List<Zakup>zakupy=new ArrayList<>();


    public Paragon(){}

    public void DodajDoListy(Zakup zakup){
        zakupy.add( zakup );
    }

    public void Wydrukuj(){
        for(Zakup z:zakupy){
            System.out.print(z.getOpis());
        }
        System.out.println("Cena za zakupy wynosi: "+zakupy.get( zakupy.size()-1 ).getCena());
    }

    @Override
    public double getCena () {
        return cena;
    }

    @Override
    public String getOpis () {
        return "Twoje zakupy zawierają: \n";
    }
}
