package lesson11.homeWork;

public class Truck extends AbstractVehicular {

    private int carryingCapacity;

    public Truck(int technicalState, CarManufacturers manufacturers, int yearOfManufacture, int carryingCapacity) {
        super(technicalState, manufacturers, yearOfManufacture);
        this.carryingCapacity = carryingCapacity;
    }


    @Override
    public void getYearOfManufacture(int year) {

    }

    @Override
    public void getTechnicalState(int state) {

    }

    @Override
    public void getBuyPrice(int buyPrice) {

    }

    @Override
    public void getSellPrice(int sellPrice) {

    }
}
