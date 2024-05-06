package Tennisspieler;

public class Player implements Comparable<Player>{

    private int rank;
    private String firstname;
    private String lastname;
    private String country;


    public String toString(){
        return this.rank+". "+this.firstname + " " + lastname + " " + country;
    }

    public Player(int rank, String firstname, String lastname, String country) {
        this.rank = rank;
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCity(String city) {
        this.country = city;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int compareTo(Player p) {
//        int compareResult = this.country.compareTo(p.country);
//        if (compareResult > 0) {
//            return 1;
//        } else if (compareResult < 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//        if (this.rank > p.rank) {
//            return 1;
//        } else if (this.rank < p.rank) {
//            return -1;
//        } else {
//            return 0;
//        }

        int compareResult;
        if (this.rank > p.rank){
            return 1;
        } else if (this.rank < p.rank){
            return -1;
        } else {
            return 0;
        }

//        if (this.firstname.compareTo(p.firstname) > 0 {
//            return 1;
//        }else if {
//            return this.firstname.compareTo(p.firstname) < 0 {
//                return -1;
//            } else return 0;
//        }
    }

}
