package PraktikumPBO;

class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Car(String carType, String polNum, String merk, boolean status) {
        this.carType = carType;
        this.polNum = polNum;
        this.merk = merk;
        this.status = status;
    }

    public String getCarType() {
        return carType;
    }

    public String getPolNum() {
        return polNum;
    }

    public String getMerk() {
        return merk;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TIPE MOBIL\t: ").append(carType).append("\n");
        sb.append("NO. POLISI\t: ").append(polNum).append("\n");
        sb.append("MERK MOBIL\t: ").append(merk).append("\n");
        sb.append("---------------------------------------");
        return sb.toString();
    }
}
