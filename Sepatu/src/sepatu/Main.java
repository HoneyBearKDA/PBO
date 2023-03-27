/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepatu;

import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Sepatu[] arrSepatu = new Sepatu[10];
    private static int count = 0;

    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n======== MENU ========");
            System.out.println("1. Tambah Data Sepatu");
            System.out.println("2. Tampil Data Sepatu");
            System.out.println("3. Ubah Data Sepatu");
            System.out.println("4. Hapus Data Sepatu");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    tampilData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }

    private static void tambahData() {
        String jenisSepatu, merk, tipe;
        int ukuran, harga;

        System.out.println("\n======== TAMBAH DATA SEPATU ========");
        System.out.print("Jenis Sepatu (1 = Sepatu Lari, 2 = Sepatu Basket): ");
        int jenis = input.nextInt();

        System.out.print("Merk        : ");
        merk = input.next();

        System.out.print("Ukuran      : ");
        ukuran = input.nextInt();

        System.out.print("Harga       : ");
        harga = input.nextInt();

        if (jenis == 1) {
            System.out.print("Tipe Lari   : ");
            tipe = input.next();

            SepatuLari sepatuLari = new SepatuLari(merk, ukuran, harga, tipe);
            arrSepatu[count] = sepatuLari;
        } else if (jenis == 2) {
            System.out.print("Tipe Basket : ");
            tipe = input.next();

            SepatuBasket sepatuBasket = new SepatuBasket(merk, ukuran, harga, tipe);
            arrSepatu[count] = sepatuBasket;
        } else {
            System.out.println("Pilihan jenis sepatu tidak valid!");
            return;
        }

        count++;
        System.out.println("Data sepatu berhasil ditambahkan.");
    }

    private static void tampilData() {
        System.out.println("\n======== DATA SEPATU ========");
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Data Sepatu ke-" + (i+1));
                arrSepatu[i].displayInfo();
                System.out.println();
            }
        } else {
            System.out.println("Belum ada data sepatu.");
        }
    }

    private static void ubahData() {
        int index;

        System.out.println("\n======== UBAH DATA SEPATU ========");
    if (count > 0) {
        tampilData();
        System.out.print("Pilih data sepatu yang akan diubah (1-" + count + "): ");
        index = input.nextInt() - 1;

        if (index >= 0 && index < count) {
            System.out.print("Merk baru    : ");
            arrSepatu[index].setMerk(input.next());

            System.out.print("Ukuran baru  : ");
            arrSepatu[index].setUkuran(input.nextInt());

            System.out.print("Harga baru   : ");
            arrSepatu[index].setHarga(input.nextInt());

            if (arrSepatu[index] instanceof SepatuLari) {
                System.out.print("Tipe Lari baru   : ");
                ((SepatuLari) arrSepatu[index]).setTipeLari(input.next());
            } else if (arrSepatu[index] instanceof SepatuBasket) {
                System.out.print("Tipe Basket baru : ");
                ((SepatuBasket) arrSepatu[index]).setTipeBasket(input.next());
            }

            System.out.println("Data sepatu berhasil diubah.");
        } else {
            System.out.println("Data sepatu tidak ditemukan!");
        }
    } else {
        System.out.println("Belum ada data sepatu.");
    }
}

private static void hapusData() {
    int index;

    System.out.println("\n======== HAPUS DATA SEPATU ========");
    if (count > 0) {
        tampilData();

        System.out.print("Pilih data sepatu yang akan dihapus (1-" + count + "): ");
        index = input.nextInt() - 1;

        if (index >= 0 && index < count) {
            for (int i = index; i < count - 1; i++) {
                arrSepatu[i] = arrSepatu[i + 1];
            }

            arrSepatu[count - 1] = null;
            count--;

            System.out.println("Data sepatu berhasil dihapus.");
        } else {
            System.out.println("Data sepatu tidak ditemukan!");
        }
    } else {
        System.out.println("Belum ada data sepatu.");
    }
}
}
