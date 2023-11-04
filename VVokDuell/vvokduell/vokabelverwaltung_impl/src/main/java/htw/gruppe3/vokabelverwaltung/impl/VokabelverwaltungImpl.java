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
     * @param VokabelID Die ID der Vokabel.
     * @param Vokabel1 Die erste Vokabel.
     * @param Vokabel2 Eine Liste von Übersetzungen für die erste Vokabel.
     * @return Die erstellte Vokabel.
     */
    @Override
    public Vokabel erstelleVokabel(int VokabelID, String Vokabel1, List<String> Vokabel2) {
        return new Vokabel(VokabelID, Vokabel1, Vokabel2);
    }

    
    /** 
     * Erstellt eine neue Vokabelliste mit der gegebenen ID, den gegebenen Vokabeln, dem gegebenen Namen und den gegebenen Sprachen.
     * 
     * @param VokabellisteID Die ID der Vokabelliste.
     * @param Vokabeln Eine Liste von Vokabeln.
     * @param Name Der Name der Vokabelliste.
     * @param Sprache1 Die Sprache der ersten Vokabel.
     * @param Sprache2 Die Sprache der zweiten Vokabel.
     * @return Die erstellte Vokabelliste.
     */
    @Override
    public VokabelListe erstelleVokabelListe( int VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2) {
        return new VokabelListe(VokabellisteID, Vokabeln, Name, Sprache1, Sprache2);
    }
}
    
