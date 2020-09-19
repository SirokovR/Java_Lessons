package lesson1.classWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("____________");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("_____________");

        int result = (int) (((double) 7 / 3) * 10) % 31;
        System.out.println(result);

        int value =14;
        double result2 = value/209+value*(29-13*13+value/3);
        System.out.println(result2);

        //inc ++ ;
        //inc++;
        //inc *= 2;   //inc = inc * 2
        //inc /= 2; // inc = inc / 2


        int a = 17;
        int b = 8;
        int result6 = a/b;
        int remain = a%b;
        System.out.println( a + "/" + b + " = " + result6 +  ", remain = "  + remain);






        int n = 5;
        boolean isOdd = ((n % 2) !=0);

        if( isOdd) {
            System.out.println("odd");
        } else {
            System.out.println("no");
        }

    }
}

//init
