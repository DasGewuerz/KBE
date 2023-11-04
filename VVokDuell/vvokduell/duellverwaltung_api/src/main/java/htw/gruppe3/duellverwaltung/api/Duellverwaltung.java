package htw.gruppe3.duellverwaltung.api;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import htw.gruppe3.duellverwaltung.api.domain.Duell;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import htw.gruppe3.duellverwaltung.api.domain.Spielliste;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;
import htw.gruppe3.duellverwaltung.api.domain.Frage;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;

/**
 * Das Duellverwaltung-Interface stellt Methoden zur Verwaltung von Duellen zwischen zwei Benutzern, zur Erstellung von Duell-Ergebnissen, zur Erstellung von Spiel-Listen und zur Erstellung von Fragen bereit.
 */
public interface Duellverwaltung {

    Duell erstelleDuell(int DuellID, Benutzer Benutzer1, Benutzer Benutzer2, VokabelListe Vokabelliste, Spielliste Spielliste);

    DuellErgebnis erstelleDuellErgebnis(int DuellErgebnisID, Duell Duell, Boolean Ergebnis, Timestamp Timestamp);

    Spielliste erstelleSpielliste(int SpiellisteID, List<Frage> Fragen, int AktiveFrage, int AktiverSpieler);

    Frage erstelleFrage (int FrageID, Vokabel Vokabel, int SpiellisteID, Map<Integer,Boolean> Antworten, List<String> Antwortoptionen);

}
