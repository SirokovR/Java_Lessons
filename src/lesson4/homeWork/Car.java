package lesson4.homeWork;

import java.util.Random;

public class Car {
    public int price;
    public int year;
    public int weight;
    public String color;
    public String producer;


    public Car(int price, int year, int weight, String color, String producer) {
        this.price = price;
        this.year = year;
        this.weight = weight;
        this.color = color;
        this.producer = getRandomCarNameFromArray(carNames);
    }


    String[] carNames = {"BMW", "Toyota", "Honda", "Kia", "VW"};


    public static String getRandomCarNameFromArray(String[] array) {
        Random rnd = new Random();
        int index = rnd.nextInt(array.length);
        return array[index];
    }

    public static void getMostExpensiveCarName(Car[] carCollection){
        Car expensive = carCollection[0];
        for (Car car:carCollection) {
            if(car.price > carCollection[0].price){
                expensive = car;
            }

        }
        System.out.format("The most expensive car have # Price: "+ expensive.price +"   Year:" + expensive.year +"  Weight:"+expensive.weight + "  Color:"+ expensive.color + "  Producer:"+expensive.producer);

    }


    public static void getMostOldestCar(Car[] carCollection){
        Car oldest = carCollection[0];
        for (Car car:carCollection) {
            if(car.year < carCollection[0].year){
                oldest = car;

            }
        }
        System.out.println("The oldest car have # Price: "+ oldest.price +"   Year:" + oldest.year +"  Weight:"+oldest.weight + "  Color:"+ oldest.color + "  Producer:"+oldest.producer);
    }


    



}
