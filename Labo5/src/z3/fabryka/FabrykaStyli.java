package z3.fabryka;


import z3.fabryka.meble.style.ArtDeco;
import z3.fabryka.meble.style.Nowoczesny;
import z3.fabryka.meble.style.Styl;
import z3.fabryka.meble.style.Wiktoriański;

public class FabrykaStyli {
    public Styl nowyStyl(String nowy){
        Styl styl = null;

        if(nowy.equals( "ArtDeco" )){
            return new ArtDeco();
        }else
        if(nowy.equals( "Nowoczesny" )){
            return new Nowoczesny();
        }else
        if(nowy.equals( "Wiktoriański" )){
            return new Wiktoriański();
        }
        else return null;
    }
}
