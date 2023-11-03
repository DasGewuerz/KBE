public interface Vokabelverwaltung {

    Vokabel erstelleVokabel( int VokabelID, boolean Gelernt, String Vokabel1, List<String> Vokabel2);

    VokabelListe erstelleVokabelListe( int VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2);
    
}
