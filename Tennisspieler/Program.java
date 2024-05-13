package Tennisspieler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {
        array();
    }

    private static void array() {

        TreeSet<Player> gamerList = new TreeSet<>();
        gamerList.add(new Player(3, "Daniil", "Medvedev", "Russia"));
        gamerList.add(new Player(2,"Carlos","Alcaraz","Spain"));
        gamerList.add(new Player(1,"Novak","Djokovic","Serbia"));
        gamerList.add(new Player(1,"Novak","Djokovic","Serbia"));
        //Collections.sort(gamerList);
        System.out.println(gamerList);
    }
}
