package lesson14.classWork;

import lesson6.homeWork.Car;
import lesson6.homeWork.Color;
import lesson6.homeWork.Manufacturer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();  //константное время доступа, медленное удаление
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        cars.add(new Car());
        List<Car> carsLL = new LinkedList<>();//линйное время доступа,  быстрое удаление.
        carsLL.add(null);
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");

      /*  listTask1();
        listTask2(colors);
        listTask3();*/



        // если пользуешься хешсетом то надо в классе Car записать  Иквелс и Хашькод !!!!
        Set<Car> carSet = new HashSet<>();
        Car car1 = new Car(10000,1300, Manufacturer.BMV, Color.BLACK);
        Car car2 = new Car(10000,1300, Manufacturer.BMV, Color.BLACK);
        Car car3 = new Car(10000,1300, Manufacturer.BMV, Color.BLACK);
        boolean add1 = carSet.add(car1);
        boolean add2 = carSet.add(car2);
        boolean add3 = carSet.add(car3);
        System.out.println("add1 =" + add1);
        System.out.println("add2 =" + add2);
        System.out.println("add3 =" + add3);
        System.out.println(carSet);

        Set<String> setTree = new TreeSet<>(); /// из трии сета быстро читаеться
        setTree.add("9");
        setTree.add("1");
        setTree.add("b");
        setTree.add("a");
        setTree.add("A");
        setTree.add("AA");
        System.out.println(setTree);

        Set<Car> setTreecars = new TreeSet<>();
        setTreecars.add(new Car());
        System.out.println(setTreecars); /// будет ошибка потому что передаем несравнимые классы



    }
    //Write a Java program to create a new array list,
    // add some colors (string) and print out the collection.
    private static void listTask1(){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println(colors);
    }

    //Write a Java program to iterate through all elements in a array list.
    public static <E> void listTask2(Collection<E> collection){
        Iterator<E> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


    //Write a Java program to insert 10 element
    // into the array list at the first position

    public static void listTask3(){
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(0,new Car());
        }
        System.out.println(list);
    }







}//class
