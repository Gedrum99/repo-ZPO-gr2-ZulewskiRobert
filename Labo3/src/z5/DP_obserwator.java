package z5;

public class DP_obserwator {
    public static void main(String[] args) {
        Gielda gielda=new Gielda();
        Bank bank = new Bank();
        InwestorIndywidualny inwestorIndywidualny = new InwestorIndywidualny();
        MinisterFinansow ministerFinansow = new MinisterFinansow();

        gielda.dodajObserwatora(bank);
        gielda.dodajObserwatora(inwestorIndywidualny);
        gielda.dodajObserwatora(ministerFinansow);

        // Spółki
        gielda.dodajSpółkę("Drużyna", 1200);
        gielda.dodajSpółkę("Władcy", 100);
        gielda.zmieńCenę("Władcy", 30);
        gielda.dodajSpółkę("Koteł", 1560);
        gielda.dodajSpółkę("Oczko", 999);
        gielda.dodajSpółkę("Lichwiarz", 12000);
        gielda.dodajSpółkę("Hinterlands", 40);
        gielda.zmieńCenę("Hinterlands", 100);
        gielda.zmieńCenę("Hinterlands", 66);
        gielda.zmieńCenę("Hinterlands", 100);
        gielda.zmieńCenę("Władcy", 99);
    }

    /*
     * Klasa Giełda odpowiedzialna jest za zmianę wyceny spółek w niej notowanych.
     * Dodaj kilka spółek, wraz z ich wycenami. Oprócz tego - zmieniaj im wartości wyceny
     * Możesz to zrobić w sposób losowy
     *
     * Zaimplementuj i wypełnij pozostałe klasy zgodnie z wzorcem projektowym Obserwator:
     * Podmiot - interfejs w którym będą zawarte metody zarządzające Obserwatorami (dodaj, usuń, powiadom)
     * Obserwator - interfejs mający metodę aktualizacja() która wykonuje się za każdym razem, gdy przyjdą nowe dane
     *      InwestorIndywidualny - kupuje jeśli cena spadnie o więcej niż 5% i sprzedaje, jeśli cena wzrośnie o więcej niż 10%
     *      Bank - Kupuje tylko duże spółki (wartość transakcji > 10000 zł)
     *      MinisterFinansów - gromadzi informacje o średniej wartości ceny spółki
     *
     * Możesz zmieniać i redefiniować interfejsy, klasy i wszystkie metody (np. aktualizacja() )według swojego uznania
     * jeżeli zachowasz standardy wzorca Obserwator!
     */
}
