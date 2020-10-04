package lesson11.homeWork;

public interface InterfaceVehicularAccessor {

    int LOAD_RATE = 15;
    int YEAR_RATE = 8;
    int TECHNICAL_STATE_RATE = 100;
    int SEATING_CAPACITY_RATE = 150;

    int valuatVehicular(InterfaceVehicular interfaceVehicular);

}