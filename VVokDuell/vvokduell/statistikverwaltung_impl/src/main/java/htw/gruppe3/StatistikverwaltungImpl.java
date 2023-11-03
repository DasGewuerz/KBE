public class StatistikverwaltungImpl implements Statistikverwaltung{

    @Override
    public erstelleStatistik(int statistikID, Benutzer benutzer, List<DuellErgebnis> duellErgebnisse) {
        return new Statistik(statistikID, benutzer, duellErgebnisse);
    }
    
}
