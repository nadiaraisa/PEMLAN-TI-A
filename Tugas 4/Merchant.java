package UBFood;

import java.util.Scanner;

class Merchant {
    private String namaMerchant;
    private String namaProduk;
    private double hargaMakanan;

    public Merchant(Scanner in) {
        System.out.println("\n-----------------------------------------\n");
        System.out.println("======Input Data Merchant UB Food======");
        System.out.print("Nama Merhcant   : ");
        this.namaMerchant = in.nextLine();
        System.out.print("Nama Produk     : ");
        this.namaProduk = in.nextLine();
        System.out.print("Harga           : ");
        this.hargaMakanan = in.nextDouble();
        System.out.println("\n-----------------------------------------");
    }

    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan) {
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public String getNamaMerchant() {
        return namaMerchant;
    }

    public void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }

}
