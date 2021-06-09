package z2;

public class Telewizor {
    State włączony;
    State wyłączony;
    int kanał=1;
    int ilośćKanałów=30;
    State state;

    public Telewizor(){
        włączony=new Włączony(this);
        wyłączony=new Wyłączony(this);

        state=wyłączony;
    }

    void setState(State newState){
        state=newState;
    }

    public void włącz(){
        state.włącz();
    }

    public void wyłącz(){
        state.wyłącz();
    }

    public void kanałDoPrzodu(){
        kanał++;
        if(kanał>ilośćKanałów){
            kanał=0;
        }
    }

    public void kanałDoTyłu(){
        kanał--;
        if(kanał<=0){
            kanał=ilośćKanałów;
        }
    }

    public void wysNrKanału(){
        System.out.println(kanał);
    }
    
    public State getWłączony(){ return włączony;}
    public State getWyłączony(){ return wyłączony;}
}
