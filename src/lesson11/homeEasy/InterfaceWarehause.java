package lesson11.homeEasy;

public interface InterfaceWarehause {

    int LOAD_RATE = 15;
    int YEAR_RATE = 8;
    int TECHNICAL_STATE_RATE = 100;
    int SEATING_CAPACITY_RATE = 150;

    int buyCar( Truck someTruck);
    int sellCar( int i);
    String report ();
}
