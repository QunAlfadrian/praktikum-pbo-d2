package org;

import java.util.Scanner;

import org.bangunDatar.Lingkaran;

public class MLingkaran {  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double radius;

        System.out.println("Masukkan radius lingkaran: ");
        radius = scan.nextDouble();
        Lingkaran l = new Lingkaran(radius);
        System.out.println("Luas lingkaran dengan jejari "+ radius +
            " satuan adalah " + l.hitungLuas());
    }
    
}
