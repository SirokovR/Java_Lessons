package service;

import lesson7.classWork.Figure;
import model.Shape;

import java.util.ArrayList;

public interface Reporter<T> {
    void printReport(ArrayList<T> figures);
    void myCalculation(T obj1, T obj2);
}
