public class Garis {
    private Titik titikAwal, titikAkhir;
    private static int counterGaris;

    public Garis(Titik tAwal, Titik tAkhir) {
        titikAwal = tAwal;
        titikAkhir = tAkhir;
        counterGaris += 1;
    } 

    public Garis() { counterGaris += 1; }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik tAwal) {
        this.titikAwal = tAwal;
    } 

    public void setTitikAkhir(Titik tAkhir) {
        this.titikAkhir = tAkhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    public double getPanjang() {
        double deltaX, deltaY, result;
        deltaX = titikAkhir.getAbsis()-titikAwal.getAbsis();
        deltaY = titikAkhir.getOrdinat()-titikAwal.getOrdinat();
        result = Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2));
        return result;
    }

    public double getGradient() {
        double deltaX, deltaY, result;
        deltaX = titikAkhir.getAbsis()-titikAwal.getAbsis();
        deltaY = titikAkhir.getOrdinat()-titikAwal.getOrdinat();
        result = deltaY/deltaX;
        return result;
    }

    public Garis getRefleksiY() {
        return new Garis(titikAwal.getRefleksiY(), titikAkhir.getRefleksiY());
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradient()*G.getGradient() == -1;
    }
}
