package lesson2.bitRealisation;

public class BitRealisation {

    public static int getMax1(int a, int b) {
        if( a > b){
            return a;
        } else {
            return b;
        }

    }

    public static int getMin1(int a, int b) {
        if( a < b){
            return a;
        } else {
            return b;
        }

    }


    public static  void test11(int a, int b, int c){
        int min = getMin(a, getMin(b, c));
        int max = getMax(a, getMax(b, c));
        int mid = a + b + c - min - max;

        System.out.println(min + " " + mid + " " + max);

    }








    public static int getMax(int a, int b) {
        int c = a - b;
        return a + ((c | (a & (~b))) >> 31) * c;
    }

    public static int getMin(int a, int b) {
        return b + ((a - b) & ((a - b) >> 31));
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = -18;

        int min = getMin(a, getMin(b, c));
        int max = getMax(a, getMax(b, c));
        int mid = a + b + c - min - max;

        System.out.println(min + " " + mid + " " + max);
    }
}


//init