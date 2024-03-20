package org.bangunDatar;

import org.interfaces.IArea;

public class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return Math.PI*jejari*jejari;
    }
}
