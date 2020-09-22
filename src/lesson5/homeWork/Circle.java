package lesson5.homeWork;


public class Circle {

    public int radius;


    public static int getRandomFromRange(int from, int to){
        return (int)(Math.random()*(to-from)+from);
    }


    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = getRandomFromRange(2,9);

    }


    protected double calculateArea() {
        return Math.PI * (radius * radius);
    }


    protected double calculateCircumference(){
        return 2 * Math.PI *radius;
    }


    public static void getMaxArea(Circle[] circleCollection){
        Circle biggest = circleCollection[0];
        for (Circle circle:circleCollection) {
            if(circle.calculateArea() > circleCollection[0].calculateArea()){
                biggest = circle;
            }

        }
        System.out.println("The maximum area is "+ biggest.calculateArea());

    }


    public static void getMinCircumference(Circle[] circleCollection){
        Circle biggest = circleCollection[0];
        for (Circle circle:circleCollection) {
            if(circle.calculateCircumference() < circleCollection[0].calculateCircumference()){
                biggest = circle;
            }

        }
        System.out.format("The minimum circumference is "+ biggest.calculateCircumference());

    }

}
