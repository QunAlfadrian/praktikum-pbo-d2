public class Main {
    public static void main(String[] args) {
        Titik t1, t2;
        Garis g1, g2;

        t1 = new Titik(2, 2);
        t2 = new Titik(0, 0);

        System.out.printf("Titik t1: ");
        t1.getInfoTitik();
        System.out.printf("Titik t2: ");
        t2.getInfoTitik();

        g1 = new Garis(t2, t1);
        System.out.println(g1.getPanjang());
        System.out.println(g1.getGradient());
        
        g2 = new Garis(new Titik(2, 0), new Titik(0, 1));
        System.out.println(g1.isTegakLurus(g2));
    }
}
