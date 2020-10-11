package lesson14.homeWork;


/*
1*****Write a Java program to create a new array list, add some colors (string) and print out the collection.
2*****Write a Java program to iterate through all elements in a array list.
3*****Write a Java program to insert 10 element into the array list at the first position
4*****Write a Java program to retrieve an element (at a specified index) from a given array list.
5*****Write a Java program to update specific array element by given element
6*****Write a Java program to remove the third element from a array list. Call it several times.
7*****Write a Java program to search an element in a array list.
8*****Write a Java program to copy one array list into another.
9*****Write a Java program to shuffle elements in a array list.
10*****Write a Java program to reverse elements in a array list.
11*****Write a Java program to extract a portion of a array list
12*****Write a Java program to compare two array lists.
13*****Write a Java program of swap two elements in an array list.
14*****Write a Java program to join two array lists
15*****Write a Java program to empty an array list.
16*****Write a Java program to test an array list is empty or not.
17*****Write a Java program to trim the capacity of an array list the current list size.
18*****Write a Java program to increase the size of an array list.
19*****Write a Java program to replace the second element of a ArrayList with the specified element.
20*****Write a Java program to print all the elements of a ArrayList using the position of the elements.
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {



        //listTask4(4);
        //listTask5(3,"Fiolet");
        //listTask6();
        //listTask7("black");
        listTask8();
        //listTask9();
        //listTask10();
        //listTask11(1,3);
        //listTask12();
        //listTask13(0,2);
        //listTask14();
        //listTask15();
        //listTask16();
        //listTask17();
        //listTask18();
        //listTask19("myNewColor");
        //listTask20();





    }

    //Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void listTask4(int x){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        String element = colors.get(x);
        System.out.println(x + " element: "+element);

    }

    //Write a Java program to update specific array element by given element
    public static void listTask5(int position, String newColor){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println("colors before update was" + colors);
        colors.set(position,newColor);
        System.out.println("colors after update is" + colors);

    }

    //Write a Java program to remove the third element from a array list. Call it several times.
    public static void listTask6(){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println("Before remove" + colors);
        colors.remove(3);
        System.out.println("After remove" + colors);
        colors.remove(3);
        System.out.println("After second remove" + colors);
    }

    //Write a Java program to search an element in a array list.
    public static void listTask7(String colorForSearching){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        if (colors.contains(colorForSearching)) {
            System.out.println(colorForSearching + " was found");
        } else {
            System.out.println("There is no such element");
        }
    }


    //Write a Java program to copy one array list into another.    при копировании второй вписываеться в первый с начала
    public static void listTask8(){
        List<String> letters1 = new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        System.out.println("First list before " + letters1 );
        List<String> letters2 = new ArrayList<>();
        letters2.add("F");
        letters2.add("G");
        letters2.add("H");
        System.out.println("Second list is " + letters2 );
        Collections.copy(letters1,letters2);
        System.out.println("First list after copy" + letters1);
        System.out.println("Second list after copy" + letters2);


    }

    //Write a Java program to shuffle elements in a array list.
    public static void listTask9(){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println("Before shuffling was " + colors);
        Collections.shuffle(colors);
        System.out.println("After shuffling is " + colors);
    }

    //Write a Java program to reverse elements in a array list.
    public static void listTask10(){
        List<String> numbers = new ArrayList<>();
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        numbers.add("5");
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }

    //Write a Java program to extract a portion of a array list
    public static void listTask11(int firstPosition, int secondPosition){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println("Before extracting : " + colors);
        List<String> sub_colors = colors.subList(firstPosition,secondPosition);

        System.out.println(sub_colors);

    }

    //Write a Java program to compare two array lists.
    public static void listTask12(){
        ArrayList<String> numbers1 = new ArrayList<>();
        numbers1.add("A");
        numbers1.add("B");
        numbers1.add("C");
        numbers1.add("D");
        numbers1.add("E");
        List<String> numbers2 = new ArrayList<>();
        numbers2.add("A");
        numbers2.add("B");
        numbers2.add("w");
        numbers2.add("D");
        numbers2.add("E");
        numbers2.removeAll(numbers1);
        if(numbers2.isEmpty()){
            System.out.println("numbers1 are equal to numbers2");
        }else{
            System.out.println("numbers1 are NOT equal to numbers2");
        }


    }

    //Write a Java program of swap two elements in an array list.
    public static void listTask13(int firstPosition, int secondPosition){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println(colors);
        Collections.swap(colors,firstPosition,secondPosition);
        System.out.println(colors);

    }

    //Write a Java program to join two array lists
    public static void listTask14(){
        List<String> colors1 = new ArrayList<>();
        colors1.add("white");
        colors1.add("red");
        colors1.add("orange");
        colors1.add("black");
        colors1.add("blue");
        List<String> colors2 = new ArrayList<>();
        colors2.add("purpur");
        List<String> sumColorsSet = new ArrayList<>();
        sumColorsSet.addAll(colors1);
        sumColorsSet.addAll(colors2);
        System.out.println(sumColorsSet);

    }

    //Write a Java program to empty an array list.
    public static void listTask15(){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println("Colors before job" + colors);
        colors.clear();
        System.out.println("Colors after clear() " + colors);
    }

    //Write a Java program to test an array list is empty or not.
    public static void listTask16() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        if (!colors.isEmpty()) {
            System.out.println("We are using isEmpty(), so - Colors is Not empty");
        } else {
            System.out.println("Colors is empty");
        }
    }

    //Write a Java program to trim the capacity of an array list the current list size.
    public static void listTask17() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        colors.add("testColor");
        colors.remove(5);
        System.out.println(colors.size());
        colors.trimToSize();
        System.out.println(colors.size());
    }

    //Write a Java program to increase the size of an array list
    public static void listTask18() {
        ArrayList<String> colors = new ArrayList<>(5);
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        System.out.println("Colors list capacity is "+ colors.size());
        colors.ensureCapacity(7);
        colors.add("testColor");
        System.out.println("Colors list with new capacity is " + colors.size());

    }

    //Write a Java program to replace the second element of a ArrayList with the specified element.
    public static void listTask19(String newElement){
    List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("orange");
        colors.add("black");
        colors.add("blue");
        colors.add("testColor");
        System.out.println(colors);
        colors.set(1,newElement);
        System.out.println(colors);
    }

    //Write a Java program to print all the elements of a ArrayList using the position of the elements.
    public static void listTask20(){
        List<String> colors = new ArrayList<>(Arrays.asList("red","black","white","blue","orange"));
        System.out.println(colors);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }



}
