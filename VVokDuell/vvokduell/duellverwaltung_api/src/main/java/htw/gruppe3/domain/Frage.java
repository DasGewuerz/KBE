import java.sql.Timestamp;

public class Frage {
    private int FrageID;
    private Vokabel Vokabel;
    private int SpiellisteID;
    private Map<int,bool> Antworten;
    private List<String> Antwortoptionen;

    public Frage(int FrageID, Vokabel Vokabel, int SpiellisteID, Map<int, bool> Antworten, List<String> Antwortoptionen) {
        FrageID = frageID;
        Vokabel = vokabel;
        SpiellisteID = spiellisteID;
        Antworten = antworten;
        Antwortoptionen = antwortoptionen;
    }

    public int getFrageID() {
        return FrageID;
    }

    public void setFrageID(int frageID) {
        FrageID = frageID;
    }

    public int getVokabel() {
        return Vokabel;
    }

    public void setVokabel(Vokabel vokabel) {
        Vokabel = vokabel;
    }

    public int getSpiellisteID() {
        return SpiellisteID;
    }

    public void setSpiellisteID(int spiellisteID) {
        SpiellisteID = spiellisteID;
    }

    public Map<int,bool> getAntworten () {
        return Antworten;
    }

    public void setAntworten (Map<int,bool> antworten) {
        Antworten = antworten;
    }

    public List<String> getAntwortoptionen () {
        return Antwortoptionen;
    }

    public void setAntwortoptionen (List<String> antwortoptionen) {
        Antwortoptionen = antwortoptionen;
    }
}
