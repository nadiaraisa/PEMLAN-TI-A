package PraktikumPBO;

public class Latihan {
    public static void main(String[] args) {
        CarRider john = new CarRider("John", 19, "0800000000");
        CarRider jane = new CarRider("Jane", 20, "0811111111");
        CarRider jack = new CarRider("Jack", 21, "0822222222");
        CarRider jill = new CarRider("Jill", 22, "0833333333");

        CarData data = new CarData();
        data.addCar("SEDAN", "N 1111 AB", "Subaru");
        data.addCar("SPORT", "N 2222 AB", "Lamborghini");
        data.addCar("SUV", "N 3333 AB", "Toyota");
        data.addCar("EV", "N 4444 AB", "TESLA");
        data.listOfCar();

        System.out.println();
        RentArchive arsip = new RentArchive();
        arsip.rent(john, data.carList.get(0), 9);
        arsip.rent(jane, data.carList.get(1), 3);
        arsip.rent(jack, data.carList.get(2), 1);
        arsip.rent(jill, data.carList.get(0), 1);

        System.out.println();
        arsip.info();
    }
}
