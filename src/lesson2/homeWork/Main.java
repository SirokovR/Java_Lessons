package lesson2.homeWork;

public class Main {
    public static void main(String[] args) {

        findMaxValue(333, 8);     // 1 Task

        printIncreasingSequence(344, 6, 888); // 2 Task


        printDecreasingSequence(33, 5, 88);  // 3 Task

        boolean result = isBelongsToInterval(30, 20, 30); // 4 Task
        System.out.println(result);

        isEntryPossibilities(18);   // 5 Task


        quadraticEquation(5, 6, 1);  //6 Task

    }


    public static void findMaxValue(int a, int b) {
        if (a > b) {
            System.out.println("The first value is greater.");
        } else {
            System.out.println("The second value is greater.");
        }
    }


    public static void printIncreasingSequence(int a, int b, int c) {
        int max, min, middle;
        if (a > b & a > c) {
            max = a;
            if (b > c) {
                middle = b;
                min = c;
            } else {
                middle = c;
                min = b;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a > c) {
                min = c;
                middle = a;
            } else {
                min = a;
                middle = c;
            }
        } else {
            max = c;
            if (a > b) {
                min = b;
                middle = a;
            } else {
                min = a;
                middle = b;
            }
        }
        System.out.println(min + " " + middle + " " + max);

    }


    public static void printDecreasingSequence(int a, int b, int c) {
        int max, min, middle;
        if (a > b & a > c) {
            max = a;
            if (b > c) {
                middle = b;
                min = c;
            } else {
                middle = c;
                min = b;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a > c) {
                min = c;
                middle = a;
            } else {
                min = a;
                middle = c;
            }
        } else {
            max = c;
            if (a > b) {
                min = b;
                middle = a;
            } else {
                min = a;
                middle = b;
            }
        }
        System.out.println(max + " " + middle + " " + min);

    }


    public static boolean isBelongsToInterval(int verifiableNumber, int startInterval, int stopInterval) {
        return (startInterval <= verifiableNumber) & (verifiableNumber < stopInterval);
    }


    public static void isEntryPossibilities(int b) {
        if ((b == 6) | (b == 5) | (b == 8) | (b == 9)) {
            System.out.println("TRUE");
            ;
        } else {
            System.out.println("FALSE");
            ;
        }
    }


    public static void quadraticEquation(int a, int b, int c) {
        double discriminant, x1, x2;
        discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Solutions: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("Negative, there are no real solutions");
        }
    }


}
