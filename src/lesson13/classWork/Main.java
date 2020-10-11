package lesson13.classWork;

import lesson11.home.Truck;
import model.Programmer;
import service.ReflectionUtil;

import javax.sound.midi.Track;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Programmer javaDeveloper = new Programmer("roman", "dou", new String[]{"java", "python"});
        System.out.println(javaDeveloper);

        Object obj = javaDeveloper;
        javaDeveloper = null;
        System.out.println(obj);

        final Class<?> objClass = obj.getClass();
        final Constructor<?>[] constructors = objClass.getConstructors();
        System.out.println(constructors.length);

        obj.getClass().getDeclaredFields();
        final Method[] methods = objClass.getMethods();
        final Field[] fields = objClass.getFields();

        ///написать свой валидотор !!


        List<Truck> trucks = null;
        List<Programmer> programmers = null;
        try {
            trucks = ReflectionUtil.generateObjectByType(Truck.class, 1900);

            programmers = ReflectionUtil.generateObjectByType(Programmer.class, 1900);
        } catch (Exception e) {

            System.out.println("Error cause:" + e.getMessage());
            System.out.println("Error stactrace:" + e.getStackTrace());

            e.printStackTrace();
        }


        System.out.println(trucks);

    }

}
