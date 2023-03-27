/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatu;

/**
 *
 * @author TUF-GK
 */
public class SepatuLari extends Sepatu {
    protected String tipeLari;

    public SepatuLari(String merk, int ukuran, int harga, String tipeLari) {
        super("Sepatu Lari", merk, ukuran, harga);
        this.tipeLari = tipeLari;
    }

    public String getTipeLari() {
        return tipeLari;
    }

    public void setTipeLari(String tipeLari) {
        this.tipeLari = tipeLari;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe Lari   : " + tipeLari);
    }
}
