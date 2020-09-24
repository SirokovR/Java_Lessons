package lesson7.classWork;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }


    @Override
    public int getPerimeter(){
        return (int)(2*Math.PI *radius);
    }

}
