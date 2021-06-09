package z3;

public class BłądAutoryzacji3RazyStan implements State {
    Autoryzacja autoryzacja;

    public BłądAutoryzacji3RazyStan (Autoryzacja autoryzacja) {
        this.autoryzacja = autoryzacja;
    }

    @Override
    public void zablokuj () {
        System.out.println("Blokuję konto");
    }

    @Override
    public void odblokuj () {
        System.out.println("Odblokowuję konto");
    }

    @Override
    public void login (String login, String hasło) throws InterruptedException {
        autoryzacja.setAutoryzacjaStan(autoryzacja.getPoważnyBłądAutoryzacji());
    }


    @Override
    public void error () {
        System.out.println("Podane dane są błędne możliwość logowania zostaje zablokowana na 30 sekund");
    }
}
