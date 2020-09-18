package lesson4.classWork;

import static jdk.nashorn.internal.objects.NativeMath.random;

public class Main {
    public static void main(String[] args) {
        //int[] unsorted = {2, 4, 7, 1, 66, 5, 8};
        //lesson3.classWork.Main.printArrayByWile(unsorted);

        // int[] sorted = sortArrayBuBubble(unsorted);
        // lesson3.classWork.Main.printArrayByWile(sorted);

        //int[][] twoDimArray = {{23,5,45,5},{44,7,8,9},{33,5,8,12}};
        //printTwoDimArray(twoDimArray);

        //getMinIndexFromTwoDimArray(twoDimArray);

        //doWhilePrintArray(unsorted);
        //System.out.println();


        Men ivan = new Men(49, "Ivan", "Director");
        Object max = new Men(55,"Max","Tester");
        Men maria = new Men();
        maria.name = "Maria";
        int a = (int) random(44);
        Men nicolai = new Men(a, "Nicolai", "Actor");


        Men[] people = {ivan, maria, (Men) max};
        printOldestName(people);

        printLowestSalaryProfession(people);


    } //main

    public static void printLowestSalaryProfession(Men[] people){
        Men lowestSalary = people[0];
        for(Men men : people) {
            if(men.salary < lowestSalary.salary){
                lowestSalary = men;
            }
        }
        System.out.println(lowestSalary.profession);
    }



    public static void printOldestName(Men[] people) {
        Men oldest = people[0];
        for (Men men : people) {
            if (men.age > oldest.age) {
                oldest = men;
            }
        }
        System.out.println(oldest.age);

    }


    public static void forEachPrintArray(int[] array) {
        for (int item : array) {
            System.out.println((item + " "));
        }
    }


    public static void doWhilePrintArray(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;

        } while (i < array.length);
    }


    public static void getMinIndexFromTwoDimArray(int[][] array) {
        int iMax = 0;
        int jMax = 0;
        int iMin = 0;
        int jMin = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[iMin][jMin]) {
                    jMin = j;
                    iMin = i;
                }
                if (array[i][j] > array[iMax][jMax]) {
                    jMax = j;
                    iMax = i;
                }
            }
        }
        System.out.println("min index=" + iMin + " " + jMin);
        System.out.println("max index=" + iMax + " " + jMax);
    }


    public static void getMaxNumberFromTwoDimArray(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }


            }

        }
        System.out.println("max value=" + max);
    }


    public static void printTwoDimArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[] sortArrayBuBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

        return array;
    }


}///class
