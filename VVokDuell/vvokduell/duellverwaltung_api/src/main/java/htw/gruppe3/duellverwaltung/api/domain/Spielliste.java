package htw.gruppe3.duellverwaltung.api.domain;
import java.util.List;

/**
 * Die Spielliste-Klasse repräsentiert eine Liste von Fragen und den aktuellen Zustand eines Spiels.
 * Sie enthält eine eindeutige SpiellisteID, eine Liste von Fragen, den Index der aktiven Frage
 * und den Index des aktiven Spielers.
 */
public class Spielliste {
    private int SpiellisteID;
    private List<Frage> Fragen;
    private int AktiveFrage;
    private int AktiverSpieler;


    /**
     * Konstruktor.
     *
     * @param spiellisteID 
     * @param fragen 
     * @param aktiveFrage 
     * @param aktiverSpieler 
     */
    public Spielliste(int spiellisteID, List<Frage> fragen, int aktiveFrage, int aktiverSpieler) {
        SpiellisteID = spiellisteID;
        Fragen = fragen;
        AktiveFrage = aktiveFrage;
        AktiverSpieler = aktiverSpieler;
    }

    /**
     * Gibt die Spielliste-ID zurück.
     *
     * @return Die Spielliste-ID.
     */
    public int getSpiellisteID() {
        return SpiellisteID;
    }

    /**
     * Setzt die Spielliste-ID.
     *
     * @param spiellisteID Die neue Spielliste-ID.
     */
    public void setSpiellisteID(int spiellisteID) {
        SpiellisteID = spiellisteID;
    }

    /**
     * Gibt die Liste der Fragen zurück.
     *
     * @return Die Liste der Fragen.
     */
    public List<Frage> getFragen() {
        return Fragen;
    }

    /**
     * Setzt die Liste der Fragen.
     *
     * @param fragen Die neue Liste der Fragen.
     */
    public void setFragen(List<Frage> fragen) {
        Fragen = fragen;
    }

    /**
     * Gibt den Index der aktiven Frage zurück.
     *
     * @return Der Index der aktiven Frage.
     */
    public int getAktiveFrage() {
        return AktiveFrage;
    }

    /**
     * Setzt den Index der aktiven Frage.
     *
     * @param aktiveFrage Der neue Index der aktiven Frage.
     */
    public void setAktiveFrage(int aktiveFrage) {
        AktiveFrage = aktiveFrage;
    }

    /**
     * Gibt den Index des aktiven Spielers zurück.
     *
     * @return Der Index des aktiven Spielers.
     */
    public int getAktiverSpieler() {
        return AktiverSpieler;
    }

    /**
     * Setzt den Index des aktiven Spielers.
     *
     * @param aktiverSpieler Der neue Index des aktiven Spielers.
     */
    public void setAktiverSpieler(int aktiverSpieler) {
        AktiverSpieler = aktiverSpieler;
    }

    /**
     * Gibt eine String-Repräsentation der Spielliste zurück
     * @return String
     */
    @Override
    public String toString() {
        return "Spielliste{" +
                "SpiellisteID=" + SpiellisteID +
                ", Fragen=" + Fragen +
                ", AktiveFrage=" + AktiveFrage +
                ", AktiverSpieler=" + AktiverSpieler +
                '}';
    }
}
