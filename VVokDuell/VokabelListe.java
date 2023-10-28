import java.util.List;

public class VokabelListe {
    private long VokabellisteID;
    private List<Vokabel> Vokabeln;
    private String Name;
    private String Sprache1;
    private String Sprache2;

    
    public VokabelListe(long VokabellisteID, List<Vokabel> Vokabeln, String Name, String Sprache1, String Sprache2) {
        this.VokabellisteID = VokabellisteID;
        this.Vokabeln = Vokabeln;
        this.Name = Name;
        this.Sprache1 = Sprache1;
        this.Sprache2 = Sprache2;
    }

    public long getVokabellisteID() {
        return VokabellisteID;
    }

    public void setVokabellisteID(long VokabellisteID) {
        this.VokabellisteID = VokabellisteID;
    }

    public List<Vokabel> getVokabeln() {
        return Vokabeln;
    }

    public void setVokabeln(List<Vokabel> Vokabeln) {
        this.Vokabeln = Vokabeln;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


    public String getSprache1() {
        return Sprache1;
    }

    public void setSprache1(String Sprache1) {
        this.Sprache1 = Sprache1;
    }

    public String getSprache2() {
        return Sprache2;
    }

    public void setSprache2(String Sprache2) {
        this.Sprache2 = Sprache2;
    }

    @Override
    public String toString() {
        return "VokabelListe{" + "VokabellisteID=" + VokabellisteID + ", Vokabeln=" + Vokabeln + ", Name=" + Name + ", Sprache1=" + Sprache1 + ", Sprache2=" + Sprache2 + '}';
    }
    
}