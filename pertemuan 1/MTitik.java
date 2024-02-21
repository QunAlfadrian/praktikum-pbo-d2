public class MTitik {
    public static void main(String[] args) {
        Titik t1, t2;
        int counterTitik;

        t1 = new Titik(1, 2);
        t2 = new Titik(3, 4);
        counterTitik = Titik.getCounterTitik();

        System.out.printf("Jumlah objek titik: %d\n", counterTitik);
        System.out.printf("t1 adalah titik dengan asbsis: %.2f, ordinat: %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("t2 adalah titik dengan asbsis: %.2f, ordinat: %.2f\n", t2.getAbsis(), t2.getOrdinat());
    }
}
