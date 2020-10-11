package lesson7.classWork;

import lesson.annotation.ValidateRange;
import model.Shape;

public class Circle  implements Shape {
    @ValidateRange(min = 2,max = 6)
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }




    @Override
    public double getSquare() {return (int) (Math.PI*(radius*radius));}

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getPerimetr() {
        return (int)(2*Math.PI *radius);
    }

    private void superSecretMethod(){
        System.out.println("Super secret method");
    }

}
