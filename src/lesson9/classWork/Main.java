package lesson9.classWork;

import model.Programmer;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        cycle();
        System.out.println();
        recursionPrint(9);
        System.out.println();
        recursivePrintReverse(9);



        String strA =new String("A");
        String strB =new String("B");
        System.out.println("== " + (strA == strB));
        System.out.println("equals " + strA.equals(strB));


        String str1P ="A";
        String str2P ="A";
        System.out.println("==P " + (str1P==str2P));


        String str9 = new String("One");
        String str10 = str9.concat("Two");
        System.out.println(str10);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("One");
        stringBuilder.append(new Programmer("ivan","ivanov", new String[]{"Java"}));
        stringBuilder.append("two");
        System.out.println(stringBuilder.toString());

        stringBuilder.append(999);

        StringBuffer stringBuffer = new StringBuffer();


        String sentence = "Hello my Frend, How are you? Laisk";
        String [] strs = sentence.split(" ");
        String newReplace = sentence.replace("l","g");
        sentence.trim();
        sentence.equalsIgnoreCase("aaa");
        sentence.charAt(0);
        System.out.println(getWordsNumber(sentence));

        String mathExpression = " 2*(5+2) - (10+5)";


        printVarArgs(2,4,4,5);

        //Pattern pattern = Pattern.compile();


    }//main



    private static int getWordsNumber(String sentence){
        String [] result = sentence.split(" ");
        int count = 0;
        for (int i = 0; i <result.length ; i++) {
            count++;
        }
        return count;
    }


    private static String getWordMaxLength(String sentence){
        String maxLength = "";
       for (String word: sentence.split(" ")){
           String cleardWord = word.replace("?", " ").replace("!", "").replace(",", "").replace(".", "").trim();
           if(cleardWord.length() > maxLength.length()){
               maxLength = cleardWord;
           }
       }
        return maxLength;
    }



    public static String replace(String rawString, String... whatToEliminate){
        for(String toEliminate: whatToEliminate){
            rawString = rawString.replace(toEliminate," ").trim();

        }
        return  rawString;
    }



    private static boolean isMathExpressionCorrect(String mathExpression){
        int countR = 0;
        int countL = 0;

        for (int i = 0; i < mathExpression.length(); i++) {
            if(mathExpression.charAt(i) == ')'){
                countL++;
            }
            if(mathExpression.charAt(i) == '('){
                countR++;
            }
        }
        return false;
    }


    private static void cycle() {
        int n = 9;
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");

        }
    }


    private  static  void recursionPrint(int n){
        if(n == 0){
            System.out.print(n + " ");
            return;
        }
        recursionPrint(n-1);
        System.out.print(n + " ");
    }



    private static void recursivePrintReverse(int n){
        if(n== 0){
            System.out.println(n + " ");
            return;
        }
        System.out.print(n + " ");
        recursivePrintReverse(n-1);
    }

    private  static  int getFiboNumber(int n){
        if(n==0){
            return  0;
        }
        if(n==1){
            return  1;
        }
        return getFiboNumber(n-1) + getFiboNumber(n - 2);
    }




    private  static  void printVarArgs(int...numbers){
        System.out.println(numbers);
    }

    private  static  void printVarArgs1(int t, int...numbers){
        System.out.println(numbers);
    }










}//class

