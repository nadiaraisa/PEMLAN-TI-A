package Inheritance;

public class Pekerja extends Manusia {
    private double gaji;
    private double bonus;

    private int jamKerja;
    private int hariKerja;
    private String nip;

    final int JAM_KERJA_NORMAL = 7;
    final int HARI_KERJA_NORMAL = 20;
    final double GAJI_NORMAL = 15;
    final double GAJI_LEMBUR = 7;
    final double GAJI_LIBUR = 20;

    public Pekerja(int jamKerja, int hariKerja, String nip, String nama, String nik, boolean jenisKelamin,
                   boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.nip = nip;

        this.gaji = getGaji();
        this.bonus = getBonus();
    }

    public double getGaji() {
        return (GAJI_NORMAL * this.jamKerja) * this.hariKerja;
    }

    public double getBonus() {
        double total = 0;

        if (this.jamKerja > JAM_KERJA_NORMAL)
            if (this.hariKerja > HARI_KERJA_NORMAL)
                total += GAJI_LEMBUR * (this.jamKerja - JAM_KERJA_NORMAL) * HARI_KERJA_NORMAL;
            else
                total += GAJI_LEMBUR * (this.jamKerja - JAM_KERJA_NORMAL) * this.hariKerja;

        if (this.hariKerja > HARI_KERJA_NORMAL)
            total += GAJI_LIBUR * this.jamKerja * (this.hariKerja - HARI_KERJA_NORMAL);

        return total;
    }

    public String getStatus() {
        String kantor = null;
        String department = null;
        char cabang = nip.charAt(2);

        switch (nip.charAt(0)) {
            case '1':
                kantor = "Mondstadt";
                break;
            case '2':
                kantor = "Liyue";
                break;
            case '3':
                kantor = "Inazuma";
                break;
            case '4':
                kantor = "Semeru";
                break;
            case '5':
                kantor = "Fontaine";
                break;
            case '6':
                kantor = "Natlan";
                break;
            case '7':
                kantor = "Snezhnaya";
                break;
            default:
                break;
        }

        switch (nip.charAt(6)) {
            case '1':
                department = "Pemasaran";
                break;
            case '2':
                department = "Humas";
                break;
            case '3':
                department = "Riset";
                break;
            case '4':
                department = "Teknologi";
                break;
            case '5':
                department = "Personalia";
                break;
            case '6':
                department = "Akademik";
                break;
            case '7':
                department = "Administrasi";
                break;
            case '8':
                department = "Operasional";
                break;
            case '9':
                department = "Pengembangan";
                break;
            default:
                break;
        }

        return department + ", " + kantor + " cabang ke-" + cabang;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getGaji() + this.getBonus();
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        text.append(super.toString());
        text.append("Bonus\t\t\t: ").append(this.getBonus() + "$").append("\n");
        text.append("Gaji\t\t\t: ").append(this.getGaji() + "$").append("\n");
        text.append("Status\t\t\t: ").append(this.getStatus()).append("\n");

        return text.toString();
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
