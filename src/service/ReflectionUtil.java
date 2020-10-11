package service;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class ReflectionUtil {
    private ReflectionUtil() {
        throw  new RuntimeException();
    }



    ///  обозначает что мы прокидываем тип Т  и значит генерирует тип Т
    public static <T>List<T> generateObjectByType(Class<T> clazz, int count) throws  Exception{
        final Constructor<?>[] constructors = clazz.getConstructors();
        Constructor<?> defaultConstructor = null;

        for (Constructor<?> constructor: constructors){
            if(constructor.getParameterTypes().length == 0){
                defaultConstructor = constructor;
                break;
            }
        }
        if(defaultConstructor == null){
            throw new Exception("Class" + clazz.getSimpleName() + "has no default constructor");
        }
            List<T> result = new ArrayList<>();
            for(int i = 0; i < count;i++ ){
                result.add((T)defaultConstructor.newInstance());


     }
        return  result;

    }


    public static void callSecretMethod(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();         ///получаем класс  это самое первое
        Method[] methods = clazz.getDeclaredMethods(); ///  получаем массив методов даже приватных. всех деклариуемые
        Method secretMethod = null;
        for (Method method : methods) {
            boolean isSecret = method.getName().toLowerCase().contains("secret");  //// ищем содержит ли строка в нижнем риегистре этот паттерн
            if (isSecret) {
                secretMethod = method;
                break;
            }
        }
        if (secretMethod == null) {
            throw new RuntimeException("Object doesnt have secret method");
        }
        try {
            secretMethod.setAccessible(true);
            secretMethod.invoke(object);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }

    }


}
