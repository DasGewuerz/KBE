import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuellverwaltungImplTest {

    @Test
    public void testErstelleDuell() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        Benutzer benutzer1 = new Benutzer(1, "Max Mustermann");
        Benutzer benutzer2 = new Benutzer(2, "Maria Musterfrau");
        Vokabelliste vokabelliste = new Vokabelliste(1, Arrays.asList(new Vokabel(1, false, "Hund", Arrays.asList("Dog"))), "Tiere", "Deutsch", "Englisch");
        Spielliste spielliste = new Spielliste(1, Arrays.asList(new Frage(1, new Vokabel(1, false, "Hund", Arrays.asList("Dog")), 1, new HashMap<>(), Arrays.asList("Dog", "Cat"))), 0, 1);
        Duell duell = duellverwaltung.erstelleDuell(1, benutzer1, benutzer2, vokabelliste, spielliste);
        assertEquals(1, duell.getDuellID());
        assertEquals(benutzer1, duell.getBenutzer1());
        assertEquals(benutzer2, duell.getBenutzer2());
        assertEquals(vokabelliste, duell.getVokabelliste());
        assertEquals(spielliste, duell.getSpielliste());
    }

    @Test
    public void testErstelleDuellErgebnis() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        Benutzer benutzer = new Benutzer(1, "Max Mustermann");
        Duell duell = new Duell(1, benutzer, benutzer, new Vokabelliste(1, Arrays.asList(new Vokabel(1, false, "Hund", Arrays.asList("Dog"))), "Tiere", "Deutsch", "Englisch"), new Spielliste(1, Arrays.asList(new Frage(1, new Vokabel(1, false, "Hund", Arrays.asList("Dog")), 1, new HashMap<>(), Arrays.asList("Dog", "Cat"))), 0, 1));
        DuellErgebnis duellErgebnis = duellverwaltung.erstelleDuellErgebnis(1, duell, true, new Timestamp(System.currentTimeMillis()));
        assertEquals(1, duellErgebnis.getDuellErgebnisID());
        assertEquals(duell, duellErgebnis.getDuell());
        assertTrue(duellErgebnis.getErgebnis());
    }

    @Test
    public void testErstelleSpielliste() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        List<Frage> fragen = Arrays.asList(new Frage(1, new Vokabel(1, false, "Hund", Arrays.asList("Dog")), 1, new HashMap<>(), Arrays.asList("Dog", "Cat")));
        Spielliste spielliste = duellverwaltung.erstelleSpielliste(1, fragen, 0, 1);
        assertEquals(1, spielliste.getSpiellisteID());
        assertEquals(fragen, spielliste.getFragen());
        assertEquals(0, spielliste.getAktiveFrage());
        assertEquals(1, spielliste.getAktiverSpieler());
    }

    @Test
    public void testErstelleFrage() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        Vokabel vokabel = new Vokabel(1, false, "Hund", Arrays.asList("Dog"));
        Map<Integer, Boolean> antworten = new HashMap<>();
        antworten.put(1, true);
        antworten.put(2, false);
        List<String> antwortoptionen = Arrays.asList("Dog", "Cat");
        Frage frage = duellverwaltung.erstelleFrage(1, vokabel, 1, antworten, antwortoptionen);
        assertEquals(1, frage.getFrageID());
        assertEquals(vokabel, frage.getVokabel());
        assertEquals(1, frage.getSpiellisteID());
        assertEquals(antworten, frage.getAntworten());
        assertEquals(antwortoptionen, frage.getAntwortoptionen());
    }
}
