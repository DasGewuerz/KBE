package htw.gruppe3.statistikverwaltung.impl;

import htw.gruppe3.statistikverwaltung.api.domain.Statistik;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import java.util.List;

import htw.gruppe3.statistikverwaltung.api.Statistikverwaltung;

public class StatistikverwaltungImpl implements Statistikverwaltung{

    
    /** 
     * @param statistikID
     * @param benutzer
     * @param duellErgebnisse
     * @return Statistik
     */
    @Override
    public Statistik erstelleStatistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse) {
        return new Statistik(statistikID, benutzer, duellErgebnisse);
    }
    
}
