package htw.gruppe3.vokabelverwaltung.impl;

import java.util.List;
import htw.gruppe3.vokabelverwaltung.api.Vokabelverwaltung;
import htw.gruppe3.vokabelverwaltung.api.domain.Vokabel;
import htw.gruppe3.vokabelverwaltung.api.domain.VokabelListe;

/**
 * Implementierung des Vokabelverwaltung-Interfaces.
 */
public class VokabelverwaltungImpl implements Vokabelverwaltung{

    
    /** 
     * @param VokabelID
     * @param Vokabel1
     * @param Vokabel2
     * @return Vokabel
     */
    @Override
    public Vokabel erstelleVokabel(int VokabelID, String Vokabel1, List<String> Vokabel2) {
        return new Vokabel(VokabelID, Vokabel1, Vokabel2);
    }

    
    /** 
     * @param VokabellisteID
     * @param Vokabeln
     * @param Name
     * @param Sprache1
     * @param Sprache2
     * @return VokabelListe
     */
    @Override
    public VokabelListe erstelleVokabelListe( int VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2) {
        return new VokabelListe(VokabellisteID, Vokabeln, Name, Sprache1, Sprache2);
    }
    
}
