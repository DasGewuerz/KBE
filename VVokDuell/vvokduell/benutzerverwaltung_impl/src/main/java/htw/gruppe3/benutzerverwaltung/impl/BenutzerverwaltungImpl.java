package htw.gruppe3.benutzerverwaltung.impl;

import htw.gruppe3.benutzerverwaltung.api.Benutzerverwaltung;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;

/**
 * Implementierung des Benutzerverwaltung-Interfaces.
 */
public class BenutzerverwaltungImpl implements Benutzerverwaltung{

    
    /** 
     * Erstellt einen neuen Benutzer mit dem gegebenen Namen und der gegebenen Benutzer-ID.
     * 
     * @param Name Der Name des neuen Benutzers.
     * @param BenutzerID Die ID des neuen Benutzers.
     * @return Der neu erstellte Benutzer.
     */
    @Override
    public Benutzer erstelleBenutzer(String Name, int BenutzerID) {
        return new Benutzer(BenutzerID, Name);
    }
    
}
