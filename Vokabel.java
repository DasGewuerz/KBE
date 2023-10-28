

public class Vokabel {
    private long VokabelID;
    private boolean Gelernt;
    private String Vokabel1;
    private String Vokabel2;

    public Vokabel(long VokabelID, boolean Gelernt, String Vokabel1, String Vokabel2) {
        this.VokabelID = VokabelID;
        this.Gelernt = Gelernt;
        this.Vokabel1 = Vokabel1;
        this.Vokabel2 = Vokabel2;
    }

    public long getVokabelID() {
        return VokabelID;
    }

    public void setVokabelID(long VokabelID) {
        this.VokabelID = VokabelID;
    }

    public boolean isGelernt() {
        return Gelernt;
    }

    public void setGelernt(boolean Gelernt) {
        this.Gelernt = Gelernt;
    }

    public String getVokabel1() {
        return Vokabel1;
    }

    public void setVokabel1(String Vokabel1) {
        this.Vokabel1 = Vokabel1;
    }

    public String getVokabel2() {
        return Vokabel2;
    }

    public void setVokabel2(String Vokabel2) {
        this.Vokabel2 = Vokabel2;
    }

    @Override
    public String toString() {
        return "Vokabel{" + "VokabelID=" + VokabelID + ", Gelernt=" + Gelernt + ", Vokabel1=" + Vokabel1 + ", Vokabel2=" + Vokabel2 + '}';
    }

    
    
}
