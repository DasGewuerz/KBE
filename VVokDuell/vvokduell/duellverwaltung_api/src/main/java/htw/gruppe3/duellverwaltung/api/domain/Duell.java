package htw.gruppe3.duellverwaltung.api.domain;

import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;

/**
 * Repräsentiert ein Duell zwischen zwei Benutzern mit einer Liste von Vokabeln und Spielen.
 */
public class Duell {
    private int duellID;
    private Benutzer benutzer1;
    private Benutzer benutzer2;
    private VokabelListe vokabelListe;
    private SpielListe spielListe;

    /**
     * Konstruktor für ein Duell-Objekt.
     *
     * @param duellID Die ID des Duells.
     * @param benutzer1 Der erste Benutzer des Duells.
     * @param benutzer2 Der zweite Benutzer des Duells.
     * @param vokabelListe Die Liste der Vokabeln für das Duell.
     * @param spielListe Die Liste der Spiele für das Duell.
     */
    public Duell(int duellID, Benutzer benutzer1, Benutzer benutzer2, VokabelListe vokabelListe, SpielListe spielListe) {
        this.duellID = duellID;
        this.benutzer1 = benutzer1;
        this.benutzer2 = benutzer2;
        this.vokabelListe = vokabelListe;
        this.spielListe = spielListe;
    }

    /**
     * Gibt die ID des Duells zurück.
     *
     * @return Die ID des Duells.
     */
    public int getDuellID() {
        return duellID;
    }

    /**
     * Setzt die ID des Duells.
     *
     * @param duellID Die ID des Duells.
     */
    public void setDuellID(int duellID) {
        this.duellID = duellID;
    }

    /**
     * Gibt den ersten Benutzer des Duells zurück.
     *
     * @return Der erste Benutzer des Duells.
     */
    public Benutzer getBenutzer1() {
        return benutzer1;
    }

    /**
     * Setzt den ersten Benutzer des Duells.
     *
     * @param benutzer1 Der erste Benutzer des Duells.
     */
    public void setBenutzer1(Benutzer benutzer1) {
        this.benutzer1 = benutzer1;
    }

    /**
     * Gibt den zweiten Benutzer des Duells zurück.
     *
     * @return Der zweite Benutzer des Duells.
     */
    public Benutzer getBenutzer2() {
        return benutzer2;
    }

    /**
     * Setzt den zweiten Benutzer des Duells.
     *
     * @param benutzer2 Der zweite Benutzer des Duells.
     */
    public void setBenutzer2(Benutzer benutzer2) {
        this.benutzer2 = benutzer2;
    }

    /**
     * Gibt die Liste der Vokabeln für das Duell zurück.
     *
     * @return Die Liste der Vokabeln für das Duell.
     */
    public VokabelListe getVokabelListe() {
        return vokabelListe;
    }

    /**
     * Setzt die Liste der Vokabeln für das Duell.
     *
     * @param vokabelListe Die Liste der Vokabeln für das Duell.
     */
    public void setVokabelListe(VokabelListe vokabelListe) {
        this.vokabelListe = vokabelListe;
    }

    /**
     * Gibt die Liste der Spiele für das Duell zurück.
     *
     * @return Die Liste der Spiele für das Duell.
     */
    public spielliste getSpielListe() {
        return spielListe;
    }

    /**
     * Setzt die Liste der Spiele für das Duell.
     *
     * @param spielListe Die Liste der Spiele für das Duell.
     */
    public void setSpielListe(SpielListe spielListe) {
        this.spielListe = spielListe;
    }

    /**
     * Gibt eine String-Repräsentation des Duell-Objekts zurück.
     *
     * @return Eine String-Repräsentation des Duell-Objekts.
     */
    @Override
    public String toString() {
        return "Duell{" +
                "DuellID=" + duellID +
                ", Benutzer1=" + benutzer1 +
                ", Benutzer2=" + benutzer2 +
                ", Vokabelliste=" + vokabelListe +
                ", Spielliste=" + spielListe +
                '}';
    }
}
