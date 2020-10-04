package lesson11.homeWork;

public abstract class AbstractVehicular implements InterfaceVehicular {
    private int buyPrice;
    private int sellPrice;


    protected int technicalState;
    protected CarManufacturers carManufacturers;
    protected int yearOfManufacture;




    public AbstractVehicular( int technicalState, CarManufacturers manufacturers,int yearOfManufacture) {
        this.technicalState = technicalState;
        this.carManufacturers = manufacturers;
        this.yearOfManufacture = yearOfManufacture;

    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }
}
