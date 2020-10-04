package lesson10.classWork;

import lesson6.classWork.Triangle;
import lesson7.classWork.Circle;
import lesson7.classWork.Figure;
import lesson7.classWork.Square;
import model.Shape;
import model.WithPerimetr;
import model.WithSquare;
import pattern.*;

import static lesson9.classWork.Main.replace;

public class Main {
    public static void main(String[] args) {
       // printWordsCount("tet tet tet aaa");

        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle(3);
        Shape circle2 = new Circle(7);
        Shape square = new Square(5);
        Shape square2 = new Square(4);

        Shape[] shapes = {triangle, triangle2,circle,circle2,square,square2};
        printMaxPerimetr(shapes);
        printMinSquare(shapes);


        Builder airplaneBuilder = new Builder();
        airplaneBuilder.setAvionica(new Avionica());
        System.out.println("Hello.....");
        airplaneBuilder.setEngine(new Engine());
        System.out.println("...... vun vun");
        airplaneBuilder.setWings(new Wing[]{new Wing(), new Wing()});
        System.out.println(" krum krum ");


        Airplane airbus = airplaneBuilder.build();
        Builder boeingBuilder = new Builder().setAvionica(new Avionica()).setEngine(new Engine());
        System.out.println("lalalal");
        Airplane boeing = boeingBuilder.setWings(null).build();



        Singleton singleton = Singleton.getInstance(); //вызиваеться через статический метод !!





        MeteoStation meteoStation = new MeteoStation();
        CNN cnn = new CNN();
        Delfi delfi = new Delfi();
        ERR err = new ERR();
        meteoStation.registerSubscriber(cnn);
        meteoStation.registerSubscriber(delfi);
        meteoStation.registerSubscriber(err);


        meteoStation.publishEvent("Temperature +20 C");
        meteoStation.publishEvent("Wind S-W 5 m/s");
        meteoStation.publishEvent("Temperature +22 C");
        meteoStation.publishEvent("Temperature +20 C");
        meteoStation.publishEvent("Wind S-W 9 m/s");
        meteoStation.unsubscribe(cnn);
        meteoStation.unsubscribe(err);
        meteoStation.publishEvent("Wind S-W 28 m/s");
        meteoStation.publishEvent("Temperature +25 C");


        ///Воспроизвести шаблон Итератор !!!



    }//main

    private  static void printMinSquare(WithSquare[] array){
        WithSquare minSquare = array[0];
        for (WithSquare withSquare: array){
            if(withSquare.getSquare() < minSquare.getSquare()){
                minSquare = withSquare;
            }
        }
        System.out.println(minSquare);
    }

    private static void printMaxPerimetr(WithPerimetr[] array){
        WithPerimetr maxPerimetr = array[0];
        for (WithPerimetr withPerimetr: array){
            if(withPerimetr.getPerimetr() > maxPerimetr.getPerimetr()){
                maxPerimetr = withPerimetr;
            }
        }
        System.out.println(maxPerimetr);

        if(maxPerimetr instanceof Circle){
            System.out.println("Circle");
        }else if(maxPerimetr instanceof Triangle){
            System.out.println("Triangle");
        }else if(maxPerimetr instanceof Square){
            System.out.println("Square");

        }
    }








    private static void printWordsCount(String sentence){
        String [] words = sentence.split(" ");
        for ( int i = 0; i < sentence.length(); i++){
            words[i] = replace("?", " ").trim();
        }
        for(String word: words){
            int count = 0;
            for(String wordX: words){
                if(word.equalsIgnoreCase(wordX)){
                    count++;
                }

            }
            System.out.println(word + count);

        }
    }
}// class
