package lesson11.homeWork;


import static utilities.RandomUtils.getRandomFromRange;

public class PassengerCar extends AbstractVehicular {

    private int seatingCapacity;

    public PassengerCar(int technicalState, CarManufacturers manufacturers, int yearOfManufacture, int seatingCapacity) {
        super(technicalState, manufacturers, yearOfManufacture);
        this.seatingCapacity = seatingCapacity;
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
