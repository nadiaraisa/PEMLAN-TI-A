package Tugas7;

public abstract class Pegawai {
    public String nama, noKTP;
    public double gaji;

    public Pegawai (String nama, String noKTP){
        this.nama=nama;
        this.noKTP=noKTP;
    }

    // public String toString(){
    //return "Nama Pegawai\t\t: "+nama+
    //  "\No KTP       : "+noKTP+
    //     "\nUpah\t\t: "+gaji;
    //}
    public String getNama() {
        return nama;
    }
    public String getNoKTP() {
        return noKTP;
    }
    public double getUpah(){
        return gaji;
    }
    public double getGaji(){
        return gaji;
    }
}