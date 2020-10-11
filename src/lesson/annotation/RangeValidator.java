package lesson.annotation;

import java.lang.reflect.Field;

public class RangeValidator{
    public  void validate(Object object){
        final Field[] fields = object.getClass().getDeclaredFields();
        for(Field field: fields){
            boolean isAnnotated = field.isAnnotationPresent(ValidateRange.class);
            if(isAnnotated){
                try {
                    field.setAccessible(true); /// это приватный метод
                    Object value = field.get(object);
                    if(value instanceof Integer){
                        final Integer valueInteger = (Integer) value;
                        final ValidateRange annotation = field.getAnnotation(ValidateRange.class);
                        int min = annotation.min();
                        int max = annotation.max();
                        if(valueInteger > max || valueInteger < min){
                            throw  new RuntimeException("Out of range[" + min + "," + max + "]");
                        }

                    }else{
                        System.err.println("Wrong field type for the @ValidateRage ");
                    }


                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}

