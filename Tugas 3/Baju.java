package tugas3;

public class Baju {

    String jenis;
    int harga;
    int jumlah;
    int total;


    public Baju(String a, int b){
        this.jenis  = a;
        this.jumlah = b;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaa(){
        if(jumlah > 100){
            harga = 95000;
            total = harga*jumlah;
        }
        else {
            harga = 100000;
            total = harga*jumlah;
        }
    }
    void hargab(){
        if(jumlah > 100){
            harga = 120000;
            total = harga*jumlah;
        }
        else {
            harga = 125000;
            total = harga*jumlah;
        }
    }
    void hargac(){
        if(jumlah > 100){
            harga = 160000;
            total = harga*jumlah;
        }
        else {
            harga = 175000;
            total = harga*jumlah;
        }
    }
    void display(){
        if(jenis.equalsIgnoreCase("a"))
            hargaa();
        else if(jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("============= Output =======================");
        System.out.println("Jenis yang Anda Beli              : "+jenis);
        System.out.println("Harga per Buah                    : "+harga);
        System.out.println("Total Harga                       : "+total);
    }
}
