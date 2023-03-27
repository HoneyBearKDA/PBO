/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatu;

/**
 *
 * @author TUF-GK
 */
public class SepatuBasket extends Sepatu {
    protected String tipeBasket;

    public SepatuBasket(String merk, int ukuran, int harga, String tipeBasket) {
        super("Sepatu Basket", merk, ukuran, harga);
        this.tipeBasket = tipeBasket;
    }

    public String getTipeBasket() {
        return tipeBasket;
    }

    public void setTipeBasket(String tipeBasket) {
        this.tipeBasket = tipeBasket;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe Basket : " + tipeBasket);
    }
}
