package obserwatorZ2;

public interface Podmiot {
    void dodajObserwatora(Konto obserwator);
    void usunObserwatora(Konto obserwator);
    void aktualizujObserwatora(String komunikat);
}
