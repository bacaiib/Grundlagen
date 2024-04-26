package OOP.comcave;

public class Mitarbeiter {

    private String vorname;
    private String nachname;
    private int nr;
    private byte urlaubstage;



    public int getNR() {
        return nr;
    }
    public void setNR(int value){
        nr = value;
        }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public byte getUrlaubstage() {
        return urlaubstage;
    }

    public void setUrlaubstage(byte urlaubstage) {
        this.urlaubstage = urlaubstage;
    }
}

