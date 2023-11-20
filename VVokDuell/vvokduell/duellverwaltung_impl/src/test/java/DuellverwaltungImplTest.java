import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import htw.gruppe3.duellverwaltung.impl.DuellverwaltungImpl;
import htw.gruppe3.duellverwaltung.api.domain.Duell;
import htw.gruppe3.duellverwaltung.api.domain.DuellErgebnis;
import htw.gruppe3.duellverwaltung.api.domain.Frage;
import htw.gruppe3.duellverwaltung.api.domain.SpielListe;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Diese Klasse enthält JUnit-Tests für die Klasse DuellverwaltungImpl.
 */
public class DuellverwaltungImplTest {

    /**
     * Testet die Methode erstelleDuell() der Klasse DuellverwaltungImpl.
     */
    @Test
    public void testErstelleDuell() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        Benutzer benutzer1 = new Benutzer(1, "Max Mustermann");
        Benutzer benutzer2 = new Benutzer(2, "Maria Musterfrau");
        VokabelListe vokabelListe = new VokabelListe(1, Arrays.asList(new Vokabel(1, "Hund", Arrays.asList("Dog"))), "Tiere", "Deutsch", "Englisch");
        SpielListe spielListe = new SpielListe(1, Arrays.asList(new Frage(1, new Vokabel(1, "Hund", Arrays.asList("Dog")), 1, new HashMap<>(), Arrays.asList("Dog", "Cat"))), 0, 1);
        Duell duell = duellverwaltung.erstelleDuell(1, benutzer1, benutzer2, vokabelListe, spielListe);
        assertEquals(1, duell.getDuellID());
        assertEquals(benutzer1, duell.getBenutzer1());
        assertEquals(benutzer2, duell.getBenutzer2());
        assertEquals(vokabelListe, duell.getVokabelListe());
        assertEquals(spielListe, duell.getSpielListe());
    }

    /**
     * Testet die Methode erstelleDuellErgebnis() der Klasse DuellverwaltungImpl.
     */
    @Test
    public void testErstelleDuellErgebnis() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        Benutzer benutzer = new Benutzer(1, "Max Mustermann");
        Duell duell = new Duell(1, benutzer, benutzer, new VokabelListe(1, Arrays.asList(new Vokabel(1, "Hund", Arrays.asList("Dog"))), "Tiere", "Deutsch", "Englisch"), new Spielliste(1, Arrays.asList(new Frage(1, new Vokabel(1, "Hund", Arrays.asList("Dog")), 1, new HashMap<>(), Arrays.asList("Dog", "Cat"))), 0, 1));
        DuellErgebnis duellErgebnis = duellverwaltung.erstelleDuellErgebnis(1, duell, true, new Timestamp(System.currentTimeMillis()));
        assertEquals(1, duellErgebnis.getDuellErgebnisID());
        assertEquals(duell, duellErgebnis.getDuell());
        assertTrue(duellErgebnis.getErgebnis());
    }

    /**
     * Testet die Methode erstelleSpielliste() der Klasse DuellverwaltungImpl.
     */
    @Test
    public void testErstelleSpielliste() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        List<Frage> fragen = Arrays.asList(new Frage(1, new Vokabel(1, "Hund", Arrays.asList("Dog")), 1, new HashMap<>(), Arrays.asList("Dog", "Cat")));
        SpielListe spielListe = duellverwaltung.erstelleSpielListe(1, fragen, 0, 1);
        assertEquals(1, spielListe.getSpielListeID());
        assertEquals(fragen, spielListe.getFragen());
        assertEquals(0, spielListe.getAktiveFrage());
        assertEquals(1, spielListe.getAktiverSpieler());
    }

    /**
     * Testet die Methode erstelleFrage() der Klasse DuellverwaltungImpl.
     */
    @Test
    public void testErstelleFrage() {
        DuellverwaltungImpl duellverwaltung = new DuellverwaltungImpl();
        Vokabel vokabel = new Vokabel(1, "Hund", Arrays.asList("Dog"));
        Map<Integer, Boolean> antworten = new HashMap<>();
        antworten.put(1, true);
        antworten.put(2, false);
        List<String> antwortOptionen = Arrays.asList("Dog", "Cat");
        Frage frage = duellverwaltung.erstelleFrage(1, vokabel, 1, antworten, antwortOptionen);
        assertEquals(1, frage.getFrageID());
        assertEquals(vokabel, frage.getVokabel());
        assertEquals(1, frage.getSpielListeID());
        assertEquals(antworten, frage.getAntworten());
        assertEquals(antwortOptionen, frage.getAntwortOptionen());
    }
}
