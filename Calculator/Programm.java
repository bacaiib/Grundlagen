package Calculator;

import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an float: ");
        operationen test = new operationen();

        System.out.println(test.div(sc.nextFloat(), sc.nextFloat()));

    }
}
