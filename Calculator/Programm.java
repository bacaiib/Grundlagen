package Calculator;

import java.util.Scanner;

public class Programm {

    public static void main(String[] args) {
        operationen operator = new operationen();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nr 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter a nr 2: ");
        float b = sc.nextFloat();
        System.out.println("Enter an operator: ");
        String op = sc.next();
        float result = 0;
        boolean valid = true;
        switch (op) {
            case "+":
                result = operator.add(a, b);
                break;
            case "-":
                result = operator.sub(a, b);
                break;
            case "*":
                result = operator.mul(a, b);
                break;
            case "/":
                result = operator.div(a, b);
                break;
            default:
                System.out.println("Kein Gültiger Operator");
                valid = false;
                return;
        }
//        if (op.equals("+")) {
//            result = operator.add(a, b);
//        } else if (op.equals("-")) {
//            result = operator.sub(a, b);
//        } else if (op.equals("*")) {
//            result = operator.mul(a, b);
//        } else if (op.equals("/")) {
//            result = operator.div(a, b);
//        } else {
//            System.out.println("Invalid operator");
//            valid = false;
//        }
        if (valid = true) {
            System.out.println(result);
        }

    }

}
