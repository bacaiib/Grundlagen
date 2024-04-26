package OOP.comcave;

public class Program2 {
   static int x;
    public static void main(String[] args) {
        // Mitarbeiter-Daten erfassen:
        // nr, vorname, nachname, urlaubstage

        Mitarbeiter MisterX = createmitarbeiter();

        speak(MisterX);
        //Program2 p = new Program2();
        x = 9;
        System.out.println(x);


    }

    private static void speak(Mitarbeiter MisterX) {
        System.out.println("Hello Mister " + MisterX.getVorname()+" "+ MisterX.getNachname());
    }

    private static Mitarbeiter createmitarbeiter() {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter();
        mitarbeiter1.setNR(0);
        mitarbeiter1.setVorname("Jegor");
        mitarbeiter1.setNachname("Jefgeni");
        mitarbeiter1.setUrlaubstage((byte) 42);
        System.out.println(mitarbeiter1.getNR());
        System.out.println(mitarbeiter1.getNachname());
        return mitarbeiter1;
    }
}
