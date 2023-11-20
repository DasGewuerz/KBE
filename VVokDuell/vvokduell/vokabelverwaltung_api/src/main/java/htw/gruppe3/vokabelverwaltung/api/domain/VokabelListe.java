package htw.gruppe3.vokabelverwaltung.api.domain;
import java.util.List;

/**
 * Repräsentiert eine Liste von Vokabeln in zwei Sprachen.
 * Jede Liste hat eine eindeutige ID, einen Namen und zwei Sprachcodes.
 * Die Liste enthält eine Sammlung von Vokabel-Objekten.
 */
public class VokabelListe {
    private int vokabellisteID;
    private List<Vokabel> vokabeln;
    private String kategorie;
    private String name;
    private String sprache1;
    private String sprache2;

    /**
     * Konstruktor für die VokabelListe-Klasse.
     * 
     * @param vokabellisteID Die ID der Vokabelliste.
     * @param vokabeln Eine Liste von Vokabel-Objekten.
     * @param name Der Name der Vokabelliste.
     * @param sprache1 Der Sprachcode der ersten Sprache.
     * @param sprache2 Der Sprachcode der zweiten Sprache.
     * @param kategorie Die Kategorie der Vokabelliste.
     */
    public VokabelListe(int vokabellisteID, List<Vokabel> vokabeln, String name, String sprache1, String sprache2, String kategorie) {
        this.vokabellisteID = vokabellisteID;
        this.vokabeln = vokabeln;
        this.name = name;
        this.sprache1 = sprache1;
        this.sprache2 = sprache2;
        this.kategorie = kategorie;
    }

    /** 
     * Gibt die ID der Vokabelliste zurück.
     * 
     * @return Die ID der Vokabelliste.
     */
    public int getVokabellisteID() {
        return vokabellisteID;
    }

    /** 
     * Setzt die ID der Vokabelliste.
     * 
     * @param vokabellisteID Die ID der Vokabelliste.
     */
    public void setVokabellisteID(int vokabellisteID) {
        this.vokabellisteID = vokabellisteID;
    }

    /** 
     * Gibt eine Liste von Vokabel-Objekten zurück.
     * 
     * @return Eine Liste von Vokabel-Objekten.
     */
    public List<Vokabel> getVokabeln() {
        return vokabeln;
    }

    /** 
     * Setzt eine Liste von Vokabel-Objekten.
     * 
     * @param vokabeln Eine Liste von Vokabel-Objekten.
     */
    public void setVokabeln(List<Vokabel> vokabeln) {
        this.vokabeln = vokabeln;
    }

    /** 
     * Gibt den Namen der Vokabelliste zurück.
     * 
     * @return Der Name der Vokabelliste.
     */
    public String getName() {
        return name;
    }

    /** 
     * Setzt den Namen der Vokabelliste.
     * 
     * @param name Der Name der Vokabelliste.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Gibt den Sprachcode der ersten Sprache zurück.
     * 
     * @return Der Sprachcode der ersten Sprache.
     */
    public String getSprache1() {
        return sprache1;
    }

    /** 
     * Setzt den Sprachcode der ersten Sprache.
     * 
     * @param sprache1 Der Sprachcode der ersten Sprache.
     */
    public void setSprache1(String sprache1) {
        this.sprache1 = sprache1;
    }

    /** 
     * Gibt den Sprachcode der zweiten Sprache zurück.
     * 
     * @return Der Sprachcode der zweiten Sprache.
     */
    public String getSprache2() {
        return sprache2;
    }

    /** 
     * Setzt den Sprachcode der zweiten Sprache.
     * 
     * @param sprache2 Der Sprachcode der zweiten Sprache.
     */
    public void setSprache2(String sprache2) {
        this.sprache2 = sprache2;
    }

    /** 
     * Gibt die Kategorie der Vokabelliste zurück.
     * 
     * @return Die Kategorie der Vokabelliste.
     */
    public String getKategorie() {
        return kategorie;
    }

    /** 
     * Setzt die Kategorie der Vokabelliste.
     * 
     * @param kategorie Die Kategorie der Vokabelliste.
     */
    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    @Override
    public String toString() {
        return "VokabelListe{" + "vokabellisteID=" + vokabellisteID + ", vokabeln=" + vokabeln + ", name=" + name + ", sprache1=" + sprache1 + ", sprache2=" + sprache2 + ", kategorie=" + kategorie + '}';
    }
    
}