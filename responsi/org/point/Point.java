/*  NAMA    : QUN ALFADRIAN SETYOWAHYU PUTRO                                    */
/*  NIM     : 24060122130072                                                    */
/*  LAB     : D2                                                                */
/*  TANGGAL : 27 MARET 2024                                                     */package org.point;

public class Point {
    private double absis, ordinat;

    public Point() {

    }

    public Point(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public double getAbsis() {
        return absis;
    }

    public double getOrdinat() {
        return ordinat;
    }

    public void setAbsis(double x) {
        this.absis = x;
    }

    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    public void cetak() {
        System.out.println("(" + absis + ", " + ordinat + ")");
    }
}
