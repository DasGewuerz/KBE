package htw.gruppe3.duellverwaltung.api.domain;
import java.util.List;

/**
 * Die Spielliste-Klasse repräsentiert eine Liste von Fragen und den aktuellen Zustand eines Spiels.
 * Sie enthält eine eindeutige SpiellisteID, eine Liste von Fragen, den Index der aktiven Frage
 * und den Index des aktiven Spielers.
 */
public class SpielListe {
    private int spielListeID;
    private List<Frage> fragen;
    private int aktiveFrage;
    private int aktiverSpieler;


    /**
     * Konstruktor.
     *
     * @param spielListeID
     * @param fragen
     * @param aktiveFrage
     * @param aktiverSpieler
     */
    public SpielListe(int spielListeID, List<Frage> fragen, int aktiveFrage, int aktiverSpieler) {
        this.spielListeID = spielListeID;
        this.fragen = fragen;
        this.aktiveFrage = aktiveFrage;
        this.aktiverSpieler = aktiverSpieler;
    }

    /**
     * Gibt die Spielliste-ID zurück.
     *
     * @return Die Spielliste-ID.
     */
    public int getSpielListeID() {
        return spielListeID;
    }

    /**
     * Setzt die Spielliste-ID.
     *
     * @param spielListeID Die neue Spielliste-ID.
     */
    public void setSpielListeID(int spielListeID) {
        this.spielListeID = spielListeID;
    }

    /**
     * Gibt die Liste der Fragen zurück.
     *
     * @return Die Liste der Fragen.
     */
    public List<Frage> getFragen() {
        return fragen;
    }

    /**
     * Setzt die Liste der Fragen.
     *
     * @param fragen Die neue Liste der Fragen.
     */
    public void setFragen(List<Frage> fragen) {
        this.fragen = fragen;
    }

    /**
     * Gibt den Index der aktiven Frage zurück.
     *
     * @return Der Index der aktiven Frage.
     */
    public int getAktiveFrage() {
        return aktiveFrage;
    }

    /**
     * Setzt den Index der aktiven Frage.
     *
     * @param aktiveFrage Der neue Index der aktiven Frage.
     */
    public void setAktiveFrage(int aktiveFrage) {
        this.aktiveFrage = aktiveFrage;
    }

    /**
     * Gibt den Index des aktiven Spielers zurück.
     *
     * @return Der Index des aktiven Spielers.
     */
    public int getAktiverSpieler() {
        return aktiverSpieler;
    }

    /**
     * Setzt den Index des aktiven Spielers.
     *
     * @param aktiverSpieler Der neue Index des aktiven Spielers.
     */
    public void setAktiverSpieler(int aktiverSpieler) {
        this.aktiverSpieler = aktiverSpieler;
    }

    /**
     * Gibt eine String-Repräsentation der Spielliste zurück
     * @return String
     */
    @Override
    public String toString() {
        return "Spielliste{" +
                "SpiellisteID=" + spielListeID +
                ", Fragen=" + fragen +
                ", AktiveFrage=" + aktiveFrage +
                ", AktiverSpieler=" + aktiverSpieler +
                '}';
    }
}
