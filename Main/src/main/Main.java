/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private ArrayList<Sepatu> daftarSepatu;

    public Main() {
        scanner = new Scanner(System.in);
        daftarSepatu = new ArrayList<>();
    }

    public void tambahSepatu() {
    System.out.print("\nMerk: ");
    String merk = scanner.nextLine();
    
    System.out.print("Ukuran: ");
    int ukuran = 0;
    try {
        ukuran = scanner.nextInt();
    } catch (InputMismatchException e) {
        System.out.println("\nUkuran sepatu harus berupa bilangan bulat.");
        scanner.nextLine();
        return;
    }
    
    System.out.print("Harga: ");
    int harga = 0;
    try {
        harga = scanner.nextInt();
    } catch (InputMismatchException e) {
        System.out.println("\nHarga sepatu harus berupa bilangan bulat.");
        scanner.nextLine();
        return;
    }
    
    Sepatu sepatu = new Sepatu(merk, ukuran, harga);
    daftarSepatu.add(sepatu);
    System.out.println("\nData sepatu berhasil ditambahkan.");
}
    
    public void lihatDaftarSepatu() {
        if (daftarSepatu.size() == 0) {
            System.out.println("\nDaftar sepatu kosong.");
        } else {
            System.out.println("\nDaftar sepatu:");
            for (int i = 0; i < daftarSepatu.size(); i++) {
                Sepatu sepatu = daftarSepatu.get(i);
                System.out.println((i+1) + ". Merk: " + sepatu.getMerk() + ", Ukuran: " + sepatu.getUkuran() + ", Harga: " + sepatu.getHarga());
            }
            
            System.out.print("\nMasukkan nomor sepatu untuk melihat detail: ");
            int index = scanner.nextInt() - 1;
            
            if (index < 0 || index >= daftarSepatu.size()) {
                System.out.println("\nNomor sepatu tidak valid.");
            } else {
                Sepatu sepatu = daftarSepatu.get(index);
                System.out.println("\nDetail sepatu:");
                System.out.println("Merk: " + sepatu.getMerk());
                System.out.println("Ukuran: " + sepatu.getUkuran());
                System.out.println("Harga: " + sepatu.getHarga());
            }
        }
    }
    
    public void ubahSepatu() {
        if (daftarSepatu.size() == 0) {
            System.out.println("\nDaftar sepatu kosong.");
        } else {
            System.out.print("\nMasukkan nomor sepatu yang ingin diubah: ");
            int index = scanner.nextInt() - 1;
            
            if (index < 0 || index >= daftarSepatu.size()) {
                System.out.println("\nNomor sepatu tidak valid.");
            } else {
                scanner.nextLine();
                System.out.print("Masukkan merk sepatu baru: ");
                String merk = scanner.nextLine();
                
                System.out.print("Masukkan ukuran sepatu baru: ");
                int ukuran = scanner.nextInt();
                
                System.out.print("Masukkan harga sepatu baru: ");
                int harga = scanner.nextInt();
                
                Sepatu sepatuBaru = new Sepatu(merk, ukuran, harga);
            daftarSepatu.set(index, sepatuBaru);
            
            System.out.println("\nData sepatu berhasil diubah.");
        }
    }
}
    
public void hapusSepatu() {
    if (daftarSepatu.size() == 0) {
        System.out.println("\nDaftar sepatu kosong.");
    } else {
        System.out.print("\nMasukkan nomor sepatu yang ingin dihapus: ");
        int index = scanner.nextInt() - 1;
        
        if (index < 0 || index >= daftarSepatu.size()) {
            System.out.println("\nNomor sepatu tidak valid.");
        } else {
            daftarSepatu.remove(index);
            System.out.println("\nData sepatu berhasil dihapus.");
        }
    }
}

public static void main(String[] args) {
    Main main = new Main();
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah sepatu");
        System.out.println("2. Lihat daftar sepatu");
        System.out.println("3. Ubah sepatu");
        System.out.println("4. Hapus sepatu");
        System.out.println("5. Keluar");
        
        System.out.print("\nPilih menu: ");
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                main.tambahSepatu();
                break;
            case 2:
                main.lihatDaftarSepatu();
                break;
            case 3:
                main.ubahSepatu();
                break;
            case 4:
                main.hapusSepatu();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("\nPilihan tidak valid.");
        }
    }
}

class Sepatu {
private String merk;
private int ukuran;
private int harga;

public Sepatu(String merk, int ukuran, int harga) {
    this.merk = merk;
    this.ukuran = ukuran;
    this.harga = harga;
}

public String getMerk() {
    return merk;
}

public void setMerk(String merk) {
    this.merk = merk;
}

public int getUkuran() {
    return ukuran;
}

public void setUkuran(int ukuran) {
    this.ukuran = ukuran;
}

public int getHarga() {
    return harga;
}

public void setHarga(int harga) {
    this.harga = harga;
}
}
}
