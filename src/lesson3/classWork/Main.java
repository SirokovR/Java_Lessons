package lesson3.classWork;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {0,2,3,10,15};
        int arrayLength = intArray.length;
        //System.out.println(arrayLength);

        int arrayItem = intArray[2];
        System.out.println(arrayItem);
        int last = intArray[intArray.length-1];

        int[] emptyArray =new int[4];// dlina massiva
        emptyArray[3] = 3;
        emptyArray[2] = 5;
        //System.out.println(emptyArray.length);
/*
        for( int i =0; i <emptyArray.length; i++){
            System.out.println(emptyArray[i]);
        }

        int j =1;
        for( int i = 1; i< 7  ; i++){
            System.out.println(j);
            j +=2;
        }

*/

        //printByNumber(66);

        //printArrayByWile(emptyArray);

        int a = 10;
        int[] array = {0, 1, 2};

        System.out.println();

        variableMutator(a);
        arrayMutator(array);


        System.out.println("a=" +a);
        printArrayByWile(array);



        int fromRundom =  lesson2.classWork.Main.getRandomFromRange(3,8);

        int[] generatedArray = generateArray(3,5,8);
        printArrayByWile(generatedArray);

        int sum = getSum((generatedArray));
        System.out.println(" Sum = " + sum);







    }
    public static void getFirrstIndexFor0(int[] array){
        int[] nums = new int[9999];
        for (int i = 1000; i < nums.length; i= i+3)
            nums[i] = i;

    }




    public static void print5(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 5 != 0){
                continue;
            }
            System.out.println("5 -> " + array[i]);

        }
    }


    public static void printMinMax(int[] array){
        int maxIndex = 0;
        int minIndex = 0;

        for(int i =0; i < array.length; i++){
            if(array[i] > array[maxIndex]){
                maxIndex = i;
            }
            if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        System.out.println(maxIndex);
        System.out.println((minIndex));

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;


        int maxNumber1 = array[0];
        int minNumber1 = array[0];

        for(int i =1; i < array.length; i++){
            if(array[i] > maxNumber1){
                maxNumber1 = array[i];
            }
            if(array[i] < minNumber1){
                minNumber1 = array[i];
            }
        }
    }





    public  static void printOddsNumbers(int[] array){
        int counter = 0;
        for( int i = 0; i < array.length; i++){
            if( array[i]%2 !=0){
                counter ++;
            }

        }
        System.out.println(counter);

    }


    public static int getSum(int[] array){
        int result = 0;
        for( int i =0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }



    public  static int[] generateArray(int from, int to, int capasity){
        int [] result = new int[capasity];
        for(int i =0; i < result.length; i++){
            result[i] = lesson2.classWork.Main.getRandomFromRange(from,to);
        }
        return result;
    }



    public  static void variableMutator(int a){
        a = a +1;
        System.out.println("a in mutator =" + a);
    }

    public static void arrayMutator(int[] array){
        array[0] =9999;
    }


    public static void printByNumber(int count){
        int i = 0;
        int j = 1;

        while(i < count){
            System.out.println(j + ",");
            j += 2;
            i++
            ;
        }
    }

    public static void printByNumber1(int count){
        int j =1;
        for( int i = 1; i< count  ; i++){
            System.out.println(j + " ");
            j +=2;
        }



    }


    public static  void printArrayByWile(int[] array){
        int i = 0;

        while( i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }

    }


}


