import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;
import htw.gruppe3.benutzerverwaltung.impl.BenutzerverwaltungImpl;

/**
 * Diese Klasse enthält Unit-Tests für die Klasse BenutzerverwaltungImpl.
 */
public class BenutzerverwaltungImplTest {

    /**
     * Testet die Methode erstelleBenutzer() der Klasse BenutzerverwaltungImpl.
     * Es wird überprüft, ob die Methode einen neuen Benutzer mit dem gegebenen Namen und der ID erstellt und zurückgibt.
     * Es wird auch überprüft, ob der zurückgegebene Benutzer den richtigen Namen und die richtige ID hat.
     */
    @Test
    public void testErstelleBenutzer() {
        BenutzerverwaltungImpl benutzerverwaltung = new BenutzerverwaltungImpl();
        Benutzer benutzer = benutzerverwaltung.erstelleBenutzer("Max Mustermann", 1);
        assertEquals("Max Mustermann", benutzer.getName());
        assertEquals(1, benutzer.getBenutzerID());
    }
}
