package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Program {
    public Program() {
    }

    public static void main(String[] args) {
        array();
        arrayList_Vector();
    }

    private static void arrayList_Vector() {
        ArrayList<PlzOrt> plzOrtListe = new ArrayList();
        plzOrtListe.add(new PlzOrt("12345", "Berlin"));
        System.out.println(((PlzOrt)plzOrtListe.get(0)).getOrt());
        ArrayList<Artikel> artikelListe = new ArrayList();
        Artikel artikel = new Artikel(2, "Samsung Galaxy", 1200.5);
        artikelListe.add(artikel);
        artikelListe.add(new Artikel(4, "Waschmaschine", 800.0));
        artikelListe.add(new Artikel(1, "IPhone", 1000.0));
        artikelListe.add(new Artikel(3, "USB Kabel", 5.0));
        System.out.println(artikelListe.get(1));
        artikelListe.remove(1);
        System.out.println(artikelListe.get(1));
        System.out.println("ArrayList Größe: " + artikelListe.size());
        Iterator var4 = artikelListe.iterator();

        while(var4.hasNext()) {
            Artikel a = (Artikel)var4.next();
            System.out.println(a);
        }

        Vector<Artikel> artikelVector = new Vector();
        artikelVector.add(artikel);
        System.out.println(artikelVector.get(0));
        ArrayList<Integer> zahlenListe = new ArrayList();
        zahlenListe.add(100);
        zahlenListe.add(50);
        Collections.sort(zahlenListe);
        Artikel a = new Artikel(1, "A", 50.0);
        Artikel b = new Artikel(2, "B", 50.0);
        System.out.println(a.compareTo(b));
        System.out.println("Artikel sortiert:");
        Collections.sort(artikelListe);
        Collections.shuffle(artikelListe);
        Iterator var8 = artikelListe.iterator();

        while(var8.hasNext()) {
            Artikel art = (Artikel)var8.next();
            System.out.println(art);
        }

        System.out.println("MIN");
        System.out.println(Collections.min(artikelListe));
        System.out.println("MAX");
        System.out.println(Collections.max(artikelListe));
    }

    private static void array() {
        int[] zahlen = new int[]{100, 500, 200, 50, 80};
        System.out.println("Arraygröße: " + zahlen.length);
        Arrays.sort(zahlen);

        int z;
        for(z = 0; z < zahlen.length; ++z) {
            System.out.println(zahlen[z]);
        }

        int[] values = zahlen;
        int var3 = zahlen.length;

        for(int var2 = 0; var2 < var3; ++var2) {
            z = values[var2];
            System.out.println(z);
        }

        String[][] plzOrt = new String[4][2];
        plzOrt[0][0] = "12345";
        plzOrt[0][1] = "Berlin";
        plzOrt[1][0] = "23456";
        plzOrt[1][1] = "München";
        plzOrt[2][0] = "34567";
        plzOrt[2][1] = "Köln";
        String[] datensatz = new String[]{"45678", "Duisburg"};
        plzOrt[3] = datensatz;
        String[][] plzOrt2 = new String[][]{{"12345", "Berlin"}, {"23456", "München"}, {"34567", "Köln"}};
        System.out.println(plzOrt2[2][1]);
        values = new int[]{60, 40, 80, 20, 10};

        int value;
        int j;
        int i;
        for(value = 0; value < values.length - 1; ++value) {
            for(j = 0; j < values.length - 1 - value; ++j) {
                if (values[j] > values[j + 1]) {
                    i = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = i;
                }
            }
        }

        int[] var8 = values;
        i = values.length;

        for(j = 0; j < i; ++j) {
            value = var8[j];
            System.out.println(value);
        }

        String s1 = "Köln";
        String s2 = "Aachen";
        System.out.println(s1.compareTo(s2) > 0);

//        for(i = 0; i < plzOrt.length - 1; ++i) {
//            for(int j = 0; j < plzOrt.length - 1 - i; ++j) {
//                if (plzOrt[j][0].compareTo(plzOrt[j + 1][0]) > 0) {
//                    String[] temp = plzOrt[j];
//                    plzOrt[j] = plzOrt[j + 1];
//                    plzOrt[j + 1] = temp;
//                }
//            }
//        }

        for(i = 0; i < plzOrt.length; ++i) {
            System.out.println(plzOrt[i][0] + " - " + plzOrt[i][1]);
        }

    }
}
