import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;

import htw.gruppe3.BenutzerverwaltungImpl;


public class BenutzerverwaltungImplTest {

    @Test
    public void testErstelleBenutzer() {
        BenutzerverwaltungImpl benutzerverwaltung = new BenutzerverwaltungImpl();
        Benutzer benutzer = benutzerverwaltung.erstelleBenutzer("Max Mustermann", 1);
        assertEquals("Max Mustermann", benutzer.getName());
        assertEquals(1, benutzer.getBenutzerID());
    }
}
