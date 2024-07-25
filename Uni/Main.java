package Uni;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean beenden = false;
        while (!beenden) {
            System.out.println("Wilkommen zum Stundentenverwaltungssystem!");
            System.out.println("1. Neuen Stunden hinzufügen");
            System.out.println("2. Informationen zu einem bestimmten Stundten ausgeben");
            System.out.println("3 Liste alles Stunden anzeigen");
            System.out.println("4. Beenden");
            System.out.println("Wählen Sie eine Optione");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Geben Sie Ihre StudentenID ein:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Geben Sie Ihren Namen ein:");
                    String name = sc.next();
                    sc.nextLine();
                    System.out.println("Geben Sie Iht Alter an:");
                    int alter = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Geben Sie Ihren Studiengang ein:");
                    String studiengang = sc.next();
                    sc.nextLine();
                    students.add(new Student(id, name, alter, studiengang));
                    System.out.println("Student wurde hinzugefügt!");
                    break;
                case 2:
                    System.out.println("Geben Sie eine StudentenID ein: ");
                    int auswahl = sc.nextInt();
                    Student student1 = null;
                    for (Student stud : students) {
                        if (auswahl == stud.getStudentID()) {
                            student1 = stud;
                            break;
                        }
                    }
                    if (student1 != null) {
                        System.out.println(student1);
                    } else {
                        System.out.println("nichts gefunden");
                    }
                    break;
                case 3:
                    for (Student person : students) {
                        System.out.println(person);
                    }
                    break;
                case 4:
                    beenden = true;


            }
        }
    sc.close();
    }
}
