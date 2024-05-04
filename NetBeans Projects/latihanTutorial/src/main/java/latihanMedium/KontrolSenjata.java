/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author PAVILION GAMING
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }
    
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int peluru) {
        System.out.printf("Siap menembak %d kali\n", peluru);
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
        } else {
            for (int i=0; i<peluru; i++) {
                if (isAdaPeluru()) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(-1);
                } else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Jleb!";
        } else {
            return "Gagal, belum pasang bayonet.";
        }
    }
    
    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
