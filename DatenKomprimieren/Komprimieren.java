package DatenKomprimieren;

import java.util.ArrayList;

public class Komprimieren {

    public static void main(String[] args) {


        ArrayList<String>NeuDaten = new ArrayList<>();
        ArrayList<String>RohDaten = new ArrayList<>();
        //String[] RohDaten = "hhhhhaaaajjjjeeerrrrrrkkkkk".split("");
        //RohDaten.add("hhhhhaaaajjjjeeerrrrrrkkkkk");

        for (char c : "hhhhhaaaajjjjeeerrrrrrkkkkk".toCharArray()) {
            RohDaten.add(String.valueOf(c));
        }
        int anzahl;
        int index;
        int i ;
        index = 0;

        while (index < RohDaten.size()) {
            anzahl = 0;
            i = index;

            while (i < RohDaten.size() && RohDaten.get(i).equals(RohDaten.get(index))) {
                anzahl = anzahl + 1;
                i = i + 1;
            }
            if (anzahl > 3){
                NeuDaten.add("§");
                NeuDaten.add(String.valueOf(anzahl));
                NeuDaten.add(RohDaten.get(index));
                index = index + anzahl;
            } else {
                i = 0;
                while (i < anzahl) {
                    NeuDaten.add(RohDaten.get(index));
                    i = i + 1;
                }
                index = index + anzahl;
            }

        }

        System.out.println(String.join("", RohDaten));
        System.out.println(String.join("", NeuDaten));

    }
}
