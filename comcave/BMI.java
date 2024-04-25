package comcave;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        float gewicht;
        float groeße;
        float BMI;

        System.out.println("Gaben Sie ihr Gewicht ein:");
        gewicht = new Scanner(System.in).nextFloat();
        System.out.println("Geben Sie ihre Größe ein:");
        groeße = new Scanner(System.in).nextFloat();

        BMI = gewicht / (groeße*groeße);
        System.out.println("Ihr BMI beträgt: "+BMI);

        if (BMI < 18.5) {
            System.out.println("Sie haben untergewicht");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Sie haben normalgewicht");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Sie haben übergewicht");
        } else if (BMI >= 30 && BMI <= 34.9) {
            System.out.println("Uhhhh Adipositas");
        } else if (BMI >= 35 && BMI <= 39.9) {
            System.out.println("Ihhhh Adipositas level 2 jungeee");
        } else if (BMI >= 40) {
            System.out.println("Nimm fucking ab oder du stirbst");
        }
    }
}
