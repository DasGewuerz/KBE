package htw.gruppe3.duellverwaltung.api;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import htw.gruppe3.duellverwaltung.api.domain.Duell;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import htw.gruppe3.duellverwaltung.api.domain.SpielListe;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;
import htw.gruppe3.duellverwaltung.api.domain.Frage;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;

/**
 * Das Duellverwaltung-Interface stellt Methoden zur Verwaltung von Duellen zwischen zwei Benutzern, zur Erstellung von Duell-Ergebnissen, zur Erstellung von Spiel-Listen und zur Erstellung von Fragen bereit.
 */
public interface Duellverwaltung {

    /**
     * Erstellt ein neues Duell mit der angegebenen ID, den beiden Benutzern, der Vokabelliste und der Spiel-Liste.
     *
     * @param duellID Die ID des Duells.
     * @param benutzer1 Der erste Benutzer.
     * @param benutzer2 Der zweite Benutzer.
     * @param vokabelListe Die Vokabelliste.
     * @param spielListe Die Spiel-Liste.
     * @return Das erstellte Duell.
     */
    Duell erstelleDuell(int duellID, Benutzer benutzer1, Benutzer benutzer2, VokabelListe vokabelListe, SpielListe spielListe);

    /**
     * Erstellt ein neues Duell-Ergebnis mit der angegebenen ID, dem Duell, dem Ergebnis und dem Zeitstempel.
     *
     * @param duellErgebnisID Die ID des Duell-Ergebnisses.
     * @param duell Das Duell.
     * @param ergebnis Das Ergebnis.
     * @param timestamp Der Zeitstempel.
     * @return Das erstellte Duell-Ergebnis.
     */
    DuellErgebnis erstelleDuellErgebnis(int duellErgebnisID, Duell duell, Boolean ergebnis, Timestamp timestamp);

    /**
     * Erstellt eine neue Spiel-Liste mit der angegebenen ID, den Fragen, der aktiven Frage und dem aktiven Spieler.
     *
     * @param spielListeID Die ID der Spiel-Liste.
     * @param fragen Die Fragen.
     * @param aktiveFrage Die aktive Frage.
     * @param aktiverSpieler Der aktive Spieler.
     * @return Die erstellte Spiel-Liste.
     */
    SpielListe erstelleSpielListe(int spielListeID, List<Frage> fragen, int aktiveFrage, int aktiverSpieler);

    /**
     * Erstellt eine neue Frage mit der angegebenen ID, der Vokabel, der Spiel-Liste, den Antworten und den Antwort-Optionen.
     *
     * @param frageID Die ID der Frage.
     * @param vokabel Die Vokabel.
     * @param spielListeID Die ID der Spiel-Liste.
     * @param antworten Die Antworten.
     * @param antwortOptionen Die Antwort-Optionen.
     * @return Die erstellte Frage.
     */
    Frage erstelleFrage (int frageID, Vokabel vokabel, int spielListeID, Map<Integer,Boolean> antworten, List<String> antwortOptionen);

}
