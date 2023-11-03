import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class VokabelverwaltungImplTest {

    @Test
    public void testErstelleVokabel() {
        VokabelverwaltungImpl vokabelverwaltung = new VokabelverwaltungImpl();
        Vokabel vokabel = vokabelverwaltung.erstelleVokabel(1, false, "Hund", Arrays.asList("Dog"));
        assertEquals(1, vokabel.getVokabelID());
        assertFalse(vokabel.isGelernt());
        assertEquals("Hund", vokabel.getVokabel1());
        assertEquals(Arrays.asList("Dog"), vokabel.getVokabel2());
    }

    @Test
    public void testErstelleVokabelListe() {
        VokabelverwaltungImpl vokabelverwaltung = new VokabelverwaltungImpl();
        Vokabel vokabel1 = new Vokabel(1, false, "Hund", Arrays.asList("Dog"));
        Vokabel vokabel2 = new Vokabel(2, true, "Katze", Arrays.asList("Cat"));
        List<Vokabel> vokabeln = Arrays.asList(vokabel1, vokabel2);
        VokabelListe vokabelListe = vokabelverwaltung.erstelleVokabelListe(1, vokabeln, "Tiere", "Deutsch", "Englisch");
        assertEquals(1, vokabelListe.getVokabellisteID());
        assertEquals(vokabeln, vokabelListe.getVokabeln());
        assertEquals("Tiere", vokabelListe.getName());
        assertEquals("Deutsch", vokabelListe.getSprache1());
        assertEquals("Englisch", vokabelListe.getSprache2());
    }
}
