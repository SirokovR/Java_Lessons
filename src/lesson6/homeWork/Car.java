package lesson6.homeWork;

import java.util.Calendar;

public class Car {
    protected enum ColorSet { RED, WHITE, BLACK}

    private int weight;
    private int price;

    private ColorSet color;


    public Car(int weight, int price, ColorSet color ) {
        checkWeight(weight);
        checkPrice(price);
        this.weight = weight;
        this.price = price;
        this.color = color;

    }



    public int checkWeight(int weight){
        boolean acceptableWeight = (1200>= weight && weight <= 2500);
        if(acceptableWeight){
            throw new IllegalArgumentException("Weight should be in the range: 1200-2500");
        }
        return weight;
    }


    public int checkPrice(int price){
        boolean acceptablePrice = (80_000>= price && price <= 400_000);
        if (acceptablePrice){
            throw new IllegalArgumentException("Price should be in range: 80_000 - 400_000");
        }
        return price;
    }






    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ColorSet getColor() {
        return color;
    }

    public void setColor(ColorSet color) {
        this.color = color;
    }
}
