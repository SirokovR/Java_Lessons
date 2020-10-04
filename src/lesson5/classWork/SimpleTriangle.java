package lesson5.classWork;

import lesson7.classWork.Figure;

public class SimpleTriangle extends Figure {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        checkSides(a, b, c);
        this.a = a;
        this.b = b;

        this.c = c;
    }


    private void checkSides(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c < a)
        { throw new IllegalArgumentException();
        }

    }


    public int getA() {
        return a;
    }

    public void setA(int a) {

        checkSides(a, this.b, this.c);
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        checkSides(this.a, b, this.c);
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        checkSides(this.a, this.b, c);
        this.c = c;
    }

    public int getPerimetr() {
        return this.a + this.b + this.c;
    }

    @Override
    public int getSquare() {
        return (a*b)/2;
    }

    @Override
    public int getPerimeter() {
        return a+b+c;
    }
}
