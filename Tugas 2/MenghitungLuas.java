import java.io.*;
import java.util.*;

class Persegi{
    int sisi;
    int getLuas1(int sisi){
        return this.sisi * this.sisi;
    }
}

class Segitiga{
    int alas, tinggi;
    int getLuas2(int alas, int tinggi) {
        return this.alas * this.tinggi / 2;
    }
}

class Lingkaran{
    int jari, area;
    int getLuas3(int jari, int area) {
        if (this.jari % 7 == 0) {
            int luas = 22 / 7 * this.jari * this.jari;
            area += luas;
        } else{
            int luas = (int)(3.14 * this.jari * this.jari);
            area += luas;
        }
        return area;
    }
}

public class MenghitungLuas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                Persegi persegi = new Persegi();
                persegi.sisi = scanner.nextInt();
                System.out.print(persegi.getLuas1(persegi.sisi));
                break;
            case 2:
                Segitiga segitiga = new Segitiga();
                segitiga.alas = scanner.nextInt();
                segitiga.tinggi = scanner.nextInt();
                System.out.print(segitiga.getLuas2(segitiga.alas, segitiga.tinggi));
                break;
            case 3:
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.jari = scanner.nextInt();
                lingkaran.area = 0;
                System.out.print((double)lingkaran.getLuas3(lingkaran.jari, lingkaran.area));
                break;

            default:
                System.out.println("Input yang anda masukan tidak sesuai");
                break;
        }
    }

}
