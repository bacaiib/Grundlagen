package arrays;

public class Artikel implements Comparable<Artikel> {
    private int nr;
    private String bezeichung;
    private double preis;

    public String toString() {
        return this.nr + " " + this.bezeichung + " " + this.preis;
    }

    public Artikel() {
    }

    public Artikel(int nr, String bezeichung, double preis) {
        this.nr = nr;
        this.bezeichung = bezeichung;
        this.preis = preis;
    }

    public int getNr() {
        return this.nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public String getBezeichung() {
        return this.bezeichung;
    }

    public void setBezeichung(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int compareTo(Artikel artikel) {
        if (this.preis > artikel.preis) {
            return 1;
        } else {
            return this.preis < artikel.preis ? -1 : 0;
        }
    }
}