package z3;

public class BłądAutoryzacjiStan implements State{

    Autoryzacja autoryzacja;

    public BłądAutoryzacjiStan (Autoryzacja autoryzacja) {

        this.autoryzacja = autoryzacja;
    }

    @Override
    public void zablokuj () {
        System.out.println("Nie mam możliwości blokowania konta");
    }

    @Override
    public void odblokuj () {
        System.out.println("Nie mam możliwości odblokowania konta");
    }

    @Override
    public void login (String login, String hasło) throws InterruptedException {
        autoryzacja.setAutoryzacjaStan(autoryzacja.getBłądAutoryzacji());
    }

    @Override
    public void error () {
        System.out.println("Podane dane są błędne, po 3 nie udanych próbach możliwość logowania zostanie zablokowana na 30 sekund");
    }
}
