public class Titik {
    private double absis, ordinat;
    private static int counterTitik;

    public Titik(double x, double y) {
        absis = x;
        ordinat = y;
        Titik.counterTitik += 1;
    }

    public Titik() {
        this(0, 0);
    }

    public double getAbsis() {
        return this.absis;
    }

    public double getOrdinat() {
        return this.ordinat;
    }
    
    public void setAbsis(double x) {
        this.absis = x;
    }
    
    public void setOrdinat(double y) {
        this.absis = y;
    }

    public static int getCounterTitik() {
        return Titik.counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    public void refleksiX() {
        this.ordinat *= -1;
    }

    public void refleksiY() {
        this.absis *= -1;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, this.ordinat*-1);
    }

    public Titik getRefleksiY() {
        return new Titik(this.absis*-1, this.ordinat);
    }
}