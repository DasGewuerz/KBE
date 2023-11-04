package htw.gruppe3.duellverwaltung.api.domain;

import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;

/**
 * Repräsentiert ein Duell zwischen zwei Benutzern mit einer Liste von Vokabeln und Spielen.
 */
public class Duell {
    private int DuellID;
    private Benutzer Benutzer1;
    private Benutzer Benutzer2;
    private VokabelListe Vokabelliste;
    private Spielliste Spielliste;

    /**
     * Konstruktor für ein Duell-Objekt.
     * 
     * @param duellID Die ID des Duells.
     * @param benutzer1 Der erste Benutzer des Duells.
     * @param benutzer2 Der zweite Benutzer des Duells.
     * @param vokabelliste Die Liste der Vokabeln für das Duell.
     * @param spielliste Die Liste der Spiele für das Duell.
     */
    public Duell(int duellID, Benutzer benutzer1, Benutzer benutzer2, VokabelListe vokabelliste, Spielliste spielliste) {
        DuellID = duellID;
        Benutzer1 = benutzer1;
        Benutzer2 = benutzer2;
        Vokabelliste = vokabelliste;
        Spielliste = spielliste;
    }

    /**
     * Gibt die ID des Duells zurück.
     * 
     * @return Die ID des Duells.
     */
    public int getDuellID() {
        return DuellID;
    }

    /**
     * Setzt die ID des Duells.
     * 
     * @param duellID Die ID des Duells.
     */
    public void setDuellID(int duellID) {
        DuellID = duellID;
    }

    /**
     * Gibt den ersten Benutzer des Duells zurück.
     * 
     * @return Der erste Benutzer des Duells.
     */
    public Benutzer getBenutzer1() {
        return Benutzer1;
    }

    /**
     * Setzt den ersten Benutzer des Duells.
     * 
     * @param benutzer1 Der erste Benutzer des Duells.
     */
    public void setBenutzer1(Benutzer benutzer1) {
        Benutzer1 = benutzer1;
    }

    /**
     * Gibt den zweiten Benutzer des Duells zurück.
     * 
     * @return Der zweite Benutzer des Duells.
     */
    public Benutzer getBenutzer2() {
        return Benutzer2;
    }

    /**
     * Setzt den zweiten Benutzer des Duells.
     * 
     * @param benutzer2 Der zweite Benutzer des Duells.
     */
    public void setBenutzer2(Benutzer benutzer2) {
        Benutzer2 = benutzer2;
    }

    /**
     * Gibt die Liste der Vokabeln für das Duell zurück.
     * 
     * @return Die Liste der Vokabeln für das Duell.
     */
    public VokabelListe getVokabelliste() {
        return Vokabelliste;
    }

    /**
     * Setzt die Liste der Vokabeln für das Duell.
     * 
     * @param vokabelliste Die Liste der Vokabeln für das Duell.
     */
    public void setVokabelliste(VokabelListe vokabelliste) {
        Vokabelliste = vokabelliste;
    }

    /**
     * Gibt die Liste der Spiele für das Duell zurück.
     * 
     * @return Die Liste der Spiele für das Duell.
     */
    public Spielliste getSpielliste() {
        return Spielliste;
    }

    /**
     * Setzt die Liste der Spiele für das Duell.
     * 
     * @param spielliste Die Liste der Spiele für das Duell.
     */
    public void setSpielliste(Spielliste spielliste) {
        Spielliste = spielliste;
    }

    /**
     * Gibt eine String-Repräsentation des Duell-Objekts zurück.
     * 
     * @return Eine String-Repräsentation des Duell-Objekts.
     */
    @Override
    public String toString() {
        return "Duell{" +
                "DuellID=" + DuellID +
                ", Benutzer1=" + Benutzer1 +
                ", Benutzer2=" + Benutzer2 +
                ", Vokabelliste=" + Vokabelliste +
                ", Spielliste=" + Spielliste +
                '}';
    }
}