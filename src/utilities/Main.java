package utilities;

import java.util.Date;
import java.util.Random;

import static lesson2.classWork.Main.getRandomFromRange;

public class Main {
    public static void main(String[] args) {


        System.getProperties().list(System.out);


        System.out.println(getRandomNumberInRange(3,6));

        new Random().ints(2, 3, 6).forEach(System.out::println);
        //for Java8 Only!

        System.out.println(
                System.getProperty("java.library.path"));


        System.out.println(new Date());

        System.out.println(getRandomFromRange(3,10));


    }



    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }





} //class
