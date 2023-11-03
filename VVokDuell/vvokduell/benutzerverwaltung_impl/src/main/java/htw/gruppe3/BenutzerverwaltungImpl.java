

public class BenutzerverwaltungImpl implements Benutzerverwaltung{

    @Override
    public Benutzer erstelleBenutzer(String Name, int BenutzerID) {
        return new Benutzer(Name, BenutzerID);
    }
    
}
