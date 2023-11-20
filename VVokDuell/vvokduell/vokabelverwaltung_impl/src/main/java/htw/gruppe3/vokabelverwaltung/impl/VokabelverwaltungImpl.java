package htw.gruppe3.vokabelverwaltung.impl;

import java.util.List;
import htw.gruppe3.vokabelverwaltung.api.Vokabelverwaltung;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;

/**
 * Implementierung des Vokabelverwaltung-Interfaces.
 */
public class VokabelverwaltungImpl implements Vokabelverwaltung{

    
    /** 
     * Erstellt eine neue Vokabel mit der gegebenen ID und den gegebenen Vokabeln.
     * 
     * @param vokabelID Die ID der Vokabel.
     * @param vokabel1 Die erste Vokabel.
     * @param vokabel2 Eine Liste von Übersetzungen für die erste Vokabel.
     * @return Die erstellte Vokabel.
     */
    @Override
    public Vokabel erstelleVokabel(int vokabelID, String text, List<List<String>> uebersetzung) {
        return new Vokabel(vokabelID, text, uebersetzung);
    }

    
    /** 
     * Erstellt eine neue Vokabelliste mit der gegebenen ID, den gegebenen Vokabeln, dem gegebenen Namen und den gegebenen Sprachen.
     * 
     * @param vokabellisteID Die ID der Vokabelliste.
     * @param vokabeln Eine Liste von Vokabeln.
     * @param name Der Name der Vokabelliste.
     * @param sprache1 Die Sprache der ersten Vokabel.
     * @param sprache2 Die Sprache der zweiten Vokabel.
     * @return Die erstellte Vokabelliste.
     */
    @Override
    public VokabelListe erstelleVokabelListe( int vokabellisteID, List<Vokabel> vokabeln, String name, String sprache1, String sprache2, String kategorie) {
        return new VokabelListe(vokabellisteID, vokabeln, name, sprache1, sprache2, kategorie);
    }
}
    
