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

    Duell erstelleDuell(int duellID, Benutzer benutzer1, Benutzer benutzer2, VokabelListe vokabelListe, SpielListe spielListe);

    DuellErgebnis erstelleDuellErgebnis(int duellErgebnisID, Duell duell, Boolean ergebnis, Timestamp timestamp);

    Spielliste erstelleSpielListe(int spielListeID, List<Frage> fragen, int aktiveFrage, int aktiverSpieler);

    Frage erstelleFrage (int frageID, Vokabel vokabel, int spielListeID, Map<Integer,Boolean> antworten, List<String> antwortOptionen);

}
