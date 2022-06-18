package Tugas7;

public class PegawaiTetap extends Pegawai{
    @Override
    public String toString() {
        return "Pegawai Tetap\t: " + getNama() + " "
                + "\nNo KTP\t\t\t: " + getNoKTP()+" "
                + "\nUpah\t\t\t: " + getUpah()+" "
                + "\nPendapatan\t\t: Rp. " + (String.format("%0,2d", (int) getGaji()));

    }
    public PegawaiTetap(String nama, String noKTP, double gaji){
        super(nama,noKTP);
        this.gaji=gaji;
    }

    private double upah;
    void setUpah(double a,double b){
        upah =2000000;
    }
    public double gaji() {
        return gaji;
    }

    @Override
    public String getNoKTP() {
        return noKTP;
    }



}