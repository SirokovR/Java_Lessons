package lesson6.homeWork;

import static utilities.RandomUtils.getRandomFromRange;

public class Car {


    public static final int MIN_PRICE = 80000;
    public static final int MAX_PRICE = 400000;
    public static final int MIN_WEIGHT = 1200;
    public static final int MAX_WEIGHT = 2500;
    private int weight;
    private int price;
    private Manufacturer manufacturer;
    private Color color;

    public Car() {
        this(
                getRandomFromRange(MIN_WEIGHT, MAX_WEIGHT),
                getRandomFromRange(MIN_PRICE, MAX_PRICE),
                Manufacturer.values()[getRandomFromRange(0, Manufacturer.values().length - 1)],
                Color.values()[getRandomFromRange(0, Color.values().length - 1)]

        );
    }

    public Car(int weight, int price, Manufacturer manufacturer, Color color) {
        checkPrice(price);
        checkWeight(weight);
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    private void checkPrice(int price) {
        if (price < MIN_PRICE && price > MAX_PRICE) {
            throw new RuntimeException("Price is invalid");
        }
    }

    private void checkWeight(int weight) {
        if (weight < MIN_WEIGHT && weight > MAX_WEIGHT) {
            throw new RuntimeException("Weight is invalid");
        }
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT) {
            throw new RuntimeException("Weight is invalid");
        }
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}

