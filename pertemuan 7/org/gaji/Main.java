package org.gaji;

public class Main {
    public static void main(String[] args) {
        /* 10b 3c */
        System.out.println();

        Pegawai pegawai, pegawai2, pegawai3;

        pegawai = new Programmer("Mira");
        pegawai2 = new Manajer("Joko");
        pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
