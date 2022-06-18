package Tugas7;

public class PegawaiHarian extends Pegawai{
    public double upahPerJam, gaji;
    public int totalJam;

    @Override
    public String toString() {
        return  "\nPegawai Harian \t: " + getNama() + " "
                +"\nNo KTP\t\t\t: " + getNoKTP()+""
                +"\nUpah/jam\t\t: " + getUpahPerJam()+""
                + "\nTotal Jam Kerja\t: " + getTotalJam()+""
                + "\nPendapatan\t\t: Rp. " + (String.format("%0,2d", (int) gaji()));
    }
    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama,noKTP);
        this.upahPerJam=upahPerJam;
        this.totalJam = totalJam;
    }

    void setUpahPerJam(double upahPerJam){
        upahPerJam =2000000;
    }
    public double getUpahPerJam() {
        return upahPerJam;
    }

    void setTotalJam(int totalJam){
        if (totalJam <=40){
            gaji = this.upahPerJam*this.totalJam;
        }
        else if (totalJam>40){
            gaji = (this.upahPerJam*40) + ((this.totalJam-40)*this.upahPerJam*1.5);
        }
    }
    public int getTotalJam() {
        return totalJam;
    }
    public double gaji() {
        if (totalJam <=40){
            gaji = this.upahPerJam*this.totalJam;
        }
        else if (totalJam>40){
            gaji = (this.upahPerJam*40) + ((this.totalJam-40)*this.upahPerJam*1.5);
        }
        return gaji;
    }

}
