package Dateien;

import java.io.*;

public class Program {

    public static void main(String[] args) {
        textDateienSchreiben();
    }

    private static void textDateienSchreiben(){
       /* BufferedWriter bw = null;
        try {
            FileWriter fw = new FileWriter("datei.txt");
            bw = new BufferedWriter(fw);
            bw.write("Java ist OK");
            bw.newLine();
            bw.write("2. Zeile");
            bw.newLine();

//            int i = Integer.parseInt("abc");
//            int[] array = new int[10];
//            array[10] = 100;
            bw.flush(); // Schreibvorgang erzwingen, Schreibpuffer leeren
 //           fw.close(); einer reicht der zweite
            bw.close(); // SChließt Datei/Datenstro,
            System.out.println("Datei wurde gespeichert");
        }catch(Exception e){
            System.out.println("Datei Fehler");
            try {
                bw.close();
            } catch (Exception e1) {
                System.out.println("Fehler beim Datei schließen");
            }
        } finally {
            System.out.println("Wird immer ausgeführt");
        } */
        //-------------------------------------------------
        // try-with
        try ( // von allen Objekten im with-Block wird die close-Methoden aufgerufen
                BufferedWriter bw =
                        new BufferedWriter(new FileWriter("datei.txt"))
        ) {
            bw.write("Schreibvorgang");
            System.out.println("Datei geschrieben");

        }catch (Exception e){
            System.out.println("Fehler");
        }
//        catch(NumberFormatException e){
//            System.out.println("Fehler beim parsen der Datei");
//        }catch(Exception e){
//            System.out.println("Fehler");
//        }
    }
}
