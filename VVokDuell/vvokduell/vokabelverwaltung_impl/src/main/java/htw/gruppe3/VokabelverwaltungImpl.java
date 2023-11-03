public class VokabelverwaltungImpl implements Vokabelverwaltung{

    @Override
    public Vokabel erstelleVokabel( int VokabelID, boolean Gelernt, String Vokabel1, List<String> Vokabel2) {
        return new Vokabel(VokabelID, Gelernt, Vokabel1, Vokabel2);
    }

    @Override
    public VokabelListe erstelleVokabelListe( int VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2) {
        return new VokabelListe(VokabellisteID, Vokabeln, Name, Sprache1, Sprache2);
    }
    
}
