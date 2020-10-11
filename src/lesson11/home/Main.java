package lesson11.home;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
      Truck truck = new Truck(new GregorianCalendar(2000,2,23));
        System.out.println(truck.getCarsManufacturers());
        System.out.println(truck.getTechnicalCondition());
        System.out.println(truck.getYearOfProduction());
        System.out.println(truck.getCarryingCapacity());
        System.out.println();
        PassangerCar car = new PassangerCar(new GregorianCalendar(2003,3,23));
        System.out.println(car.getSeatingCapacity());
        System.out.println(car.getCarsManufacturers());
        System.out.println(car.getTechnicalCondition());

        System.out.println(truck.carAgeCalculation(truck));
/*

        MyWarehouse warehouse = new MyWarehouse(100000);
        System.out.println(warehouse.getTruckPrise(truck));
        System.out.println(warehouse.getPassengerCarPrice(car));*/

    }
}
