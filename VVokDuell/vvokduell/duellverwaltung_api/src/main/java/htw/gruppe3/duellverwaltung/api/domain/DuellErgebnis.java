package htw.gruppe3.duellverwaltung.api.domain;
import java.sql.Timestamp;

/**
 * Die Klasse DuellErgebnis repräsentiert das Ergebnis eines Duells.
 * 
 * @param DuellergebnisID Die ID des Duell-Ergebnisses.
 * @param Duell Das Duell, für das das Ergebnis gilt.
 * @param Ergebnis Das Ergebnis des Duells.
 * @param Timestamp Der Zeitstempel, an dem das Ergebnis ermittelt wurde.
 */
public class DuellErgebnis {
    private int DuellergebnisID;
    private Duell Duell;
    private boolean Ergebnis;
    private Timestamp Timestamp;

    /**
     * Konstruktor für die Klasse DuellErgebnis
     * @param duellergebnisID ID des DuellErgebnisses
     * @param duell Duell, für das das Ergebnis vorliegt
     * @param ergebnis Ergebnis des Duells
     * @param timestamp Zeitpunkt, zu dem das Ergebnis festgestellt wurde
     */
    public DuellErgebnis(int duellergebnisID, Duell duell, boolean ergebnis, Timestamp timestamp) {
        DuellergebnisID = duellergebnisID;
        Duell = duell;
        Ergebnis = ergebnis;
        Timestamp = timestamp;
    }

    
    /** 
     * @return int
     */
    public int getDuellergebnisID() {
        return DuellergebnisID;
    }

    
    /** 
     * @param duellergebnisID ID des DuellErgebnisses
     */
    public void setDuellergebnisID(int duellergebnisID) {
        DuellergebnisID = duellergebnisID;
    }

    
    /** 
     * @return Duell
     */
    public Duell getDuell() {
        return Duell;
    }

    
    /** 
     * @param duell Duell, für das das Ergebnis vorliegt
     */
    public void setDuell(Duell duell) {
        Duell = duell;
    }

    
    /** 
     * @return boolean
     */
    public boolean getErgebnis() {
        return Ergebnis;
    }

    
    /** 
     * @param ergebnis Ergebnis des Duells
     */
    public void setErgebnis(boolean ergebnis) {
        Ergebnis = ergebnis;
    }

    /**
     * Gibt den Zeitpunkt zurück, zu dem das Ergebnis festgestellt wurde
     * @return Timestamp
     */
    public Timestamp getTimestamp() {
        return Timestamp;
    }

    /**
     * Setzt den Zeitpunkt, zu dem das Ergebnis festgestellt wurde
     * @param timestamp Zeitpunkt, zu dem das Ergebnis festgestellt wurde
     */
    public void setTimestamp(Timestamp timestamp) {
        Timestamp = timestamp;
    }

    /**
     * Gibt eine String-Repräsentation des DuellErgebnisses zurück
     * @return String
     */
    @Override
    public String toString() {
        return "DuellErgebnis{" +
                "DuellergebnisID=" + DuellergebnisID +
                ", Duell=" + Duell +
                ", Ergebnis=" + Ergebnis +
                ", Timestamp=" + Timestamp +
                '}';
    }
}