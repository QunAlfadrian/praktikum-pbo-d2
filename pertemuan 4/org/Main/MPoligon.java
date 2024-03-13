package org.Main;

import org.BangunDatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga2 = new Segitiga(3, 4, 5, 3);

        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        segitiga2.printInfo();
        System.out.println("Luas Segitiga : " + segitiga2.hitungLuas());
    }
}
