package lesson13.homeWork;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Checker {
    public void checkTime(Object object, Object... args) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            boolean isAnnotated = method.isAnnotationPresent(DurationChecker.class);
            if (isAnnotated) {
                try {

                    long start = System.currentTimeMillis();
                    method.setAccessible(true);
                    Parameter[] parameters = method.getParameters();
                    if(parameters.length == args.length){
                        method.invoke(object, args);
                    }
                    if (parameters.length == 0){
                        method.invoke(object);
                    }
                    // method.invoke(object, (Object[]) null);
                    method.setAccessible(false);

                    long finish = System.currentTimeMillis();
                    long getDiffTime = finish - start;
                    System.out.println("It lasted:  " + getDiffTime);

                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}



