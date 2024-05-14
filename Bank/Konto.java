package Bank;

public class Konto {

    private int kontoID;
    private double kontoBalance;

    public Konto(int kontoID, double kontoBalance) {
        this.kontoID = kontoID;
        this.kontoBalance = kontoBalance;
    }

    public int getKontoID() {
        return kontoID;
    }
    public void setKontoID(int kontoID) {
        this.kontoID = kontoID;
    }
    public double getKontoBalance() {
        return kontoBalance;
    }
    public void setKontoBalance(double kontoBalance) {
        this.kontoBalance = kontoBalance;
    }

    public void einzahlen(double betrag){
            kontoBalance += betrag;
        System.out.println("Der neue Kontostand beträgt: " + kontoBalance);
    }
    public void abheben(double betrag){
        if (kontoBalance >= betrag){
            kontoBalance -= betrag;
            System.out.println("Der neue Kontostand beträgt: " + kontoBalance);
        } else {
            System.out.println("Ihr Konto ist nicht ausreichend gedeckt");
        }
    }

    public void showKonto(){
        System.out.println("KontoBalance: " + kontoBalance);
    }
}
