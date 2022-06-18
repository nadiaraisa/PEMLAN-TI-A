package UBFood;

import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant) {
        Merchant temp[] = new Merchant[merc.length + 1];
        for (int i = 0; i < merc.length; i++) {
            temp[i] = merc[i];
        }
        temp[merc.length] = merchant;
        return temp;
    }

    public static void tampilData() {
        System.out.println("\n------ Nama : Nadia Raisa Khairani ------");
        System.out.println("-------- NIM  : 215150700111008 ---------\n");
        for (Merchant mch1 : merc) {
            System.out.println("====Tampilan Data Merchant UB Food=====");
            System.out.println("Nama Merhcant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int) mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama) {
        for (Merchant mch1 : merc) {
            if (mch1.getNamaMerchant().equals(nama)) {
                return mch1;
            }
        }
        return null;
    }

    public static void tampilMerchant(Merchant merchant) {
        if (merchant == null) {
            System.out.println("Merchant tidak ditemukan");
        } else {
            System.out.println("\n------ Nama : Nadia Raisa Khairani ------");
            System.out.println("-------- NIM  : 215150700111008 ---------\n");
            System.out.println("====Tampilan Data Merchant UB Food=====");
            System.out.println("Nama Merhcant   : " + merchant.getNamaMerchant());
            System.out.println("Nama Produk     : " + merchant.getNamaProduk());
            System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
        }
    }

    public static void updateMerchant(Merchant merchant) {
        if (merchant == null) {
            System.out.println("Merchant tidak ditemukan");
        } else {
            System.out.println("\n------ Nama : Nadia Raisa Khairani ------");
            System.out.println("-------- NIM  : 215150700111008 ---------\n");
            System.out.println("====Update Data Merchant UB Food=====");
            System.out.print("Nama Merchant: ");
            merchant.setNamaMerchant(in.nextLine());
            System.out.print("Nama Produk: ");
            merchant.setNamaProduk(in.nextLine());
            System.out.print("Harga Makanan: ");
            merchant.setHargaMakanan(in.nextDouble());
        }
    }
}