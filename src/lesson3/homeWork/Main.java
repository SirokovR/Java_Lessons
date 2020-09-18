package lesson3.homeWork;

public class Main {
    public static void main(String[] args) {

        //fourDigitProgression();   // Task 1

        //multiplyByFive();           // Task2

        //multiplyTesting(3,-3,26);    //Task3a

        //doWhileTesting();            //Task3b

        //getFibonacci();              //Task4
        


        getRandomFromRangeReleases();     //Task5

        //getRandomFromRange1();         //Task5

        //getRandomFromRange2();         //Task5

        //test2();


    } //main scope


    public static void fourDigitProgression() {
        int[] array = new int[9999];
        for (int i = 1000; i < array.length; i = i + 3) {
            System.out.print(" " + i);
        }
    }


    public static void multiplyByFive() {
        int[] array = new int[200];
        int startPoint = 100;
        while (startPoint <= array.length) {
            System.out.print(startPoint % 5 == 0 ? startPoint + " " : "");
            startPoint++;
        }
    }


    public static void multiplyTesting(int multiple, int from, int to) {
        int[] array = new int[to];
        int startPoint = from;
        while (startPoint <= array.length) {
            System.out.print(startPoint % multiple == 0 ? startPoint + " " : "");
            startPoint++;
        }
    }


    public static void doWhileTesting() {
        int counter = 0;
        int i = 2;
        do {
            System.out.print(" " + i);
            i = (i * 2);
            counter++;

        } while (counter <= 20);
    }


    public static int getFibonacciRecurse(int i) {
        if (i <= 1) {
            return i;
        } else {
            return getFibonacciRecurse(i - 1) + getFibonacciRecurse(i + 2);
        }
    }


    public static void getFibonacci() {
        long[] array = new long[20];
        for (int i = 0; i < array.length; i++) {
            if (i < 2) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
            System.out.println(array[i]);

        }


    }


    public static void getRandomFromRange1() {
        int maxCount = 0, minCount = 0;
        int[] array = new int[20];
        do {
            for (int i = 0; i < array.length; i++) {
                array[i] = lesson2.classWork.Main.getRandomFromRange(-100, 100);
                if (array[i] < 0) {
                    minCount++;
                }
                if (array[i] > 0) {
                    maxCount++;
                }
                if (array[i] == 0) {
                    --i;
                }
                if (i == array.length - 1 & maxCount != array.length / 2) {
                    maxCount = 0;
                    minCount = 0;
                }
            }
        }
        while (maxCount != array.length / 2 & minCount != array.length / 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void getRandomFromRange2() {
        int maxCount = 0, minCount = 0;
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = lesson2.classWork.Main.getRandomFromRange(-100, 100);
            if (array[i] < 0) {
                maxCount++;
            }
            if (array[i] > 0) {
                minCount++;
            }
            if (array[i] == 0 || maxCount > minCount + 1 || minCount > maxCount + 1) {
                --i;
                if (maxCount > minCount + 1) maxCount--;
                if (minCount > maxCount + 1) minCount--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    public static void getRandomFromRangeReleases() {
        int plusCount = 10;
        int minusCount = 10;
        int i = 0;
        int[] array = new int[20];

        while (plusCount > 0 || minusCount > 0) {
            int number = lesson2.classWork.Main.getRandomFromRange(-100, 100);

            if (number > 0 && plusCount > 0) {
                array[i] = number;
                plusCount -= 1;
                i += 1;
            }

            if (number < 0 && minusCount > 0) {
                array[i] = number;
                minusCount -= 1;
                i += 1;
            }

        }
        for (int t = 0; t < array.length; t++) {
            System.out.print(array[t] + " ");
        }
    }



    public static void test2() {
        int plusCount = 4;
        int minusCount = 4;
        int i = 0;
        int[] array = new int[8];

        while (plusCount > 0 && minusCount > 0) {
            int[] number = new int[1];
            number[0] = lesson2.classWork.Main.getRandomFromRange(-100, 100);


                if (number[0] > 0 && plusCount > 0) {
                    array[i] = number[0];
                    plusCount -= 1;
                    i += 1;
                }

                if (number[0] < 0 && minusCount > 0) {
                    array[i] = number[0];
                    minusCount -= 1;
                    i += 1;
                }

        }
        for (int t = 0; t < array.length; t++) {
            System.out.print(array[t] + " ");

        }
    }


} // class
