package Tugas7;

public class Sales extends Pegawai{
    public double komisi;
    public int penjualan;

    public String toString() {
        return  "\nSales \t\t\t: " + getNama() + " "
                + "\nNo KTP\t\t\t: " + getNoKTP() + ""
                + "\nTotal Penjualan\t: " + getPenjualan() + " "
                + "\nBesaran Komisi\t: " + getKomisi() + " "
                + "\nPendapatan\t\t: Rp. " + (String.format("%0,2d", (int) gaji()));
    }
    public Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama,noKTP);
        this.penjualan=penjualan;
        this.komisi = komisi;
    }
    public int getPenjualan() {
        return penjualan;
    }

    void setPenjualan(int penjualan){

    }

    public double getKomisi() {
        return komisi;
    }

    void setKomisi(double komisi){
        gaji = this.penjualan*this.komisi;
    }
    public double gaji() {
        gaji = this.penjualan*this.komisi;
        return gaji;
    }


}
