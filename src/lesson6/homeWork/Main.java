package lesson6.homeWork;

import lesson6.homeWork.service.Warehouse;

import static lesson6.homeWork.Car.MAX_PRICE;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(600000);
        warehouse.buyCar(new Car());
        warehouse.buyCar(new Car());
        warehouse.buyCar(new Car());
        warehouse.printReport();
        System.out.println("");

        warehouse.sellCarByIndex(0);
        warehouse.printReport();
        System.out.println("");
        warehouse.sellCarByIndex(2);
        warehouse.printReport();



        warehouse.getParkingList();

    }
}
