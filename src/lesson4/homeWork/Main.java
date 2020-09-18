package lesson4.homeWork;


public class Main {
    public static void main(String[] args) {
        MatrixImpl matrix1 = new MatrixImpl(5,5);
        MatrixImpl matrix2 = new MatrixImpl(5,5);
        int[][] temp1;
        int[][] temp2;
        temp1 = matrix1.fill();
        temp2 = matrix2.fill();
        matrix1.print(); // after random filling
        matrix2.print(); //after random filling
        MatrixImpl.finalValue = MatrixImpl.multiply(temp1,temp2);

        MatrixImpl.finalPrint();




        System.out.println();


        Car car1 = new Car(15_000,2018,1560,"red", "");
        Car car2 = new Car(20_000, 2020,1956,"blue", "");
        Car car3 = new Car(14_000,2015,3200,"orange", "");
        Car car4 = new Car(16_000,2012,1760,"black","");
        Car car5 = new Car(17_000,2019,2100,"white", "");
        Car car6 = new Car(10_000,2005,2100,"silver", "");



        Car [] carCollection = {car1,car2,car3,car4,car5,car6};

        Car.getMostExpensiveCarName(carCollection);
        System.out.println();
        Car.getMostOldestCar(carCollection);













    }
}
