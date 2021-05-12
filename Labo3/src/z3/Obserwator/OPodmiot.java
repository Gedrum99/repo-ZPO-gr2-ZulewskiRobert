package z3.Obserwator;

import java.util.ArrayList;

public class OPodmiot implements Podmiot{
    public boolean czyAktywny=true;
    public int liczba=0;
    public ArrayList<Obserwator>obserwatorzy = new ArrayList<Obserwator>();
    @Override
    public void dodajObserwatora (Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    @Override
    public void usunObserwatora (Obserwator obserwator) {
        ArrayList<Obserwator>obserwatorn=new ArrayList<>();
        for(int i=0;i<obserwatorzy.size();i++)
        {
            if(obserwatorzy.get( i )==obserwator)
            {
                obserwatorzy.set( i,null );
            }
            if(obserwatorzy.get( i )!=null)
            {
                obserwatorn.add(obserwatorzy.get( i ));
            }
        }
        obserwatorzy=obserwatorn;
    }

    @Override
    public void aktualizujObserwatora (int liczba) {
        for(int i=0;i<obserwatorzy.size();i++)
        {
            if(obserwatorzy.get( i ).getNr()==liczba)
            {
                obserwatorzy.get( i ).aktualizuj();
            }
            if(obserwatorzy.get( i ).getNr()!=liczba)
            {
                obserwatorzy.get( i ).setCzyAktywny( false );
            }
        }
    }

    public int sprawdzStan()
    {
        int nr=0;
        for(int i=0;i<obserwatorzy.size();i++){
            if(obserwatorzy.get( i ).getCzyAktywny()==true) {
                nr = obserwatorzy.get( i ).getNr();
            }
        }
        return nr;
    }
}
