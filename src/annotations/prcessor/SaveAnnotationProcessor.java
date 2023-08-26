package annotations.prcessor;

import annotations.annotation.Save;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveAnnotationProcessor implements AnnotationProcessor{

    public void process(Object o){
        Class<?> aClass = o.getClass();
        boolean annotationPresent = aClass.isAnnotationPresent(Save.class);
        if (annotationPresent){
            Save annotation = aClass.getAnnotation(Save.class);
            if (annotation.value()){
                try {
                    ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(annotation.fileName()));
                    stream.flush();
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }


}
