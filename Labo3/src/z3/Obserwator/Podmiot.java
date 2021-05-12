package z3.Obserwator;

import java.util.ArrayList;

public interface Podmiot {
    void dodajObserwatora(Obserwator obserwator);
    void usunObserwatora(Obserwator obserwator);
    void aktualizujObserwatora(int liczba);
}
