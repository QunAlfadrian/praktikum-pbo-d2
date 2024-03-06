package lab;

class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliilng() {
        double keliling;
        keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari;

        jariJari = 0;
        assert(jariJari>0): "jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double keliling = l.hitungKeliilng();
        System.out.println("Keliling lingkaran = " + keliling);
    }
}
