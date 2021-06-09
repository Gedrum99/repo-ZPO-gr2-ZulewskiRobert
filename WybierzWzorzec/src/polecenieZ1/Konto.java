package polecenieZ1;

public class Konto extends Bank{
    long balance=1000;
    String nazwa;


    public Konto(String name){
        this.nazwa=name;
    }

    public long getBalance () {
        return balance;
    }

    public String getNazwa(){
        return nazwa;
    }

    public void wykonajOperację(Operacja operacja){
        operacja.wykonaj();
    }
}
