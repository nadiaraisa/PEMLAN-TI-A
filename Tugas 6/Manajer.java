package Inheritance;

public class Manajer extends Pekerja {
    private int lamaKerja;

    public Manajer(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jenisKelamin,
                   boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, nip, nama, nik, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan() + 15;
    }

    @Override
    public double getBonus() {
        return super.getBonus() * 1.3;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        text.append(super.toString());
        text.append("Lama Kerja\t\t: ").append(lamaKerja).append(" hari\n");

        return text.toString();
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
}
