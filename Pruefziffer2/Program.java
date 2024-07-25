package Pruefziffer2;

public class Program {


        // Berechnung der Quersumme einer übergebenen Zahl z
        private static int getQuersumme(int z) {
            int qs = 0;
            while (z != 0) {
                qs = qs + (z % 10);
                z = z / 10;
            }
            return qs;
        }


        private static int getZiffer(String s, int pos) {
            return Character.getNumericValue(s.charAt(pos));
        }

        public static int berechnePruefziffer(String zahl) {
            int summe = 0;
            int pz = 0;
            for (int i = 0; i < zahl.length(); i++) {
                int ziffer = getZiffer(zahl, i);
                if ((i + 1) % 2 != 0) {
                    summe = summe + getQuersumme(ziffer * 2);
                } else {
                    summe = summe + ziffer;
                }pz = 10 - (summe % 10);
            }
            return pz;
        }

        public static boolean prueffeZiffer(String zahl) {
            if (zahl.length() == 10) {
                if (berechnePruefziffer(zahl.substring(0,9)) == getZiffer(zahl, 9)){
                    return true;
                }
            } return false;
        }

        public static void main(String[] args) {
            System.out.println(berechnePruefziffer("625843197"));
            System.out.println(prueffeZiffer("6258431979"));

        }

}
