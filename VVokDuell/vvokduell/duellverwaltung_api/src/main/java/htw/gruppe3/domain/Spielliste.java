import java.sql.Timestamp;

public class Spielliste {
    private int SpiellisteID;
    private List<Frage> Fragen;
    private int AktiveFrage;
    private int AktiverSpieler;

    public Spielliste(int SpiellisteID, List<Frage> Fragen, int AktiveFrage, int AktiverSpieler) {
        SpiellisteID = spiellisteID;
        Fragen = fragen;
        AktiveFrage = aktiveFrage;
        AktiverSpieler = aktiverSpieler;
    }

    public int getSpiellisteID() {
        return DuellergebnisID;
    }

    public void setSpiellisteID(int spiellisteID) {
        SpiellisteID = spiellisteID;
    }

    public Duell getFragen() {
        return Fragen;
    }

    public void setFragen(List<Frage> Fragen) {
        Fragen = fragen;
    }

    public int getAktiveFrage() {
        return AktiveFrage;
    }

    public void setAktiveFrage(int aktiveFrage) {
        AktiveFrage = aktiveFrage;
    }

    public int getAktiverSpieler() {
        return AktiverSpieler;
    }

    public void setAktiverSpieler(int aktiverSpieler) {
        AktiverSpieler = aktiverSpieler;
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
