// Nama : Nadia Raisa Khairani
// NIM : 215150700111008
// Praktikum Pemlan TI A

package Tugas7;

public class Polimorfisme_Pegawai {

    public static void main(String[] args) {
        Pegawai pegawai[] = new Pegawai[3];

        Pegawai pegawai1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000);
        Pegawai pegawai2 = new PegawaiHarian("Edo", "350728490327424892343", 8500,40);
        Pegawai pegawai3 = new Sales("Tika","350728490327424892344", 50, 50000);

        Pegawai pegawai4 = new PegawaiTetap("Bagas", "350728490327424892345", 3000000);
        Pegawai pegawai5 = new PegawaiHarian("Beni", "350728490327424892346", 8500,45);
        Pegawai pegawai6 = new Sales("Eka","350728490327424892347", 40, 40000);

        Pegawai pegawai7 = new PegawaiTetap("Marsya", "350728490327424892348", 4000000);
        Pegawai pegawai8 = new PegawaiHarian("Fahra", "350728490327424892349", 8500,65);
        Pegawai pegawai9 = new Sales("Karin","350728490327424892350", 70, 70000);

        Pegawai pegawai10 = new PegawaiTetap("Reza", "350728490327424892351", 5000000);
        Pegawai pegawai11 = new PegawaiHarian("Ardi", "350728490327424892352", 8500,35);
        Pegawai pegawai12 = new Sales("Lisa","350728490327424892353", 60, 60000);


        System.out.println(pegawai1.toString());
        System.out.println(pegawai2.toString());
        System.out.println(pegawai3.toString());
        System.out.println("---------------------------------------------");
        System.out.println(pegawai4.toString());
        System.out.println(pegawai5.toString());
        System.out.println(pegawai6.toString());
        System.out.println("---------------------------------------------");
        System.out.println(pegawai7.toString());
        System.out.println(pegawai8.toString());
        System.out.println(pegawai9.toString());
        System.out.println("---------------------------------------------");
        System.out.println(pegawai10.toString());
        System.out.println(pegawai11.toString());
        System.out.println(pegawai12.toString());
        System.out.println("---------------------------------------------");
    }

}
