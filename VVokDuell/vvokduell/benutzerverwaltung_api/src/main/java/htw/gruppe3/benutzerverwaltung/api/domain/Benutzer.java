package htw.gruppe3.benutzerverwaltung.api.domain;

public class Benutzer {
    private int BenutzerID;
    private String Name;

    public Benutzer(int benutzerID, String name) {
        BenutzerID = benutzerID;
        Name = name;
    }

    public int getBenutzerID() {
        return BenutzerID;
    }

    public void setBenutzerID(int benutzerID) {
        BenutzerID = benutzerID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }



}
