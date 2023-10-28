import java.sql.Timestamp;

public class DuellErgebnis {
    private int DuellergebnisID;
    private Duell Duell;
    private boolean Ergebnis;
    private Timestamp Timestamp;

    public DuellErgebnis(int duellergebnisID, Duell duell, boolean ergebnis, Timestamp timestamp) {
        DuellergebnisID = duellergebnisID;
        Duell = duell;
        Ergebnis = ergebnis;
        Timestamp = timestamp;
    }

    public int getDuellergebnisID() {
        return DuellergebnisID;
    }

    public void setDuellergebnisID(int duellergebnisID) {
        DuellergebnisID = duellergebnisID;
    }

    public Duell getDuell() {
        return Duell;
    }

    public void setDuell(Duell duell) {
        Duell = duell;
    }

    public boolean isErgebnis() {
        return Ergebnis;
    }

    public void setErgebnis(boolean ergebnis) {
        Ergebnis = ergebnis;
    }

    public Timestamp getTimestamp() {
        return Timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        Timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "DuellErgebnis{" +
                "DuellergebnisID=" + DuellergebnisID +
                ", Duell=" + Duell +
                ", Ergebnis=" + Ergebnis +
                ", Timestamp=" + Timestamp +
                '}';
    }
}
