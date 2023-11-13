package htw.gruppe3.vokabelverwaltung.api.domain;
import java.util.List;

/**
 * Repräsentiert eine Liste von Vokabeln in zwei Sprachen.
 * Jede Liste hat eine eindeutige ID, einen Namen und zwei Sprachcodes.
 * Die Liste enthält eine Sammlung von Vokabel-Objekten.
 */
public class VokabelListe {
    private int VokabellisteID;
    private List<Vokabel> Vokabeln;
    private String Name;
    private String Sprache1;
    private String Sprache2;
    //TODO:kategorie hinzufügen

    /**
     * Konstruktor für die VokabelListe-Klasse.
     * 
     * @param VokabellisteID Die ID der Vokabelliste.
     * @param Vokabeln Eine Liste von Vokabel-Objekten.
     * @param Name Der Name der Vokabelliste.
     * @param Sprache1 Der Sprachcode der ersten Sprache.
     * @param Sprache2 Der Sprachcode der zweiten Sprache.
     */
    public VokabelListe(int VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2) {
        this.VokabellisteID = VokabellisteID;
        this.Vokabeln = Vokabeln;
        this.Name = Name;
        this.Sprache1 = Sprache1;
        this.Sprache2 = Sprache2;
    }

    /** 
     * Gibt die ID der Vokabelliste zurück.
     * 
     * @return Die ID der Vokabelliste.
     */
    public int getVokabellisteID() {
        return VokabellisteID;
    }

    /** 
     * Setzt die ID der Vokabelliste.
     * 
     * @param VokabellisteID Die ID der Vokabelliste.
     */
    public void setVokabellisteID(int VokabellisteID) {
        this.VokabellisteID = VokabellisteID;
    }

    /** 
     * Gibt eine Liste von Vokabel-Objekten zurück.
     * 
     * @return Eine Liste von Vokabel-Objekten.
     */
    public List<Vokabel> getVokabeln() {
        return Vokabeln;
    }

    /** 
     * Setzt eine Liste von Vokabel-Objekten.
     * 
     * @param Vokabeln Eine Liste von Vokabel-Objekten.
     */
    public void setVokabeln(List<Vokabel> Vokabeln) {
        this.Vokabeln = Vokabeln;
    }

    /** 
     * Gibt den Namen der Vokabelliste zurück.
     * 
     * @return Der Name der Vokabelliste.
     */
    public String getName() {
        return Name;
    }

    /** 
     * Setzt den Namen der Vokabelliste.
     * 
     * @param Name Der Name der Vokabelliste.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /** 
     * Gibt den Sprachcode der ersten Sprache zurück.
     * 
     * @return Der Sprachcode der ersten Sprache.
     */
    public String getSprache1() {
        return Sprache1;
    }

    /** 
     * Setzt den Sprachcode der ersten Sprache.
     * 
     * @param Sprache1 Der Sprachcode der ersten Sprache.
     */
    public void setSprache1(String Sprache1) {
        this.Sprache1 = Sprache1;
    }

    /** 
     * Gibt den Sprachcode der zweiten Sprache zurück.
     * 
     * @return Der Sprachcode der zweiten Sprache.
     */
    public String getSprache2() {
        return Sprache2;
    }

    /** 
     * Setzt den Sprachcode der zweiten Sprache.
     * 
     * @param Sprache2 Der Sprachcode der zweiten Sprache.
     */
    public void setSprache2(String Sprache2) {
        this.Sprache2 = Sprache2;
    }

    @Override
    public String toString() {
        return "VokabelListe{" + "VokabellisteID=" + VokabellisteID + ", Vokabeln=" + Vokabeln + ", Name=" + Name + ", Sprache1=" + Sprache1 + ", Sprache2=" + Sprache2 + '}';
    }
    
}