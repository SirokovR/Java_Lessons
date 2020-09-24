package lesson7.classWork;

public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public  int getPerimeter(){
        return  4 * a;

    }
}
