package PraktikumPBO;

import java.util.ArrayList;

class RentArchive {
    public ArrayList<CarRent> rentData;

    public RentArchive() {
        rentData = new ArrayList<CarRent>();
    }

    public void rent(CarRider rider, Car car, int rentDur) {
        if (car.isStatus()) {
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info() {
        System.out.println("---------------------------------------");
        System.out.println(" INFORMASI PELANGGAN");
        System.out.println("---------------------------------------");
        for (CarRent rent : rentData) {
            System.out.println(rent);
        }
    }
}
