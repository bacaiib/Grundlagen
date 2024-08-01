package Verlanden;

public class Auftrag {

    private int ID;
    private int geordertePaletten;
    private boolean verladen;
    public int FahrzeugID;

    public Auftrag(int ID, int geordertePaletten) {
        this.ID = ID;
        this.geordertePaletten = geordertePaletten;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getGeordertePaletten() {
        return geordertePaletten;
    }
    public void setGeordertePaletten(int geordertePaletten) {
        this.geordertePaletten = geordertePaletten;
    }
    public boolean isVerladen() {
        return verladen;
    }
    public void setVerladen(boolean verladen) {
        this.verladen = verladen;
    }
}
