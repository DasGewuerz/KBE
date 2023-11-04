package htw.gruppe3.statistikverwaltung.api.domain;

import java.util.List;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;


/**
 * Die Statistik-Klasse repräsentiert einen statistischen Datensatz für einen Benutzer im System.
 * Sie enthält die Benutzer-ID, ihr Benutzerobjekt und eine Liste ihrer DuellErgebnis-Objekte.
 */
public class Statistik {
    private int statistikID;
    private Benutzer benutzer;
    private List<DuellErgebnis> duellErgebnisse;

    public Statistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse) {
        this.statistikID = statistikID;
        this.benutzer = benutzer;
        this.duellErgebnisse = duellErgebnisse;
    }

    
    /** 
     * Gibt die Statistik-ID zurück.
     * @return int
     */
    public int getStatistikID() {
        return statistikID;
    }

    
    /** 
     * Setzt die Statistik-ID.
     * @param statistikID
     */
    public void setStatistikID(int statistikID) {
        this.statistikID = statistikID;
    }

    
    /** 
     * Gibt das Benutzerobjekt zurück.
     * @return Benutzer
     */
    public Benutzer getBenutzer() {
        return benutzer;
    }

    
    /** 
     * Setzt das Benutzerobjekt.
     * @param benutzer
     */
    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    
    /** 
     * Gibt die Liste der DuellErgebnis-Objekte zurück.
     * @return List<DuellErgebnis>
     */
    public List<DuellErgebnis> getDuellErgebnisse() {
        return duellErgebnisse;
    }

    
    /** 
     * Setzt die Liste der DuellErgebnis-Objekte.
     * @param duellErgebnisse
     */
    public void setDuellErgebnisse(List<DuellErgebnis> duellErgebnisse) {
        this.duellErgebnisse = duellErgebnisse;
    }

    @Override
    public String toString() {
        return "Statistik{" +
                "statistikID=" + statistikID +
                ", benutzer=" + benutzer +
                ", duellErgebnisse=" + duellErgebnisse +
                '}';
    }
}
