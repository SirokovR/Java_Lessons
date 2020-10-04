package lesson11.homeEasy;

import java.util.GregorianCalendar;

import static utilities.RandomUtils.getRandomFromRange;

public class Truck extends Car implements IsVehicle {

    private GregorianCalendar yearOfProduction;
    private int technicalCondition;
    private CarsManufacturers carsManufacturers;
    private int carryingCapacity;


    public Truck(GregorianCalendar yearOfProduction) {

        this.yearOfProduction = yearOfProduction;
        this.technicalCondition = getRandomFromRange(TECHNICAL_CONDITION_MIN, TECHNICAL_CONDITION_MAX);
        this.carsManufacturers = CarsManufacturers.values()[getRandomFromRange(0, CarsManufacturers.values().length - 1)];
        this.carryingCapacity = getRandomFromRange(LOAD_CAPACITY_MIN, LOAD_CAPACITY_MAX);


    }


    public GregorianCalendar getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(GregorianCalendar yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getTechnicalCondition() {
        return technicalCondition;
    }

    public void setTechnicalCondition(int technicalCondition) {
        this.technicalCondition = technicalCondition;
    }

    public CarsManufacturers getCarsManufacturers() {
        return carsManufacturers;
    }

    public void setCarsManufacturers(CarsManufacturers carsManufacturers) {
        this.carsManufacturers = carsManufacturers;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}