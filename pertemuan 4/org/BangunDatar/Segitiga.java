package org.BangunDatar;

import org.Poligon.Poligon;

public class Segitiga extends Poligon {
    private double sisiA, sisiB, sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC, int jumlahSisi) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        double s, luas;
        s = 0.5*(sisiA+sisiB+sisiC);
        luas = Math.sqrt(s*(s-sisiA)*(s-sisiB)*(s-sisiC));
        return luas;
    }

    public void printInfo() {
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }
}
