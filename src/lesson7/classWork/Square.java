package lesson7.classWork;

import model.Shape;

public class Square implements Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public  int getPerimeter(){
        return  4 * a;
    }

    @Override
    public double getSquare() {
        return a*a;
    }

    @Override
    public String getName() {
        return "String";
    }

    @Override
    public double getPerimetr() {
        return a*a;
    }
}

