package z3;

public class Konto {
    private String login;
    private String password;
    Autoryzacja autoryzacja;

    public Konto(String login,String password, Autoryzacja autoryzacja){
        this.login=login;
        this.password=password;
        this.autoryzacja=autoryzacja;
    }

    public String getLogin () {
        return login;
    }

    public String getPassword () {
        return password;
    }

    public void zaloguj(String login, String password) throws InterruptedException {
        if((login!=this.login && autoryzacja.nBłędów<=3) || (password!=this.password && autoryzacja.nBłędów<=3) || (login!=this.login && password!=this.password && autoryzacja.nBłędów<=3)){
            autoryzacja.setAutoryzacjaStan( autoryzacja.getBłądAutoryzacji() );
        }
        if((login!=this.login && autoryzacja.nBłędów==3) || (password!=this.password && autoryzacja.nBłędów==3) || (login!=this.login && password!=this.password && autoryzacja.nBłędów==3)){
            autoryzacja.setAutoryzacjaStan( autoryzacja.getPoważnyBłądAutoryzacji() );
        }
        if(login==this.login && password==this.password){
            autoryzacja.setAutoryzacjaStan( autoryzacja.getPoprawnaAutoryzacja() );
        }
    }

}
