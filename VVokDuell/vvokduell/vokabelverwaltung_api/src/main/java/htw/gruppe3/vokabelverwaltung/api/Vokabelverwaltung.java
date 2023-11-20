package htw.gruppe3.vokabelverwaltung.api;

import java.util.List;

import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;

import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;

/**
 * Das Interface Vokabelverwaltung definiert Methoden zur Erstellung von Vokabeln und Vokabellisten.
 */
public interface Vokabelverwaltung {

    /**
     * Erstellt eine neue Vokabel mit der angegebenen ID, dem Vokabeltext in Sprache 1 und einer Liste von Vokabeltexten in Sprache 2.
     *
     * @param vokabelID Die ID der Vokabel.
     * @param vokabel1 Der Vokabeltext in Sprache 1.
     * @param vokabel2 Eine Liste von Vokabeltexten in Sprache 2.
     * @return Die erstellte Vokabel.
     */
    Vokabel erstelleVokabel( int vokabelID, String vokabel1, List<List<String>> vokabel2);

    /**
     * Erstellt eine neue Vokabelliste mit der angegebenen ID, einer Liste von Vokabeln, einem Namen und den Sprachen der Vokabeln.
     *
     * @param vokabellisteID Die ID der Vokabelliste.
     * @param vokabeln Eine Liste von Vokabeln.
     * @param name Der Name der Vokabelliste.
     * @param sprache1 Die Sprache der Vokabeln in Spalte 1.
     * @param sprache2 Die Sprache der Vokabeln in Spalte 2.
     * @param kategorie Die Kategorie der Vokabelliste
     * @return Die erstellte Vokabelliste.
     */
    VokabelListe erstelleVokabelListe( int vokabellisteID, List<Vokabel> vokabeln, String name, String sprache1, String sprache2, String kategorie);
    
}
