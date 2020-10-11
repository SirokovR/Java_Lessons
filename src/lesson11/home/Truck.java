package lesson11.home;

import java.util.GregorianCalendar;

import static utilities.RandomUtils.getRandomFromRange;

public class Truck extends Car {

    private int carryingCapacity;


    public Truck(GregorianCalendar yearOfProduction) {
        super(yearOfProduction);
        this.carryingCapacity = getRandomFromRange(LOAD_CAPACITY_MIN, LOAD_CAPACITY_MAX);
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
