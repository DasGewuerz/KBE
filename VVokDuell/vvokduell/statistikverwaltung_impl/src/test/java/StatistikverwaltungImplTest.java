import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import htw.gruppe3.statistikverwaltung.api.domain.Statistik;
import htw.gruppe3.statistikverwaltung.impl.StatistikverwaltungImpl;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;

import java.sql.Timestamp;

/**
 * Diese Klasse enthält Unit-Tests für die StatistikverwaltungImpl-Klasse.
 */
public class StatistikverwaltungImplTest {

    /**
     * Testet die Erstellung eines Statistik-Objekts mit Hilfe der erstelleStatistik-Methode der Klasse StatistikverwaltungImpl.
     * Es wird ein neues StatistikverwaltungImpl-Objekt, ein Benutzer-Objekt, zwei DuellErgebnis-Objekte und eine Liste von DuellErgebnissen erstellt.
     * Anschließend wird die erstelleStatistik-Methode mit diesen Objekten aufgerufen und überprüft, ob das zurückgegebene Statistik-Objekt die erwarteten Werte hat.
     */
    @Test
    public void testErstelleStatistik() {
        StatistikverwaltungImpl statistikverwaltung = new StatistikverwaltungImpl();
        Benutzer benutzer = new Benutzer(1, "Max Mustermann");
        DuellErgebnis duellErgebnis1 = new DuellErgebnis(1, null, true, new Timestamp(System.currentTimeMillis()));
        DuellErgebnis duellErgebnis2 = new DuellErgebnis(2, null, false, new Timestamp(System.currentTimeMillis()));
        List<DuellErgebnis> duellErgebnisse = Arrays.asList(duellErgebnis1, duellErgebnis2);
        Statistik statistik = statistikverwaltung.erstelleStatistik(1, benutzer, duellErgebnisse);
        assertEquals(1, statistik.getStatistikID());
        assertEquals(benutzer, statistik.getBenutzer());
        assertEquals(duellErgebnisse, statistik.getDuellErgebnisse());
    }
}