package z3.fabryka;


import z3.fabryka.meble.Fotel;
import z3.fabryka.meble.Mebel;
import z3.fabryka.meble.Sofa;
import z3.fabryka.meble.Stolik;

public class FabrykaMebli {
    public Mebel nowyMebel(String nowy){
        Mebel mebel = null;

        if(nowy.equals( "Fotel" )){
            return new Fotel();
        }else
        if(nowy.equals( "Stolik" )){
            return new Stolik();
        }else
        if(nowy.equals( "Sofa" )){
            return new Sofa();
        }
        else return null;
    }
}
