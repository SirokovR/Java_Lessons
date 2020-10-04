package lesson11.homeWork;

public interface InterfaceWarehouse extends InterfaceVehicular {
    InterfaceVehicular buyCar(InterfaceVehicular interfaceVehicular);

    InterfaceVehicular sellCar(InterfaceVehicular interfaceVehicular);

     String report();

}
