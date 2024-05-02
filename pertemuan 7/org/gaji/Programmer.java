package org.gaji;

public class Programmer extends Pegawai {
    private int bonus;

    public Programmer(String nama) {
        super();
        setNama(nama);
        this.bonus = 450000;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
