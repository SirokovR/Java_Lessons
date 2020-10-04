package lesson11.homeEasy;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Truck test =new Truck(new GregorianCalendar(2000,12,2));
        System.out.println(test.getTechnicalCondition());
        System.out.println(test.getCarryingCapacity());
        System.out.println(test.getCarsManufacturers());


        PassengerCar test2 = new PassengerCar(new GregorianCalendar(2013,12,30));
        System.out.println(test2.getTechnicalCondition());
        System.out.println(test2.getSeatingCapacity());
        System.out.println(test2.getCarsManufacturers());



    }
}
