package htw.gruppe3.vokabelverwaltung.api.domain;

import java.util.List;

/**
 * Diese Klasse repräsentiert ein Vokabelwort mit seinen Übersetzungen.
 */
public class Vokabel {
    private int VokabelID;
    private String Vokabel1;
    private List<String> Vokabel2; //TODO:Liste von Listen
    //TODO:n zu 1ner Frage

    /**
     * Konstruktor für die Vokabel-Klasse.
     * 
     * @param VokabelID Die ID der Vokabel.
     * @param Vokabel1  Das Vokabelwort in der ersten Sprache.
     * @param Vokabel2  Eine Liste von Übersetzungen des Vokabelworts in der zweiten Sprache.
     */
    public Vokabel(int VokabelID, String Vokabel1, List<String> Vokabel2) {
        this.VokabelID = VokabelID;
        this.Vokabel1 = Vokabel1;
        this.Vokabel2 = Vokabel2;
    }

    
    /** 
     * @return int
     */
    public int getVokabelID() {
        return VokabelID;
    }

    
    /** 
     * @param VokabelID
     */
    public void setVokabelID(int VokabelID) {
        this.VokabelID = VokabelID;
    }

    
    /** 
     * @return String
     */
    public String getVokabel1() {
        return Vokabel1;
    }

    
    /** 
     * @param Vokabel1
     */
    public void setVokabel1(String Vokabel1) {
        this.Vokabel1 = Vokabel1;
    }

    
    /** 
     * @return List<String>
     */
    public List<String> getVokabel2() {
        return Vokabel2;
    }

    
    /** 
     * @param Vokabel2
     */
    public void setVokabel2(List<String> Vokabel2) {
        this.Vokabel2 = Vokabel2;
    }


    @Override
    public String toString() {
        return "Vokabel{" + "VokabelID=" + VokabelID + ", Vokabel1=" + Vokabel1 + ", Vokabel2=" + Vokabel2 + '}';
    }
    
}
