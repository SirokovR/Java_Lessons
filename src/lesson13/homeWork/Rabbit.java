package lesson13.homeWork;

public class Rabbit {
   @DurationChecker
    public String longLongMethod(){
        try {
            Thread.sleep(666);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "This is a longLongMethod called!";
    }


   //@DurationChecker
    public static long getFactorial(long number){
        return (number<=1)? 1: (number * getFactorial(number -1));
    }
}
