package lesson11.home;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static utilities.RandomUtils.getRandomFromRange;

public abstract class Car implements InterfaceVehicle {
    private GregorianCalendar yearOfProduction;
    private int technicalCondition;
    private CarsManufacturers carsManufacturers;

    public Car(GregorianCalendar yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        this.technicalCondition = getRandomFromRange(TECHNICAL_CONDITION_MIN, TECHNICAL_CONDITION_MAX);
        this.carsManufacturers = CarsManufacturers.values()[getRandomFromRange(0, CarsManufacturers.values().length - 1)];
    }


    public int carAgeCalculation(Car car){
        Calendar temp = car.getYearOfProduction();
        return temp.get(GregorianCalendar.YEAR);
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
}
