package lesson6.classWork;

import lesson7.classWork.Figure;
import model.Shape;
import model.WithPerimetr;
import model.WithSquare;

public class Triangle implements Shape {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(){
        this(new Point(),new Point(),new Point());
    }


    public Triangle(Point a, Point b, Point c) {
        checkSides(a,b,c);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public void triangleMethod(){
        System.out.println(" From triangle");
    }



    @Override
    public double getPerimetr(){
        double perimetr = getDistance(this.a,this.b) +
                getDistance(this.b,this.c) +
                getDistance(this.a, this.c);
        return perimetr;
    }

    private double getDistance(Point one, Point two){
        double distance = Math.sqrt(Math.pow(two.getX() - one.getX(),2) +
                Math.pow(two.getY() - one.getY(),2));
        return distance;
    }

    private void checkSides(Point a,Point b, Point c){
        double ab = getDistance(a,b);
        double ac = getDistance(a,c);
        double bc = getDistance(b,c);

        if(ab+ac <= bc || bc + ac <= ab || ab + bc <= ac){
            throw new RuntimeException();
        }

    }


    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        checkSides(a,this.b,this.c);
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        checkSides(this.a,b,this.c);
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        checkSides(this.a,this.b,c);
        this.c = c;
    }


    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getSquare() {
        return (getDistance(this.b, this.c) * getDistance(this.a, this.c))/2;
    }
}//class
