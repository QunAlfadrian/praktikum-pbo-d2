// File      : Titik.java          21/02/24
// Penulis   : Qun Alfadrian Setyowahyu Putro
// Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Titik {
    private double absis, ordinat;
    private static int counterTitik;

    public Titik(double absisIn, double ordinatIn) {
        absis = absisIn;
        ordinat = ordinatIn;
        counterTitik += 1;
    }

    public Titik() {
        absis = 0;
        ordinat = 0;
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

    public void getInfoTitik() {
        System.out.printf("(%.2f, %.2f)\n", absis, ordinat);
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
    }

    public void refleksiX() {
        ordinat *= -1;
    }

    public void refleksiY() {
        absis *= -1;
    }

    public Titik getRefleksiX() {
        return new Titik(absis, ordinat*-1);
    }

    public Titik getRefleksiY() {
        return new Titik(absis*-1, ordinat);
    }
}