package lesson1.homeWork;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1 Task

        double case1 = ((double)69/100)+18*(69-Math.pow(13, 2)+69/3.14);
        System.out.println(case1);
        System.out.println((int)case1);
        System.out.println("------------------------------------");

        double beta1Value = 69;
        double case2 = beta1Value/100+18*(beta1Value-13*13+beta1Value/3.14);
        System.out.println(case2);
        System.out.println((int)case2);

        int testDiv = 69/100;
        System.out.format(" Division min/max integers %d \n" ,testDiv);
        System.out.println("------------------------------------");



        //  2 Task

        int a = 2;
        int b = 45;
        int c = 26;
        int maxValue = Math.max(a, Math.max(b,c));
        System.out.format("Maximum value of 3 numbers with Math.max() mod : %d \n", maxValue);

        System.out.println("------------------------------------");

        List<Integer> ls = Arrays.asList(2, 45, 26);
        System.out.println("Maximum value from Streaming with Arrays.asList mod: " + ls.stream().max(Integer::compare).get());

        System.out.println("------------------------------------");

        int maximumValueFromStream = Stream.of(a, b, c).max(Integer::compareTo).get();
        System.out.println("Maximum value from Streaming with Stream.of..: " + maximumValueFromStream);

        System.out.println("------------------------------------");

        int a1 = 22;
        int b1 = 6;
        int c1 = 9;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a1);
        list.add(b1);
        list.add(c1);
        Collections.sort(list);
        System.out.println("Min Integer is : " + list.get(0));
        System.out.println("Max Integer is : " + list.get(list.size() - 1));

        System.out.println("------------------------------------");

        ArrayList <Integer>  autofillArray = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            autofillArray.add(r.nextInt(50));
        }
        System.out.println("Random array generation with ceiling up to 50  " + autofillArray);
        Collections.sort(autofillArray);
        System.out.println("Max Integer is : " + autofillArray.get(autofillArray.size() - 1));





        // 3 Task
        System.out.println("------------------------------------");

        double computation = 20*((double)1/3)+Math.pow(158,2);
        System.out.println(computation);

        //4 Task
        System.out.println("------------------------------------");

        int n = 86;
        int var2 = n % 10;
        int var1 = n / 10;
        int result = var1 + var2;
        System.out.format("A sum of two digits of a number : %d ", result );


    }
}


//init