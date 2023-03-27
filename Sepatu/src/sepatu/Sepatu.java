/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sepatu;

public class Sepatu {
    protected String jenisSepatu;
    protected String merk;
    protected int ukuran;
    protected int harga;

    public Sepatu(String jenisSepatu, String merk, int ukuran, int harga) {
        this.jenisSepatu = jenisSepatu;
        this.merk = merk;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public String getJenisSepatu() {
        return jenisSepatu;
    }

    public String getMerk() {
        return merk;
    }

    public int getUkuran() {
        return ukuran;
    }

    public int getHarga() {
        return harga;
    }

    public void setJenisSepatu(String jenisSepatu) {
        this.jenisSepatu = jenisSepatu;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Jenis Sepatu: " + jenisSepatu);
        System.out.println("Merk        : " + merk);
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Harga       : " + harga);
    }
}


