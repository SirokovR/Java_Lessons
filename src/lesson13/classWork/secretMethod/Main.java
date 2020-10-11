package lesson13.classWork.secretMethod;

import lesson.annotation.RangeValidator;
import lesson11.home.Truck;
import lesson7.classWork.Circle;
import service.ReflectionUtil;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        Circle objectWithSecretMethod = new Circle(7);
        ReflectionUtil.callSecretMethod(new Circle(7));


        RangeValidator validator = new RangeValidator();
        Circle circle = new Circle(9);
        validator.validate(circle);

    }
}
