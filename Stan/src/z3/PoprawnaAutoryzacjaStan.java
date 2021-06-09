package z3;

public class PoprawnaAutoryzacjaStan implements State{
    Konto konto;
    Autoryzacja autoryzacja;

    @Override
    public void zablokuj () {
        System.out.println("Nie mam możliwości blokowania konta");
    }

    @Override
    public void odblokuj () {
        System.out.println("Nie mam możliwości odblokowania konta");
    }

    public PoprawnaAutoryzacjaStan (Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    @Override
    public void login (String login, String hasło) throws InterruptedException {
        autoryzacja.setAutoryzacjaStan(autoryzacja.getPoprawnaAutoryzacja());
    }

    @Override
    public void error () {
    }
}
