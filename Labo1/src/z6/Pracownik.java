package z6;

import z6.dojazd.Dojezdzac;
import z6.praca.Pracowac;
import z6.wolnyCzas.SpedzanieWolnegoCzasu;

public class Pracownik {
    private Pracowac pracowac;
    private Dojezdzac dojezdzac;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private String zawod;

    public Pracownik(String zawod){
        this.zawod = zawod;
    }

    public void setPracowac(Pracowac pracowac){
        this.pracowac = pracowac;
    }
    public void setDojezdzac(Dojezdzac dojezdzac){
        this.dojezdzac = dojezdzac;
    }
    public void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spwc){
        this.spedzanieWolnegoCzasu = spwc;
    }

    public void dojezdzaj(){
        this.dojezdzac.dojezdzaj();
    }
    public void pracuj(){
        this.pracowac.pracuj();
    }
    public void spedzajCzasWolny(){
        this.spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }
    public void display(){
        System.out.println(this.zawod);
    }
}
