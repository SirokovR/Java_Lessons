package lesson11.home;

import java.util.GregorianCalendar;

import static utilities.RandomUtils.getRandomFromRange;

public class PassangerCar extends Car {

    private int seatingCapacity;

    public PassangerCar(GregorianCalendar yearOfProduction) {
        super(yearOfProduction);
        this.seatingCapacity = getRandomFromRange(SEATING_CAPACITY_MIN, SEATING_CAPACITY_MAX);
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }
}
