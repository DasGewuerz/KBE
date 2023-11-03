public class DuellverwaltungImpl implements Duellverwaltung {

    @Override
    public Duell erstelleDuell(int DuellID, Benutzer Benutzer1, Benutzer Benutzer2, Vokabelliste Vokabelliste, Spielliste Spielliste) {
        return new Duell(DuellID, Benutzer1, Benutzer2, Vokabelliste, Spielliste);
    }

    @Override
    public DuellErgebnis erstelleDuellErgebnis(int DuellErgebnisID, Duell Duell, Boolean Ergebnis, Timestamp Timestamp) {
        return new DuellErgebnis(DuellErgebnisID, Duell, Ergebnis, Timestamp);
    }

    @Override
    public Spielliste erstelleSpielliste(int SpiellisteID, List<Frage> Fragen, int AktiveFrage, int AktiverSpieler) {
        return new Spielliste(SpiellisteID, Fragen, AktiveFrage, AktiverSpieler);
    }

    @Override
    public Frage erstelleFrage(int FrageID, Vokabel Vokabel, int SpiellisteID, Map<int, bool> Antworten, List<String> Antwortoptionen;) {
        return new Frage(FrageID, Vokabel, SpiellisteID, Antworten, Antwortoptionen;);
    }

}
