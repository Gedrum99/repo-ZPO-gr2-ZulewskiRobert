package polecenieZ1;

public class Bank {
    public Operacja wpłata(Konto account){
        Operacja o=new Wpłata(account);
        return o;
    }
    public Operacja wypłata(Konto account){
        Operacja o=new Wypłata(account);
        return o;
    }
    public Operacja przelew(Konto from,Konto to){
        Operacja o=new Przelew(from, to);
        return o;
    }
}
