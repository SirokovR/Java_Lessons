package lesson5.homeWork;

import static lesson5.homeWork.Circle.getRandomFromRange;

public class Main {

    public static void main(String[] args) {
        Circle scl1 = new Circle(3);
        Circle scl3 = new Circle(5);
        Circle scl5 = new Circle(7);
        Circle scl6 = new Circle(4);
        Circle scl7 = new Circle(3);
        Circle scl8 = new Circle();


        System.out.println(getRandomFromRange(2,9));

        Circle[] circleCollection = {scl1,scl3,scl5,scl6,scl7,scl8};

        Circle.getMaxArea(circleCollection);
        Circle.getMinCircumference(circleCollection);





    }











}//class
