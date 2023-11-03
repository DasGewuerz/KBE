import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StatistikverwaltungImplTest {

    @Test
    public void testErstelleStatistik() {
        StatistikverwaltungImpl statistikverwaltung = new StatistikverwaltungImpl();
        Benutzer benutzer = new Benutzer(1, "Max Mustermann");
        DuellErgebnis duellErgebnis1 = new DuellErgebnis(1, benutzer, 10, 5);
        DuellErgebnis duellErgebnis2 = new DuellErgebnis(2, benutzer, 8, 7);
        List<DuellErgebnis> duellErgebnisse = Arrays.asList(duellErgebnis1, duellErgebnis2);
        Statistik statistik = statistikverwaltung.erstelleStatistik(1, benutzer, duellErgebnisse);
        assertEquals(1, statistik.getStatistikID());
        assertEquals(benutzer, statistik.getBenutzer());
        assertEquals(duellErgebnisse, statistik.getDuellErgebnisse());
    }
}