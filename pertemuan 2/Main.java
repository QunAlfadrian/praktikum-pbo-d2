public class Main {
    public static void main(String[] args) {
        Titik t1, t2, t3, t4;
        Garis g1, g2;


        t1 = new Titik();
        t2 = new Titik(2, 2);
        t3 = new Titik(2, 0);
        t4 = new Titik(0, 2);

        System.out.println(t1.getJarakPusat());
        System.out.println(t2.getJarakPusat());

        g1 = new Garis(t1, t2);
        g2 = new Garis(t3, t4);

        System.out.println(g1.isTegakLurus(g2));
    }
}
