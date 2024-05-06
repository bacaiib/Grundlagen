package Tennisspieler;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    public static void main(String[] args) {
        array();
    }

    private static void array() {

        ArrayList<Player> gamerList = new ArrayList();
        gamerList.add(new Player(3, "Daniil", "Medvedev", "Russia"));
        gamerList.add(new Player(2,"Carlos","Alcaraz","Spain"));
        gamerList.add(new Player(1,"Novak","Djokovic","Serbia"));
        Collections.sort(gamerList);
        System.out.println(gamerList);
    }
}
