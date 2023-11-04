package htw.gruppe3.benutzerverwaltung.api.domain;

/**
 * Die Klasse Benutzer repräsentiert einen Benutzer in der Benutzerverwaltung.
 */
public class Benutzer {
    private int BenutzerID;
    private String Name;

    /**
     * Konstruktor für die Klasse Benutzer.
     * 
     * @param benutzerID Die ID des Benutzers.
     * @param name Der Name des Benutzers.
     */
    public Benutzer(int benutzerID, String name) {
        BenutzerID = benutzerID;
        Name = name;
    }

    
    /** 
     * Gibt die ID des Benutzers zurück.
     * 
     * @return Die ID des Benutzers.
     */
    public int getBenutzerID() {
        return BenutzerID;
    }


    
    /** 
     * Setzt die ID des Benutzers.
     * 
     * @param benutzerID Die neue ID des Benutzers.
     */
    public void setBenutzerID(int benutzerID) {
        BenutzerID = benutzerID;
    }

    
    /** 
     * Gibt den Namen des Benutzers zurück.
     * 
     * @return Der Name des Benutzers.
     */
    public String getName() {
        return Name;
    }

    
    /** 
     * Setzt den Namen des Benutzers.
     * 
     * @param name Der neue Name des Benutzers.
     */
    public void setName(String name) {
        Name = name;
    }
}
