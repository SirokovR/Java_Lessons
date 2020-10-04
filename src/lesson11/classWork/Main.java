package lesson11.classWork;

import lesson6.homeWork.Car;
import lesson7.classWork.Circle;
import model.MyInterface;
import model.MyInterfaceImpl;
import model.Shape;
import pattern.iteratorAgain.Container;
import pattern.iteratorAgain.ConteinerImpl;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Container<Car> conteiner = new ConteinerImpl(new Car(), new Car(), new Car(),new Car(),
                new Car(),new Car(),new Car(),new Car(),new Car(),new Car(),new Car(),
                new Car(),new Car(),new Car(),new Car());
        Iterator<Car> iterator = conteiner.getIterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }

       Container<Shape> containerShapes =new ConteinerImpl<>(new Circle(4));
       Shape sh= containerShapes.getIterator().next();


       iterator = conteiner.getIterator();
       iterator.next();
       iterator.next();
       iterator.remove();

       iterator = conteiner.getIterator();;
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }


        MyInterface implObject = new MyInterfaceImpl(); //обьект создаем через класс который имлеминтирует интерфейс

        MyInterface interfaceObject1 = new MyInterface() {
            @Override
            public void myMethod() {
                System.out.println("hello from My Interface");
            }
        };            //анонимная инициализация


    }


}
