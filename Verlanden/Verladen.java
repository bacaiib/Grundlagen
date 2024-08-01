package Verlanden;

public class Verladen {

    public static void main(String[] args) {
        Auftraege.createAuftrag();
        Fahrzeuge.createFahrzeug();
        verladeAuftrag();
    }

    public static void verladeAuftrag(){

        for (int k = 0; k<Fahrzeuge.size();k++){
                Fahrzeug f = Fahrzeuge.getFahrzeug(k);
            for (int j = 0; j<Auftraege.size();j++){
                Auftrag a = Auftraege.getAuftrag(j);
                if (a.isVerladen()){
                 continue;
                }
                else if (f.getPalettenFrei()>=a.getGeordertePaletten()) {
                    f.verladeAuftrag(a);
                    //a.setVerladen(true);
                }

            }
        }
    }
}
