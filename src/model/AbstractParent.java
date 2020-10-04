package model;

public  abstract class AbstractParent {
    public int publicInt = 9;
    protected  int protectedInt = 10;
    int defInt = 11;
    private int privateInt = 12;



    public void publicMethod(){}
    protected void protectedMethod(){}
     void defaultMethod(){}
    private void privateMethod(){}

    // NUmber это супер класс для всех Integers, Long, double
    public Number returnInteger(){
        return  null;
    }


}
