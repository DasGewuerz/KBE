public class Vokabel {
    private int VokabelID;
    private boolean Gelernt;
    private String Vokabel1;
    private List<String> Vokabel2;

    public Vokabel(int VokabelID, boolean Gelernt, String Vokabel1, List<String> Vokabel2) {
        this.VokabelID = VokabelID;
        this.Vokabel1 = Vokabel1;
        this.Vokabel2 = Vokabel2;
    }

    public int getVokabelID() {
        return VokabelID;
    }

    public void setVokabelID(int VokabelID) {
        this.VokabelID = VokabelID;
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

    public void setVokabel2(List<String> Vokabel2) {
        this.Vokabel2 = Vokabel2;
    }

    @Override
    public String toString() {
        return "Vokabel{" + "VokabelID=" + VokabelID + ", Gelernt=" + Gelernt + ", Vokabel1=" + Vokabel1 + ", Vokabel2=" + Vokabel2 + '}';
    }
    
}
