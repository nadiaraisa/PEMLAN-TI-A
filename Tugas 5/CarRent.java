package PraktikumPBO;

class CarRent {
    private CarRider rider;
    private Car car;
    private int rentDur;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rider = rider;
        this.car = car;
        this.rentDur = rentDur;
    }

    public CarRider getRider() {
        return rider;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NAMA PEMINJAM\t: ").append(rider.getName()).append("\n");
        sb.append("TIPE MOBIL\t: ").append(car.getCarType()).append("\n");
        sb.append("NO. POLISI\t: ").append(car.getPolNum()).append("\n");
        sb.append("LAMA RENTAL\t: ").append(rentDur).append("\n");
        sb.append("---------------------------------------");
        return sb.toString();
    }
}
