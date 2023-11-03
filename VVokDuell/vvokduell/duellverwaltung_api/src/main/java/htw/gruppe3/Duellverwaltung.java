public interface Duellverwaltung {

    Duell erstelleDuell(int DuellID, Benutzer Benutzer1, Benutzer Benutzer2, Vokabelliste Vokabelliste, Spielliste Spielliste);

    DuellErgebnis erstelleDuellErgebnis(int DuellErgebnisID, Duell Duell, Boolean Ergebnis, Timestamp Timestamp);

    Spielliste erstelleSpielliste(int SpiellisteID, List<Frage> Fragen, int AktiveFrage, int AktiverSpieler);

    Frage erstelleFrage (int FrageID, Vokabel Vokabel, int SpiellisteID, Map<int,bool> Antworten, List<String> Antwortoptionen;)

}
