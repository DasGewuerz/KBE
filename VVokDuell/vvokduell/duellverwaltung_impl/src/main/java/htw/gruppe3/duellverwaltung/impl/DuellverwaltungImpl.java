package htw.gruppe3.duellverwaltung.impl;

import htw.gruppe3.duellverwaltung.api.domain.Duell;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import htw.gruppe3.duellverwaltung.api.domain.Spielliste;
import htw.gruppe3.duellverwaltung.api.domain.Frage;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;
import htw.gruppe3.duellverwaltung.api.Duellverwaltung;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Implementierung des {@link Duellverwaltung} Interface.
 */
public class DuellverwaltungImpl implements Duellverwaltung {

    
    /** 
     * Erstellt ein neues Duell.
     * 
     * @param duellID Die ID des Duells.
     * @param benutzer1 Der erste Benutzer.
     * @param benutzer2 Der zweite Benutzer.
     * @param vokabelliste Die Liste der Vokabeln.
     * @param spielliste Die Liste der Spiele.
     * @return Das erstellte Duell.
     */
    @Override
    public Duell erstelleDuell(int duellID, Benutzer benutzer1, Benutzer benutzer2, VokabelListe vokabelliste, Spielliste spielliste) {
        return new Duell(duellID, benutzer1, benutzer2, vokabelliste, spielliste);
    }

    
    /** 
     * Erstellt ein neues Duell-Ergebnis.
     * 
     * @param duellErgebnisID Die ID des Duell-Ergebnisses.
     * @param duell Das Duell.
     * @param ergebnis Das Ergebnis des Duells.
     * @param timestamp Der Zeitstempel des Duell-Ergebnisses.
     * @return Das erstellte Duell-Ergebnis.
     */
    @Override
    public DuellErgebnis erstelleDuellErgebnis(int duellErgebnisID, Duell duell, Boolean Ergebnis, Timestamp Timestamp) {
        return new DuellErgebnis(DuellErgebnisID, Duell, Ergebnis, Timestamp);
    }

    
    /** 
     * Erstellt eine neue spielliste.
     * 
     * @param SpiellisteID Die ID der spielliste.
     * @param Fragen Die Liste der Fragen.
     * @param AktiveFrage Die aktive Frage.
     * @param AktiverSpieler Der aktive Spieler.
     * @return Die erstellte spielliste.
     */
    @Override
    public spielliste erstelleSpielliste(int SpiellisteID, List<Frage> Fragen, int AktiveFrage, int AktiverSpieler) {
        return new spielliste(SpiellisteID, Fragen, AktiveFrage, AktiverSpieler);
    }

    
    /** 
     * Erstellt eine neue Frage.
     * 
     * @param FrageID Die ID der Frage.
     * @param Vokabel Die Vokabel der Frage.
     * @param SpiellisteID Die ID der spielliste.
     * @param Antworten Die Liste der Antworten.
     * @param Antwortoptionen Die Liste der Antwortoptionen.
     * @return Die erstellte Frage.
     */
    @Override
    public Frage erstelleFrage(int FrageID, Vokabel Vokabel, int SpiellisteID, Map<Integer, Boolean> Antworten, List<String> Antwortoptionen) {
        return new Frage(FrageID, Vokabel, SpiellisteID, Antworten, Antwortoptionen);
    }
}


