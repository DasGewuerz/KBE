import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;
import htw.gruppe3.vokabelverwaltung.impl.VokabelverwaltungImpl;

/**
 * Diese Klasse enthält JUnit-Tests für die VokabelverwaltungImpl-Klasse.
 */
public class VokabelverwaltungImplTest {

    /**
     * Testet die Methode erstelleVokabel() der VokabelverwaltungImpl-Klasse.
     */
    @Test
    public void testErstelleVokabel() {
        VokabelverwaltungImpl vokabelverwaltung = new VokabelverwaltungImpl();
        Vokabel vokabel = vokabelverwaltung.erstelleVokabel(1, "Hund", Arrays.asList("Dog"));
        assertEquals(1, vokabel.getVokabelID());
        assertEquals("Hund", vokabel.getVokabel1());
        assertEquals(Arrays.asList("Dog"), vokabel.getVokabel2());
    }

    /**
     * Testet die Methode erstelleVokabelListe() der VokabelverwaltungImpl-Klasse.
     */
    @Test
    public void testErstelleVokabelListe() {
        VokabelverwaltungImpl vokabelverwaltung = new VokabelverwaltungImpl();
        Vokabel vokabel1 = new Vokabel(1, "Hund", Arrays.asList("Dog"));
        Vokabel vokabel2 = new Vokabel(2, "Katze", Arrays.asList("Cat"));
        List<Vokabel> vokabeln = Arrays.asList(vokabel1, vokabel2);
        VokabelListe vokabelListe = vokabelverwaltung.erstelleVokabelListe(1, vokabeln, "Tiere", "Deutsch", "Englisch");
        assertEquals(1, vokabelListe.getVokabellisteID());
        assertEquals(vokabeln, vokabelListe.getVokabeln());
        assertEquals("Tiere", vokabelListe.getName());
        assertEquals("Deutsch", vokabelListe.getSprache1());
        assertEquals("Englisch", vokabelListe.getSprache2());
    }

    //TODO:löschen implementieren im Service
}
