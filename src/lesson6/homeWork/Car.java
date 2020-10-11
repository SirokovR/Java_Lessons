package lesson6.homeWork;

import lesson.annotation.ValidateRange;

import static utilities.RandomUtils.getRandomFromRange;

public class Car implements  Comparable<Car> {


    public static final int MIN_PRICE = 80000;
    public static final int MAX_PRICE = 400000;
    public static final int MIN_WEIGHT = 1200;
    public static final int MAX_WEIGHT = 2500;


    @ValidateRange(min = MIN_WEIGHT, max = MAX_WEIGHT)
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Car car = (Car) object;

        if (weight != car.weight) return false;
        if (price != car.price) return false;
        if (manufacturer != car.manufacturer) return false;
        return color == car.color;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + price;
        result = 31 * result + manufacturer.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }



//добавили Интерфейс Компаребл и с дацмонтом <Car> и переписали метод  с нашей логикой сравнения машин, можем сравнивать по любому критерию

    @Override
    public int compareTo(Car o) {
        return this.weight - o.getWeight();
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", price=" + price +
                ", manufacturer=" + manufacturer +
                ", color=" + color +
                '}';
    }
}

