package lesson2.classWork;

public class Main {
    public static void main(String[] args) {
        printClosest(40, 80, 200);

        System.out.println(getSum(22, 44));

        int sum = getSum(33, 44);
        System.out.println("Sum =" + sum);

        System.out.println("max value is:  " + printMaximum(77, 5, 6));


        System.out.println(getM(22,444,55));

        int random  =(int)(Math.random()*25)+5;
        System.out.println(random);

        random = getRandomFromRange(400, 500);
        System.out.println(random);



        int a1= getRandomFromRange(3,10);
        int b1 = getRandomFromRange(6,12);
        int c1 = getRandomFromRange(1, 15);
        boolean isTriangle = isTrianglePossible(a1,b1,c1);
        System.out.println("Possible - " + isTriangle);

         String result =  printBoolean(false);
        System.out.println(result);

        int test = getM(3,5,6);
        System.out.println(test);



    }


    public static String printBoolean(boolean bool){
        return bool? "TRUE" : "False";
    }


    public static boolean isTrianglePossible(int a, int b, int c){
        if(a + b >c){
            if(b+c >a){
                if (a + c >b)
                return true;
            }
        }
        return false;
    }


    ///  Метод для полученияя рандомных значений в задаваемом интервале
    public static int getRandomFromRange(int from, int to){
         return (int)(Math.random()*(to-from)+from);
    }


    public static int getM(int a, int b, int c){
        if (a>b){
            if(a>c){
                return a;
            }else {
                return c;
            }
        }else {
            if (b >c) {
                return b;
            }else {
                return c;
            }
        }
    }


    public static int printMaximum(int a, int b, int c) {
        int maxValue = Math.max(a, Math.max(b, c));
        return maxValue;
    }


    public static int getSum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printClosest(int paramA, int paramB, int point) {
        int distA = point - paramA;
        int distB = point - paramB;
        distA = Math.abs(distA);
        distB = Math.abs(distB);

        if (distA > distB) {
            System.out.println("paramB is closer to " + point);
        } else {
            System.out.println("paramA is closer to " + point);

        }
    }
}
