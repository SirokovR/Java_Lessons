package lesson6.homeWork.service;

import lesson6.homeWork.Car;

public class Warehouse{
    private static  final double PROFIT_RATE = 1.15d;
    private  Car[] cars = new Car[5];
    private long balance ;

    public Warehouse(long balance) {
        this.balance = balance;
    }

    public void buyCar(Car car){
        if(car.getPrice()> balance){
            System.out.println("Not enough money");
            return;
        }
        int freePlace = -1;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null){
                freePlace = i;
                break;
            }
        }
        if(freePlace== -1){
            System.out.println("No free places");
            return;
        }
        cars[freePlace] = car;
        balance -= car.getPrice();
        System.out.println("Car was bought. Prise: " + car.getPrice());
    }



    public void sellCarByIndex(int i){
            if(cars[i] == null){
                System.out.println("Spot: " + i + ", is free, check other position ");
                return;
            }

            if(cars[i] != null){
                System.out.println("You would choose car spot: " + i + " ,so it'll be sold");
            }
            Car sellCar = new Car();
            cars[i] = sellCar;
            balance += (long) ((long)sellCar.getPrice() * PROFIT_RATE);
            cars[i] = null;



    }




    public void printReport(){
        System.out.println("Warehouse balance " + this.balance + " " +
                " Quantity in the warehouse are " + getCarsCount());

    }


    private int getCarsCount(){
        int count = 0;
        for (Car car: cars) {
            if( car != null){
                count++;
            }
        }
        return count;
    }

    public void getParkingList(){
        for(Car car: cars){
            System.out.println(car + " ");
        }
    }




}//class
