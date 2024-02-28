public class Garis {
    private Titik titikAwal, titikAkhir;
    private static int counterGaris;

    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        Garis.counterGaris += 1;
    }

    public Garis() {
        Garis.counterGaris += 1;
    }

    public static int getCounterGaris() {
        return Garis.counterGaris;
    }

    public double getPanjang() {
        double deltaX, deltaY, result;
        deltaX = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        deltaY = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
        result = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        return result;
    }

    public double getGradien() {
        double deltaX, deltaY, result;
        deltaX = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        deltaY = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
        result = deltaY/deltaX;
        return result;
    }

    public Garis getRefleksiY() {
        return new Garis(this.titikAwal.getRefleksiY(), this.titikAkhir.getRefleksiY());
    }

    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }
}
