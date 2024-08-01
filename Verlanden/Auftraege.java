package Verlanden;

import java.util.ArrayList;

public class Auftraege {
    // Anzahl der Auftraege
    private static int anzAuftraege = 10;
    // Auftragsspeicher
    private static ArrayList<Auftrag> auftraege = new ArrayList<Auftrag>();
    // liefert die Anzahl der Aufträge zurück,
    public static int size() {
        return anzAuftraege;
    }
    // Initialisierung der Aufträge in einem statischen Block - sowas geht auch
// hier werden einfach Testdaten erstellt
// die georderte Paletten werden berechnet von 22 an absteigend
    static void createAuftrag(){
        for (int i = 0; i < anzAuftraege; i++) {
            Auftrag a = new Auftrag(i+1,22-i);
            auftraege.add(a);
        }
    }
    // liefert einen spezielles Auftrag aus der Auftragsliste zurück
    public static Auftrag getAuftrag(int n) {
        return auftraege.get(n);
    }

}
