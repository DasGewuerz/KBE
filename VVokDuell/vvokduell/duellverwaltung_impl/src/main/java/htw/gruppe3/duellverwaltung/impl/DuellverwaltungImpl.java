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
     * @param DuellID Die ID des Duells.
     * @param Benutzer1 Der erste Benutzer.
     * @param Benutzer2 Der zweite Benutzer.
     * @param Vokabelliste Die Liste der Vokabeln.
     * @param Spielliste Die Liste der Spiele.
     * @return Das erstellte Duell.
     */
    @Override
    public Duell erstelleDuell(int DuellID, Benutzer Benutzer1, Benutzer Benutzer2, VokabelListe Vokabelliste, Spielliste Spielliste) {
        return new Duell(DuellID, Benutzer1, Benutzer2, Vokabelliste, Spielliste);
    }

    
    /** 
     * Erstellt ein neues Duell-Ergebnis.
     * 
     * @param DuellErgebnisID Die ID des Duell-Ergebnisses.
     * @param Duell Das Duell.
     * @param Ergebnis Das Ergebnis des Duells.
     * @param Timestamp Der Zeitstempel des Duell-Ergebnisses.
     * @return Das erstellte Duell-Ergebnis.
     */
    @Override
    public DuellErgebnis erstelleDuellErgebnis(int DuellErgebnisID, Duell Duell, Boolean Ergebnis, Timestamp Timestamp) {
        return new DuellErgebnis(DuellErgebnisID, Duell, Ergebnis, Timestamp);
    }

    
    /** 
     * Erstellt eine neue Spielliste.
     * 
     * @param SpiellisteID Die ID der Spielliste.
     * @param Fragen Die Liste der Fragen.
     * @param AktiveFrage Die aktive Frage.
     * @param AktiverSpieler Der aktive Spieler.
     * @return Die erstellte Spielliste.
     */
    @Override
    public Spielliste erstelleSpielliste(int SpiellisteID, List<Frage> Fragen, int AktiveFrage, int AktiverSpieler) {
        return new Spielliste(SpiellisteID, Fragen, AktiveFrage, AktiverSpieler);
    }

    
    /** 
     * Erstellt eine neue Frage.
     * 
     * @param FrageID Die ID der Frage.
     * @param Vokabel Die Vokabel der Frage.
     * @param SpiellisteID Die ID der Spielliste.
     * @param Antworten Die Liste der Antworten.
     * @param Antwortoptionen Die Liste der Antwortoptionen.
     * @return Die erstellte Frage.
     */
    @Override
    public Frage erstelleFrage(int FrageID, Vokabel Vokabel, int SpiellisteID, Map<Integer, Boolean> Antworten, List<String> Antwortoptionen) {
        return new Frage(FrageID, Vokabel, SpiellisteID, Antworten, Antwortoptionen);
    }
}


