import java.util.List;

public class Statistik {
    private int statistikID;
    private Benutzer benutzer;
    private List<DuellErgebnis> duellErgebnisse;

    public Statistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse) {
        this.statistikID = statistikID;
        this.benutzerID = benutzer;
        this.duellErgebnisse = duellErgebnisse;
    }

    public int getStatistikID() {
        return statistikID;
    }

    public void setStatistikID(int statistikID) {
        this.statistikID = statistikID;
    }

    public Benutzer getBenutzer() {
        return benutzer;
    }

    public void setBenutzer(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    public List<DuellErgebnis> getDuellErgebnisse() {
        return duellErgebnisse;
    }

    public void setDuellErgebnisse(List<DuellErgebnis> duellErgebnisse) {
        this.duellErgebnisse = duellErgebnisse;
    }

    @Override
    public String toString() {
        return "Statistik{" +
                "statistikID=" + statistikID +
                ", benutzer=" + benutzer +
                ", duellErgebnisse=" + duellErgebnisse +
                '}';
    }
}
