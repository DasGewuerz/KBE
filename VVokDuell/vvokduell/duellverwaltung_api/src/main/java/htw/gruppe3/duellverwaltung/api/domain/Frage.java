package htw.gruppe3.duellverwaltung.api.domain;
import java.util.List;
import java.util.Map;

import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;

/**
 * Repräsentiert eine Frage im Spiel.
 * Enthält die Frage-ID, das entsprechende Vokabular, die ID der Spielliste, die möglichen Antworten und die Antwortoptionen.
 */
public class Frage {
    private int FrageID;
    private Vokabel Vokabel;
    private int SpiellisteID;
    private Map<Integer,Boolean> Antworten;
    private List<String> Antwortoptionen;

    
    /** 
     * Konstruktor.
     * @param frageID
     * @param vokabel
     * @param spiellisteID
     * @param antworten
     * @param antwortoptionen
     */
    public Frage(int frageID, Vokabel vokabel, int spiellisteID, Map<Integer,Boolean> antworten, List<String> antwortoptionen) {
        FrageID = frageID;
        Vokabel = vokabel;
        SpiellisteID = spiellisteID;
        Antworten = antworten;
        Antwortoptionen = antwortoptionen;
    }

    
    /** 
     * Gibt die Frage-ID zurück.
     * @return int
     */
    public int getFrageID() {
        return FrageID;
    }

    
    /** 
     * Setzt die Frage-ID.
     * @param frageID
     */
    public void setFrageID(int frageID) {
        FrageID = frageID;
    }

    
    /** 
     * Gibt das Vokabular zurück.
     * @return Vokabel
     */
    public Vokabel getVokabel() {
        return Vokabel;
    }

    
    /** 
     * Setzt das Vokabular.
     * @param vokabel
     */
    public void setVokabel(Vokabel vokabel) {
        Vokabel = vokabel;
    }

    
    /** 
     * Gibt die Spielliste-ID zurück.
     * @return int
     */
    public int getSpiellisteID() {
        return SpiellisteID;
    }

    
    /** 
     * Setzt die Spielliste-ID.
     * @param spiellisteID
     */
    public void setSpiellisteID(int spiellisteID) {
        SpiellisteID = spiellisteID;
    }

    /**
     * Gibt die Antworten der User zurück.
     * @return Map<Integer,Boolean>
     */
    public Map<Integer,Boolean> getAntworten () {
        return Antworten;
    }

    /**
     * Setzt die Antworten der User.
     * @param antworten
     */
    public void setAntworten (Map<Integer,Boolean> antworten) {
        Antworten = antworten;
    }

    /**
     * Gibt die Antwortoptionen zurück.
     * @return List<String>
     */
    public List<String> getAntwortoptionen () {
        return Antwortoptionen;
    }

    /**
     * Setzt die Antwortoptionen.
     * @param antwortoptionen
     */
    public void setAntwortoptionen (List<String> antwortoptionen) {
        Antwortoptionen = antwortoptionen;
    }
}
