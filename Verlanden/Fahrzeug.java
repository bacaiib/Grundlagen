package Verlanden;

public class Fahrzeug {

    private int fahrzeugID;
    private int palettenKapazitaet;
    private int palettenGeladen;
    private int palettenFrei;

    public Fahrzeug(int fahrzeugID, int palettenKapazitaet, int palettenGeladen, int palettenFrei){
        this.fahrzeugID = fahrzeugID;
        this.palettenKapazitaet = palettenKapazitaet;
        this.palettenGeladen = palettenGeladen;
        this.palettenFrei = palettenFrei;
    }


    public void verladeAuftrag(Auftrag a){

        System.out.println("Verlade Auftrag: " + a.getID() + " im Fahrzeug: " + fahrzeugID);
        System.out.println("Auftrag Palettenanzahl: " + a.getGeordertePaletten());
        System.out.println("Fahrzeug: " +fahrzeugID + " Paletten frei: " + palettenFrei);

        palettenFrei = palettenFrei - a.getGeordertePaletten();
        palettenGeladen = palettenGeladen + a.getGeordertePaletten();
        a.setVerladen(true);

        System.out.println("Fahrzeug: " + getFahrzeugID() + " frei: " + palettenFrei);

//        if (palettenFrei>a.getGeordertePaletten()){
//            palettenFrei =-a.getGeordertePaletten();
//        } else if (palettenGeladen>a.getGeordertePaletten()){
//            palettenGeladen =-a.getGeordertePaletten();
//        } else a.setVerladen(true);

    }

    public int getFahrzeugID() {
        return fahrzeugID;
    }
    public void setFahrzeugID(int fahrzeugID) {
        this.fahrzeugID = fahrzeugID;
    }
    public int getPalettenKapazitaet() {
        return palettenKapazitaet;
    }

    public void setPalettenKapazitaet(int palettenKapazitaet) {
        this.palettenKapazitaet = palettenKapazitaet;
    }
    public int getPalettenGeladen() {
        return palettenGeladen;
    }
    public void setPalettenGeladen(int palettenGeladen) {
        this.palettenGeladen = palettenGeladen;
    }
    public int getPalettenFrei() {
        return palettenFrei;
    }
    public void setPalettenFrei(int palettenFrei) {
        this.palettenFrei = palettenFrei;
    }
}
