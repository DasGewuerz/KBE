package htw.gruppe3.statistikverwaltung.impl;

import htw.gruppe3.statistikverwaltung.api.domain.Statistik;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import java.util.List;

import htw.gruppe3.statistikverwaltung.api.Statistikverwaltung;

/**
 * Implementierung des Statistikverwaltung-Interface.
 */
public class StatistikverwaltungImpl implements Statistikverwaltung{

    
    /** 
     * Erstellt eine neue Statistik mit der gegebenen ID, dem gegebenen Benutzer und den gegebenen Duell-Ergebnissen.
     * 
     * @param statistikID Die ID der neuen Statistik.
     * @param benutzer Der Benutzer, für den die Statistik erstellt wird.
     * @param duellErgebnisse Die Liste der Duell-Ergebnisse, die in die Statistik aufgenommen werden sollen.
     * @return Die neu erstellte Statistik.
     */
    @Override
    public Statistik erstelleStatistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse) {
        return new Statistik(statistikID, benutzer, duellErgebnisse);
    }
    
}
