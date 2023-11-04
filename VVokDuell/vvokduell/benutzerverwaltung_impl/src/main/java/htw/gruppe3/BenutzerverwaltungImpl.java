package htw.gruppe3;

import htw.gruppe3.benutzerverwaltung.api.Benutzerverwaltung;
import htw.gruppe3.benutzerverwaltung.api.domain.Benutzer;

public class BenutzerverwaltungImpl implements Benutzerverwaltung{

    @Override
    public Benutzer erstelleBenutzer(String Name, int BenutzerID) {
        return new Benutzer(BenutzerID, Name);
    }
    
}
