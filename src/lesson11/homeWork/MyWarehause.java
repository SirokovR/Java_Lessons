package lesson11.homeWork;

import java.util.ArrayList;
import java.util.List;

public class MyWarehause implements BusinessManagerAccessor, InterfaceWarehouse {



    ArrayList<AbstractVehicular> warehouseCapacity = new ArrayList<>(9);


    @Override
    public InterfaceVehicular buyCar(InterfaceVehicular interfaceVehicular) {
        return null;
    }

    @Override
    public InterfaceVehicular sellCar(InterfaceVehicular interfaceVehicular) {
        return null;
    }

    @Override
    public String report() {
        return null;
    }

    @Override
    public void getYearOfManufacture(int year) {

    }

    @Override
    public void getTechnicalState(int state) {

    }

    @Override
    public void getBuyPrice(int buyPr) {

    }

    @Override
    public void getSellPrice(int sellPr) {

    }
}
