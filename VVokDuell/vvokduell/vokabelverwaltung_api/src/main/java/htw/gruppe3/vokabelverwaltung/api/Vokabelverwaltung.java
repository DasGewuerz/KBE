package htw.gruppe3.vokabelverwaltung.api;

import java.util.List;

import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;

import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;

/**
 * Das Interface Vokabelverwaltung definiert Methoden zur Erstellung von Vokabeln und Vokabellisten.
 */
public interface Vokabelverwaltung {

    /**
     * Erstellt eine neue Vokabel mit der angegebenen ID, dem Gelernt-Status, dem Vokabeltext in Sprache 1 und einer Liste von Vokabeltexten in Sprache 2.
     *
     * @param VokabelID Die ID der Vokabel.
     * @param Vokabel1 Der Vokabeltext in Sprache 1.
     * @param Vokabel2 Eine Liste von Vokabeltexten in Sprache 2.
     * @return Die erstellte Vokabel.
     */
    Vokabel erstelleVokabel( int VokabelID, String Vokabel1, List<String> Vokabel2);

    /**
     * Erstellt eine neue Vokabelliste mit der angegebenen ID, einer Liste von Vokabeln, einem Namen und den Sprachen der Vokabeln.
     *
     * @param VokabellisteID Die ID der Vokabelliste.
     * @param Vokabeln Eine Liste von Vokabeln.
     * @param Name Der Name der Vokabelliste.
     * @param Sprache1 Die Sprache der Vokabeln in Spalte 1.
     * @param Sprache2 Die Sprache der Vokabeln in Spalte 2.
     * @return Die erstellte Vokabelliste.
     */
    VokabelListe erstelleVokabelListe( int VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2);
    
}
