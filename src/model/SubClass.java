package model;

import exseption.MyExseption;

import java.io.IOException;

public class SubClass extends AbstractParent{


    @Override
    public void publicMethod(){}

    @Override
    protected void protectedMethod(){
        System.out.println(" hi");
        super.protectedMethod();
    }

    @Override
    void defaultMethod(){}

    //@Override
    private void privateMethod(){}



    //return type covariants:
    // при преобпределении может быть намбер или все его челды
    @Override
    public Long returnInteger(){
        return  null;
    }

    @Override
    void exceptionExample() throws IOException {
        throw new IOException(" ");
    }

///при оверайде кидает только такой же или болеее конктретный
}
