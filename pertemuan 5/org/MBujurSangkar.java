package org;

import java.util.Scanner;

import org.bangunDatar.BujurSangkar;

public class MBujurSangkar {
    public static void main(String[] args) {
        double sisi;

        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + 
            " satuan adalah " + bs.hitungLuas(sisi));
    }
}
