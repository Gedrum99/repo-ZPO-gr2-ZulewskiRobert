package z4.obserwator;

public interface Podmiot {
    void dodajObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void aktualizujObserwatora();
}
