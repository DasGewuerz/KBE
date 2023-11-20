package htw.gruppe3.statistikverwaltung.api;

import htw.gruppe3.statistikverwaltung.api.domain.Statistik;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import java.util.List;

/**
 * Das Statistikverwaltung-Interface bietet Methoden zur Erstellung und Verwaltung von Statistiken.
 */
public interface Statistikverwaltung {

    /**
     * Erstellt eine neue Statistik mit der angegebenen ID, dem Benutzer und einer Liste von DuellErgebnissen.
     * @param statistikID Die ID der Statistik.
     * @param benutzer Der Benutzer, dem die Statistik zugeordnet ist.
     * @param duellErgebnisse Eine Liste von DuellErgebnissen.
     * @return Die erstellte Statistik.
     */
    Statistik erstelleStatistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse);

}
