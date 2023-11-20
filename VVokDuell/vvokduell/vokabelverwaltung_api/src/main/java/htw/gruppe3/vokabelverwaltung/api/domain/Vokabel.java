package htw.gruppe3.vokabelverwaltung.api.domain;

import java.util.List;

/**
 * Diese Klasse repräsentiert ein Vokabelwort mit seinen Übersetzungen.
 */
public class Vokabel {
    private int vokabelID;
    private String text;
    private List<List<String>> uebersetzung; 

    /**
     * Konstruktor für die Vokabel-Klasse.
     * 
     * @param vokabelID Die ID der Vokabel.
     * @param text  Das Vokabelwort in der ersten Sprache.
     * @param uebersetzung  Eine Liste von Übersetzungen des Vokabelworts in der zweiten Sprache.
     */
    public Vokabel(int vokabelID, String text, List<List<String>> uebersetzung) {
        this.vokabelID = vokabelID;
        this.text = text;
        this.uebersetzung = uebersetzung;
    }

    
    /** 
     * @return int
     */
    public int getVokabelID() {
        return vokabelID;
    }

    
    /** 
     * @param vokabelID
     */
    public void setVokabelID(int vokabelID) {
        this.vokabelID = vokabelID;
    }

    
    /** 
     * @return String
     */
    public String getText() {
        return text;
    }

    
    /** 
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    
    /** 
     * @return List<String>
     */
    public List<List<String>> getUebersetzung() {
        return uebersetzung;
    }

    
    /** 
     * @param uebersetzung
     */
    public void setUebersetzung(List<List<String>> uebersetzung) {
        this.uebersetzung = uebersetzung;
    }


    @Override
    public String toString() {
        return "Vokabel{" + "vokabelID=" + vokabelID + ", text=" + text + ", uebersetzung=" + uebersetzung + '}';
    }
    
}
