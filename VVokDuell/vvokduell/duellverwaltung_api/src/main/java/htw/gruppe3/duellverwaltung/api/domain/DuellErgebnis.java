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
/**
 * Die Klasse DuellErgebnis repräsentiert das Ergebnis eines Duells.
 * Sie enthält Informationen wie die ID des Ergebnisses, das Duell, das Ergebnis selbst und den Zeitpunkt, zu dem das Ergebnis festgestellt wurde.
 */
public class DuellErgebnis {
    private int duellErgebnisID;
    private Duell duell;
    private boolean ergebnis;
    private Timestamp timestamp;
    //gewinner muss zugewiesen werden

    /**
     * Konstruktor für die Klasse DuellErgebnis
     * @param duellErgebnisID ID des DuellErgebnisses
     * @param duell Duell für dass das Ergebnis vorliegt
     * @param ergebnis Ergebnis des Duells
     * @param timestamp Zeitpunkt zu dem das Ergebnis festgestellt wurde
     */
    public DuellErgebnis(int duellErgebnisID, Duell duell, boolean ergebnis, Timestamp timestamp) {
        this.duellErgebnisID = duellErgebnisID;
        this.duell = duell;
        this.ergebnis = ergebnis;
        this.timestamp = timestamp;
    }

    /**
     * Gibt die ID des DuellErgebnisses zurück
     * @return int
     */
    public int getDuellErgebnisID() {
        return duellErgebnisID;
    }

    /**
     * Setzt die ID des DuellErgebnisses
     * @param duellErgebnisID ID des DuellErgebnisses
     */
    public void setDuellErgebnisID(int duellErgebnisID) {
        this.duellErgebnisID = duellErgebnisID;
    }

    /**
     * Gibt das Duell zurück, für das das Ergebnis vorliegt
     * @return duell
     */
    public Duell getDuell() {
        return duell;
    }

    /**
     * Setzt das Duell, für das das Ergebnis vorliegt
     * @param duell Duell, für das das Ergebnis vorliegt
     */
    public void setDuell(Duell duell) {
        this.duell = duell;
    }

    /**
     * Gibt das Ergebnis des Duells zurück
     * @return boolean
     */
    public boolean getErgebnis() {
        return ergebnis;
    }

    /**
     * Setzt das Ergebnis des Duells
     * @param ergebnis Ergebnis des Duells
     */
    public void setErgebnis(boolean ergebnis) {
        this.ergebnis = ergebnis;
    }

    /**
     * Gibt den Zeitpunkt zurück, zu dem das Ergebnis festgestellt wurde
     * @return timestamp
     */
    public Timestamp getTimestamp() {
        return timestamp;
    }

    /**
     * Setzt den Zeitpunkt, zu dem das Ergebnis festgestellt wurde
     * @param timestamp Zeitpunkt, zu dem das Ergebnis festgestellt wurde
     */
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gibt eine String-Repräsentation des DuellErgebnisses zurück
     * @return String
     */
    @Override
    public String toString() {
        return "DuellErgebnis{" +
                "DuellErgebnisID=" + duellErgebnisID +
                ", Duell=" + duell +
                ", Ergebnis=" + ergebnis +
                ", Timestamp=" + timestamp +
                '}';
    }
}
