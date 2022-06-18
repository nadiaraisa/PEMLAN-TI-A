package PraktikumPBO;

import java.util.ArrayList;

class CarData {
    public ArrayList<Car> carList;

    public CarData() {
        carList = new ArrayList<Car>();
    }

    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar() {
        System.out.println("---------------------------------------");
        System.out.println(" DAFTAR MOBIL");
        System.out.println("---------------------------------------");
        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
