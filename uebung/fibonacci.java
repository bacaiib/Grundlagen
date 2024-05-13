package uebung;

import org.w3c.dom.ls.LSOutput;

public class fibonacci {

    public static void main(String[] args) {
        //System.out.println(fibonacci(4));

        int [] fibon = fibonacci1(10);

        for (int n : fibon ){
            System.out.println(n);
        }

    }

    static int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0; // hat am Anfang der Schleife den Wert Fib (i −2)1,1,2
            int b = 1; // hat am Anfang der Schleife den Wert Fib (i −1)1,2,3
            int i = 2; //3
            while (i <= n) {
                int aa = b; // Wert von Fib (i −1) 1,2,3
                int bb = a + b; // Wert von Fib (i) 2,3,5
                a = aa; // Hilfsvariable f{ "u }r Folgedurchgang
                b = bb; // Hilfsvariable f{ "u }r Folgedurchgang
                i++;
            }
            return b;

        }


    }

    static int fib(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0;
            int b = 1;
            int i = 2;
            while (i <= n) {
                int aa = b;
                int bb = a + b;
                a = aa;
                b = bb;
                i++;

            }
            return b;
        }
    }

public static int [] fibonacci1( int n){
    if (n <1){
        return new int[0];
    } else if (n == 1){
        return new int[1];
    } else {
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        } return fib;
    }
  }
}






//
//for (int i = 0;i<nummer;i++){
//
//        }
//
//int a = 1;
//int b = 1;
//int c = 2;
//add(0) = a;
//add(1) = a+b;
//add(2) = (1) + a;
//add(3) = (2) + (1);
//add(4) = (3) + (2);