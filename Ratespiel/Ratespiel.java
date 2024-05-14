package Ratespiel;


import java.util.Scanner;

public class Ratespiel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int wiederholung;
        do {
            int zuEraten = (int) (Math.random() * 100) + 1;
            int tipp;
            int count = 0;
            System.out.println("Wilkommen zum Ratenspiel!");
            System.out.println("-------------------------");
            System.out.println("Sie müssen eine Zahl zwischen 1 und 100 eraten!");
            System.out.println("Geben sie ihren Tipp ab");

            do {
                tipp = sc.nextInt();
                count++;
                if (tipp < zuEraten) {
                    System.out.println("Die Zahl ist größer");

                }
                else if (tipp > zuEraten) {
                    System.out.println("Die Zahl ist kleiner");

                }
            } while (tipp != zuEraten);
            {
                System.out.println("Volltreffer! Die Zahl ist " + zuEraten);
                System.out.println("Sie haben " + count + " Versuche gebraucht");
            }

            System.out.println("Wenn Sie noch mal spielen wollen geben sie eine 1 ein!");
            wiederholung = sc.nextInt();

        } while (wiederholung == 1);

        sc.close();
    }
}
