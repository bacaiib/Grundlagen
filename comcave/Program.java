package comcave;

import java.util.Scanner;

import

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte zahl1 = 127;
        int zahl2= 130;
        zahl1 = (byte)zahl2;
        System.out.println(zahl1);

        double d = 99.99;
        zahl2 = (int)d;
        System.out.println(zahl2);

        double berechnung = 5d / 2;
        System.out.println(berechnung);

        char c = 97;
        char c2 = 'a';
        System.out.println((int)c2);

        String zeichenkette = "123";
        System.out.println(zeichenkette);

        int value = Integer.parseInt(zeichenkette);

        String umwandlung = value + "hallo";
        umwandlung = Integer.toString(value);
        umwandlung = String.valueOf(value);
        System.out.println(umwandlung);

        System.out.println("Geben sie eine Zahl von 1 bis 10");
        int eingabe = new Scanner(System.in).nextInt();
        if (eingabe != 1){
            System.out.println("Falsch");
        }
    }
}
