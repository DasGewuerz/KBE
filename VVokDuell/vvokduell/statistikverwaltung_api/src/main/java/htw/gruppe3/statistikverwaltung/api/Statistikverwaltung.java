package htw.gruppe3.statistikverwaltung.api;

import htw.gruppe3.statistikverwaltung.api.domain.Statistik;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import java.util.List;

/**
 * Das Statistikverwaltung-Interface bietet Methoden zur Erstellung und Verwaltung von Statistiken.
 */
public interface Statistikverwaltung {

    Statistik erstelleStatistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse);
    
}
