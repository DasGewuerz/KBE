import java.util.List;
import java.util.Map;

public class Duell {
    private long DuellID;
    private Benutzer Benutzer1;
    private Benutzer Benutzer2;
    private Vokabelliste Vokabelliste;
    private Spielliste Spielliste;

    public Duell(long duellID, Benutzer benutzer1, Benutzer benutzer2, Vokabelliste vokabelliste, Spielliste Spielliste) {
        DuellID = duellID;
        Benutzer1 = benutzer1;
        Benutzer2 = benutzer2;
        Vokabelliste = vokabelliste;
        Spielliste = spielliste;
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

    public List<Map<Long, Boolean>> getSpielliste() {
        return Spielliste;
    }

    public void setSpielliste(Spielliste spielliste) {
        Spielliste = spielliste;
    }

    @Override
    public String toString() {
        return "Duell{" +
                "DuellID=" + DuellID +
                ", Benutzer1=" + Benutzer1 +
                ", Benutzer2=" + Benutzer2 +
                ", Vokabelliste=" + Vokabelliste +
                ", Spielliste=" + <<Spielliste>> +
                '}';
    }
}