package Inheritance;

public class MahasiswaFilkom extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFilkom(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        String jurusan = null;

        switch (nim.substring(6, 7)) {
            case "2":
                jurusan = "Teknik Meniup Gelembung";
                break;
            case "3":
                jurusan = "Teknik Berburu Ubur Ubur";
                break;
            case "4":
                jurusan = "Teknik Perhamburgeran";
                break;
            case "6":
                jurusan = "Pendidikan Chum Bucket";
                break;
            case "7":
                jurusan = "Teknologi Telepon Kerang";
                break;
            default:
                break;
        }

        return jurusan + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5)
            return 75;
        else if (ipk >= 3)
            return 50;
        return 0;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + this.getBeasiswa();
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder();

        text.append(super.toString());
        text.append("IPK\t\t\t\t: ").append(ipk).append("\n");
        text.append("NIM\t\t\t\t: ").append(nim).append("\n");
        text.append("Status\t\t\t: ").append(this.getStatus()).append("\n");

        return text.toString();
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
}
