package lesson6.homeWork;

public class Warehouse {

    Car [] warehouseCapacity = new Car[5];

    public Warehouse(Car[] warehouseCapacity) {
        this.warehouseCapacity = warehouseCapacity;
    }

    public Car[] getWarehouseCapacity() {
        return warehouseCapacity;
    }

    public void setWarehouseCapacity(Car[] warehouseCapacity) {
        this.warehouseCapacity = warehouseCapacity;
    }
}
