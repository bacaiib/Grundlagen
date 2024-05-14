package Uni;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean beenden = false;
        while (!beenden){
            System.out.println("Wilkommen zum Stundentenverwaltungssystem!");
            System.out.println("1. Neuen Stunden hinzufügen");
            System.out.println("2. Informationen zu einem bestimmten Stundten ausgeben");
            System.out.println("3 Liste alles Stunden anzeigen");
            System.out.println("4. Beenden");
            System.out.println("Wählen Sie eine Optione");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    System.out.println("Geben Sie Ihre StudentenID ein:");
                    student.setStudentID(sc.nextInt());
                    System.out.println("Geben Sie Ihren Namen ein:");
                    student.setStudentName(sc.next());
                    System.out.println("Geben Sie Iht Alter an:");
                    student.setAge(sc.nextInt());
                    System.out.println("Geben Sie Ihren Studiengang ein:");
                    student.setSubjectOfStudy(sc.next());
                    students.add(student);
                    break;
                case 2:
                    System.out.println("Geben Sie eine StudentenID ein: ");
                    int auswahl = sc.nextInt();
                    if (auswahl == Student.getStudentID()){
                        System.out.println(students.get(auswahl));
                    }break;
                case 3:
                    for (Student person : students){
                        System.out.println(person.toString());
                    }break;
                case 4:
                    beenden = true;


            }
        }

    }
}
