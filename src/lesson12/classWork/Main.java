package lesson12.classWork;

import exseption.MyExseption;

public class Main {
    public static void main(String[] args) {

        try {
            myExceptionTrow(2);
            System.out.println("hello from my try");
        } catch (MyExseption myExseption) {
            myExseption.printStackTrace();
        }
        catch (Exception ex){
            System.out.println(" I catch Exception");
        }
        catch (Throwable tr){
            System.out.println("i catch Throwable");
        }
        finally {
            System.out.println();

        }


        ///изучить тему Трай с ресурсами. конструкция которая позволяет автоматические закрывать обьекты кто имлементиурет Клозибл ли аутоклозеибл

    }


    private static void myExceptionTrow(int i) throws Exception {
        if (i%2 == 0) {
            throw new Exception("Even is not alload");
        }
    }





}
