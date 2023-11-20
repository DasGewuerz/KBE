package htw.gruppe3.duellverwaltung.api.domain;
import java.util.List;
import java.util.Map;

import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;

/**
 * Repräsentiert eine Frage im Spiel.
 * Enthält die Frage-ID, das entsprechende Vokabular, die ID der Spielliste, die möglichen Antworten und die Antwortoptionen.
 */
public class Frage {
    private int frageID;
    private Vokabel vokabel;
    private int spielListeID;
    private Map<Integer,Boolean> antworten;
    private List<String> antwortOptionen;


    /**
     * Konstruktor.
     * @param frageID Die ID der Frage.
     * @param vokabel Die Vokabel der Frage.
     * @param spielListeID Die ID der Spielliste.
     * @param antworten Die Antworten der User.
     * @param antwortOptionen Die Antwortoptionen.
     */
    public Frage(int frageID, Vokabel vokabel, int spielListeID, Map<Integer,Boolean> antworten, List<String> antwortOptionen) {
        this.frageID = frageID;
        this.Vokabel = vokabel;
        this.spielListeID = spielListeID;
        this.antworten = antworten;
        this.antwortOptionen = antwortOptionen;
    }


    /**
     * Gibt die Frage-ID zurück.
     * @return int
     */
    public int getFrageID() {
        return frageID;
    }


    /**
     * Setzt die Frage-ID.
     * @param frageID
     */
    public void setFrageID(int frageID) {
        this.frageID = frageID;
    }


    /**
     * Gibt das Vokabular zurück.
     * @return Vokabel
     */
    public Vokabel getVokabel() {
        return vokabel;
    }


    /**
     * Setzt das Vokabular.
     * @param vokabel
     */
    public void setVokabel(Vokabel vokabel) {
        this.vokabel = vokabel;
    }


    /**
     * Gibt die Spielliste-ID zurück.
     * @return int
     */
    public int getSpielListeID() {
        return spielListeID;
    }


    /**
     * Setzt die Spielliste-ID.
     * @param spielListeID
     */
    public void setSpielListeID(int spielListeID) {
        this.spielListeID = spielListeID;
    }

    /**
     * Gibt die Antworten der User zurück.
     * @return Map<Integer,Boolean>
     */
    public Map<Integer,Boolean> getAntworten () {
        return antworten;
    }

    /**
     * Setzt die Antworten der User.
     * @param antworten
     */
    public void setAntworten (Map<Integer,Boolean> antworten) {
        this.antworten = antworten;
    }

    /**
     * Gibt die Antwortoptionen zurück.
     * @return List<String>
     */
    public List<String> getAntwortOptionen() {
        return antwortOptionen;
    }

    /**
     * Setzt die Antwortoptionen.
     * @param antwortOptionen
     */
    public void setAntwortOptionen(List<String> antwortOptionen) {
        this.antwortOptionen = antwortOptionen;
    }
}
