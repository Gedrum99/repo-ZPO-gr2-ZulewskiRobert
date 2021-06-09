package z3;

import java.util.concurrent.TimeUnit;

public class Autoryzacja {
    State błądAutoryzacji;
    State poważnyBłądAutoryzacji;
    State poprawnaAutoryzacja;
    State autoryzacjaStan;
    int nBłędów=0;

    public Autoryzacja(){
        this.błądAutoryzacji=new BłądAutoryzacjiStan( this );
        this.poważnyBłądAutoryzacji=new BłądAutoryzacji3RazyStan( this );
        this.poprawnaAutoryzacja=new PoprawnaAutoryzacjaStan( this );
    }

    public void SprawdzanieStan() throws InterruptedException {
        if(autoryzacjaStan==poważnyBłądAutoryzacji && nBłędów==3){
            poważnyBłądAutoryzacji.zablokuj();
            poważnyBłądAutoryzacji.error();
            System.out.println();
            for(int i=30;i>0;i--){
                System.out.println(i);
                Thread.sleep( 1000 );
            }
            System.out.println();
            poważnyBłądAutoryzacji.odblokuj();
            nBłędów=0;
        }
        if(autoryzacjaStan==błądAutoryzacji){
            nBłędów+=1;
            błądAutoryzacji.error();
            System.out.println("Błąd nr "+ nBłędów);
        }
        if(autoryzacjaStan==poprawnaAutoryzacja){
            System.out.println("Uzyskałeś autoryzację");
            nBłędów=0;
        }
    }

    public void setAutoryzacjaStan (State autoryzacjaStan) throws InterruptedException {
        this.autoryzacjaStan = autoryzacjaStan;
        SprawdzanieStan();
    }

    public State getBłądAutoryzacji () {
        return błądAutoryzacji;
    }

    public State getPoprawnaAutoryzacja () {
        return poprawnaAutoryzacja;
    }

    public State getPoważnyBłądAutoryzacji () {
        return poważnyBłądAutoryzacji;
    }
}
