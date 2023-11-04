package htw.gruppe3.benutzerverwaltung.api;

import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;

/**
 * Dieses Interface repräsentiert das Benutzerverwaltungssystem.
 */
public interface Benutzerverwaltung {

    /**
     * Erstellt einen neuen Benutzer mit dem gegebenen Namen und der gegebenen Benutzer-ID.
     *
     * @param name Der Name des Benutzers.
     * @param benutzerID Die ID des Benutzers.
     * @return Der erstellte Benutzer.
     */
    Benutzer erstelleBenutzer(String name, int benutzerID);

}
