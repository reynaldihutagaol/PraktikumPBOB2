/*
File      : Titik.java
Deskripsi : Class Titik
Pembuat   : Reynaldi Bertinus Hutagaol
Tanggal   : 19 Februari 2026
*/

public class Titik {

    double absis;
    double ordinat;

    // Constructor
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    // Method tampilkan titik
    public void printTitik() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }

    // Getter
    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    // Setter
    public void setAbsis(double absis) {
        this.absis = absis;
    }

    public void setOrdinat(double ordinat) {
        this.ordinat = ordinat;
    }

    // Method geser titik
    public void geser(double dx, double dy) {
        absis += dx;
        ordinat += dy;
    }
}
