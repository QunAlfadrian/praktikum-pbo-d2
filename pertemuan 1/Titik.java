// File      : Titik.java          21/02/24
// Penulis   : Qun Alfadrian Setyowahyu Putro
// Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Titik {
    private double absis, ordinat;
    private static int counterTitik;

    Titik(double absisIn, double ordinatIn) {
        absis = absisIn;
        ordinat = ordinatIn;
        counterTitik += 1;
    }

    public void setAbsis(double absisIn) {
        absis = absisIn;
    }

    public void setOrdinat(double ordinatIn) {
        ordinat = ordinatIn;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public static int getCounterTitik() {
        System.out.format("%d", counterTitik);
        return counterTitik;
    }
}
