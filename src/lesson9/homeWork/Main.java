package lesson9.homeWork;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int resultFactorial = getFactorial(3);
        System.out.println(resultFactorial);





        String stringForPalidrom = "texet";
        if(chekPalidrome(stringForPalidrom)){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }





        String passwordString = "weT7ubp";
        if(chekPassword(passwordString)){
            System.out.println("Its a Strong password");
        }else{
            System.out.println("This password is incorrect" );
        }



        String  testString="We know that to know is to hard to know";
        countWordsInString(testString);





    }//main


    private static int getFactorial(int number) throws IllegalArgumentException {
        if(number < 0){
            System.out.println("incorect");
            throw new IllegalArgumentException();
        }
        if(number == 0){
            return  1;
        }

        return (number * getFactorial(number - 1));
    }





    private static boolean chekPalidrome(String inputString) {
        char first;
        char last;
        int size = inputString.length();
        String subString;
        if(size < 2){
            return  true;
        }else{
            first = inputString.toCharArray()[0];
            last = inputString.toCharArray()[size - 1];
            subString = inputString.substring(1, size - 1);
        }
        return first == last && chekPalidrome(subString);
    }




    private static void countWordsInString(String inputString){
        String []wordArray = inputString.split("\\s");
        Map<String, Integer> testMap= new HashMap<>();
        int count=0;

        for(int i=0;i<wordArray.length;i++){
            count=0;

            for(int j=0;j<wordArray.length;j++){
                if(wordArray[i].equals(wordArray[j])){
                    count++;
                }
            }
            testMap.put(wordArray[i], count);
        }
        System.out.println(testMap);
    }




    private static boolean chekPassword(String inputString){
        return (inputString.matches(".*\\d+.*")
                && inputString.matches(".*[a-z].*")
                && inputString.matches(".*[A-Z].*") && inputString.length()>= 7);
    }





}//class
