package z2;

public class Pilot {
    Telewizor telewizor;
    Włączony włączony;
    Wyłączony wyłączony;

    public Pilot(Telewizor telewizor){
        this.telewizor=telewizor;
        this.włączony=new Włączony( this.telewizor );
        this.wyłączony=new Wyłączony( this.telewizor );

    }

    public void włącz(){
        if(telewizor.state==telewizor.getWłączony()) {
            włączony.włącz();
        }else{
            wyłączony.włącz();
        }
    }

    public void wyłącz(){
        if(telewizor.state==telewizor.getWyłączony()) {
            wyłączony.wyłącz();
        }else{
            włączony.wyłącz();
        }
    }

    public void kanałDoPrzodu(){
        if(telewizor.state== telewizor.getWłączony()){
            włączony.przełączDoPrzodu();
        }else
            wyłączony.przełączDoPrzodu();
    }

    public void kanałDoTyłu(){
        if(telewizor.state== telewizor.getWłączony()){
            włączony.przełączDoTyłu();
        }else
            wyłączony.przełączDoTyłu();
    }

    public void wysNrKanału(){
        if(telewizor.state== telewizor.getWłączony()){
            włączony.wysNrKanału();
        }else
            wyłączony.wysNrKanału();
    }
}
