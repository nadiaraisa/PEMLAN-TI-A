package tugas3;

import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        System.out.println("Baju yang Tersedia   :");
        System.out.println("Baju A dengan Harga 100000");
        System.out.println("Baju B dengan Harga 125000");
        System.out.println("Baju C dengan Harga 175000");

        Scanner input = new Scanner(System.in);
        System.out.print("Baju yang Akan Anda Beli Bertipe  : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah Baju yang Akan Anda Beli   : ");
        int jumlah = input.nextInt();

        Baju p = new Baju(jenis, jumlah);
        if ("a".equalsIgnoreCase(jenis)){
            p.display();
            p.hargaa();
        }
        else if("b".equalsIgnoreCase(jenis)){
            p.display();
            p.hargab();
        }
        else if("c".equalsIgnoreCase(jenis)){
            p.display();
            p.hargac();
        }
        else{
            System.out.println("Inputan Tidak Sesuai!");
        }

    }
}
