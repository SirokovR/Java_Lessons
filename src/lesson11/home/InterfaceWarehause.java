package lesson11.home;

import java.util.ArrayList;

public interface InterfaceWarehause<T>{

    int LOAD_RATE = 15;
    int YEAR_RATE = 8;
    int TECHNICAL_STATE_RATE = 100;
    int SEATING_CAPACITY_RATE = 150;

    int buyCar( Car someCar);
    int sellCar( int i);
    String report ();
}
