package htw.gruppe3.duellverwaltung.impl;

import htw.gruppe3.duellverwaltung.api.domain.Duell;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import htw.gruppe3.duellverwaltung.api.domain.SpielListe;
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
     * @param vokabelListe Die Liste der Vokabeln.
     * @param spielListe Die Liste der Spiele.
     * @return Das erstellte Duell.
     */
    @Override
    public Duell erstelleDuell(int duellID, Benutzer benutzer1, Benutzer benutzer2, VokabelListe vokabelListe, SpielListe spielListe) {
        return new Duell(duellID, benutzer1, benutzer2, vokabelListe, spielListe);
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
    public DuellErgebnis erstelleDuellErgebnis(int duellErgebnisID, Duell duell, Boolean ergebnis, Timestamp timestamp) {
        return new DuellErgebnis(duellErgebnisID, duell, ergebnis, timestamp);
    }


    /**
     * Erstellt eine neue spielliste.
     *
     * @param spielListeID Die ID der spielliste.
     * @param fragen Die Liste der Fragen.
     * @param aktiveFrage Die aktive Frage.
     * @param aktiverSpieler Der aktive Spieler.
     * @return Die erstellte Spielliste.
     */
    @Override
    public SpielListe erstelleSpielListe(int spielListeID, List<Frage> fragen, int aktiveFrage, int aktiverSpieler) {
        return new SpielListe(spielListeID, fragen, aktiveFrage, aktiverSpieler);
    }


    /**
     * Erstellt eine neue Frage.
     *
     * @param frageID Die ID der Frage.
     * @param vokabel Die Vokabel der Frage.
     * @param spielListeID Die ID der spielliste.
     * @param antworten Die Liste der Antworten.
     * @param antwortOptionen Die Liste der Antwortoptionen.
     * @return Die erstellte Frage.
     */
    @Override
    public Frage erstelleFrage(int frageID, Vokabel vokabel, int spielListeID, Map<Integer, Boolean> antworten, List<String> antwortOptionen) {
        return new Frage(frageID, vokabel, spielListeID, antworten, antwortOptionen);
    }
}


