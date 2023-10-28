import java.util.List;
import java.util.Map;

public class Duell {
    private long DuellID;
    private Benutzer Benutzer1;
    private Benutzer Benutzer2;
    private Vokabelliste Vokabelliste;
    private List<Map<Long, Boolean>> Antwortliste;

    public Duell(long duellID, Benutzer benutzer1, Benutzer benutzer2, Vokabelliste vokabelliste, List<Map<Long, Boolean>> antwortliste) {
        DuellID = duellID;
        Benutzer1 = benutzer1;
        Benutzer2 = benutzer2;
        Vokabelliste = vokabelliste;
        Antwortliste = antwortliste;
    }

    public long getDuellID() {
        return DuellID;
    }

    public void setDuellID(long duellID) {
        DuellID = duellID;
    }

    public Benutzer getBenutzer1() {
        return Benutzer1;
    }

    public void setBenutzer1(Benutzer benutzer1) {
        Benutzer1 = benutzer1;
    }

    public Benutzer getBenutzer2() {
        return Benutzer2;
    }

    public void setBenutzer2(Benutzer benutzer2) {
        Benutzer2 = benutzer2;
    }

    public Vokabelliste getVokabelliste() {
        return Vokabelliste;
    }

    public void setVokabelliste(Vokabelliste vokabelliste) {
        Vokabelliste = vokabelliste;
    }

    public List<Map<Long, Boolean>> getAntwortliste() {
        return Antwortliste;
    }

    public void setAntwortliste(List<Map<Long, Boolean>> antwortliste) {
        Antwortliste = antwortliste;
    }

    @Override
    public String toString() {
        return "Duell{" +
                "DuellID=" + DuellID +
                ", Benutzer1=" + Benutzer1 +
                ", Benutzer2=" + Benutzer2 +
                ", Vokabelliste=" + Vokabelliste +
                ", Antwortliste=" + Antwortliste +
                '}';
    }
}