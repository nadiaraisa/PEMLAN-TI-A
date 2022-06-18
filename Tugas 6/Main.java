// Nama : Nadia Raisa Khairani
// NIM : 215150700111008
// Praktikum Pemlan TI A

package Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Manusia> listManusia = new ArrayList<Manusia>();

        System.out.println("============================================================================\n");

        Manusia manusia = new Manusia("Aku", "3923842934", true, true);
        MahasiswaFilkom mahasiswa = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        Pekerja pekerja = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        Manajer manajer = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);

        System.out.println(manusia);
        System.out.println(mahasiswa);
        System.out.println(pekerja);
        System.out.println(manajer);

        listManusia.add(manusia);
        listManusia.add(mahasiswa);
        listManusia.add(pekerja);
        listManusia.add(manajer);

        System.out.println("============================================================================\n");

        System.out.println("=================== MANUSIA ===================");
        Manusia manusia1 = new Manusia("Hyunjin", "3923842934", true, true);
        Manusia manusia2 = new Manusia("Sisca Khol", "3923842935", false, true);
        Manusia manusia3 = new Manusia("Atta Halilintar", "3923842936", true, false);

        System.out.println(manusia1);
        System.out.println(manusia2);
        System.out.println(manusia3);

        listManusia.add(manusia1);
        listManusia.add(manusia2);
        listManusia.add(manusia3);

        System.out.println("================== MAHASISWA ==================");
        MahasiswaFilkom mahasiswa1 = new MahasiswaFilkom("Jackson", "351923848237", true, true, "205150201111018", 3.70);
        MahasiswaFilkom mahasiswa2 = new MahasiswaFilkom("Niki Zefanya", "351923848238", false, true, "205150301111018", 3.60);
        MahasiswaFilkom mahasiswa3 = new MahasiswaFilkom("Rich Brian", "351923848239", true, false, "205150401111018", 3.90);

        System.out.println(mahasiswa1);
        System.out.println(mahasiswa2);
        System.out.println(mahasiswa3);

        listManusia.add(mahasiswa1);
        listManusia.add(mahasiswa2);
        listManusia.add(mahasiswa3);

        System.out.println("================== PEKERJA ==================");
        Pekerja pekerja1 = new Pekerja(9, 28, "195101439285", "Fadil Jaidi", "3923842938", true, true);
        Pekerja pekerja2 = new Pekerja(11, 25, "295102439286", "Lucinta Luna", "3923842939", false, true);
        Pekerja pekerja3 = new Pekerja(6, 15, "395103439287", "Keanu Agl", "3923842940", true, false);

        System.out.println(pekerja1);
        System.out.println(pekerja2);
        System.out.println(pekerja3);

        listManusia.add(pekerja1);
        listManusia.add(pekerja2);
        listManusia.add(pekerja3);

        System.out.println("================== MANAJER ==================");
        Manajer manajer1 = new Manajer(9, 20, "404837483728", "King Faaz", "3923842938", true, true, 1500);
        Manajer manajer2 = new Manajer(11, 25, "504837583728", "Arsy Hermansyah", "3923842939", false, true, 1500);
        Manajer manajer3 = new Manajer(6, 15, "604837683728", "Rafathar Ahmad", "3923842940", true, false, 1500);

        System.out.println(manajer1);
        System.out.println(manajer2);
        System.out.println(manajer3);

        listManusia.add(manajer1);
        listManusia.add(manajer2);
        listManusia.add(manajer3);

        int countManusia = 0;
        int countMahasiswa = 0;
        int countPekerja = 0;
        int countManajer = 0;

        for (Manusia item : listManusia) {
            if (item instanceof MahasiswaFilkom)
                countMahasiswa++;
            if (item instanceof Pekerja)
                countPekerja++;
            if (item instanceof Manajer)
                countManajer++;
            countManusia++;
        }

        System.out.println("================== TOTAL ==================");
        System.out.println("Jumlah Manusia\t\t: " + countManusia);
        System.out.println("Jumlah Mahasiswa\t: " + countMahasiswa);
        System.out.println("Jumlah Pekerja\t\t: " + countPekerja);
        System.out.println("Jumlah Manajer\t\t: " + countManajer);

    }
}
