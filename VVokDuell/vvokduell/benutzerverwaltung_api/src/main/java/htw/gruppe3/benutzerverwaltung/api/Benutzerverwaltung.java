package htw.gruppe3.benutzerverwaltung.api;

import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;

public interface Benutzerverwaltung {

    Benutzer erstelleBenutzer(String Name, int BenutzerID);

}
