package lesson6.homeWork;

public class Car {
    public static final String RED = "RED";
    public static final String WHITE = "WHITE";
    public static final String BLACK = "BLACK";

    private int weight;
    private int price;
    private String color;

    public Car(int weight, int price, String color) {
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

    public String getColor() { return color;}

    public void setColor(String color) {this.color = color;}
}
