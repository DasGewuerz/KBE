import org.junit.Test;
import static org.junit.Assert.*;

public class BenutzerverwaltungImplTest {

    @Test
    public void testErstelleBenutzer() {
        BenutzerverwaltungImpl benutzerverwaltung = new BenutzerverwaltungImpl();
        Benutzer benutzer = benutzerverwaltung.erstelleBenutzer("Max Mustermann", 1);
        assertEquals("Max Mustermann", benutzer.getName());
        assertEquals(1, benutzer.getBenutzerID());
    }
}
