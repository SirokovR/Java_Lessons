package model;

public interface MyInterface {
    void myMethod();

//    void myMethod(Long lng);
//
//    void myMethod(Long lng,Long lng1);
//
//    int myMethod(Integer integer);
//
//    int myMethod(Number number);

    default int myDefoltMethod(){
        return 10;
    }
}
