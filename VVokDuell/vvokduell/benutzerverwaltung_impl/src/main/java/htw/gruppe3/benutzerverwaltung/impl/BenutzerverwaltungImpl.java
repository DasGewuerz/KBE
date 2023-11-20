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
     * @param name Der Name des neuen Benutzers.
     * @param benutzerID Die ID des neuen Benutzers.
     * @return Der neu erstellte Benutzer.
     */
    @Override
    public Benutzer erstelleBenutzer(String name, int benutzerID) {
        return new Benutzer(benutzerID, name);
    }

}
