package Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Konto konto1 = new Konto(44569977,600.50);

        boolean beenden = false;
        while (!beenden){

            System.out.println("Willkommen bei Ihrer Bank");
            System.out.println("1. Einzahlen");
            System.out.println("2. Abbuchen");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");
            System.out.println("Wählen Sie eine Option");
            int auswahl = sc.nextInt();
            if (auswahl == 1) {
                System.out.println("Geben Sie einen Betrag ein:");
                double einzahlung = sc.nextDouble();
                konto1.einzahlen(einzahlung);
            } else if (auswahl == 2) {
                System.out.println("Geben Sie einen Betrag ein:");
                double abbuchen = sc.nextDouble();
                konto1.abheben(abbuchen);
            } else if (auswahl == 3) {
                konto1.showKonto();
            } else if (auswahl == 4) {
                beenden = true;
            }

        }

    }
}
