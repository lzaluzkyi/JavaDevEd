package annotations.prcessor;

import annotations.annotation.MyAnnotation;

import java.lang.reflect.Field;

public class MyAnnotationProcess implements AnnotationProcessor{

    public void process(Object o){
        Class<?> aClass = o.getClass();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation annotation = field.getAnnotation(MyAnnotation.class);
                field.setAccessible(true);
                System.out.println("["+annotation.value()+"] Був викликаний метод " + field.getName());
            }
        }
    }
}
