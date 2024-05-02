/* 
 * Nama : Qun Alfadrian S. P
 * NIM  : 24060122130072
 */
package org.gaji;

public class Manajer extends Pegawai {
    private int tunjangan;

    public Manajer(String nama) {
        super();
        setNama(nama);
        this.tunjangan = 700000;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}