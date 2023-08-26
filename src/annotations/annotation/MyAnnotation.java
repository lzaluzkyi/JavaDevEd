package annotations.annotation;

import annotations.Human;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD , ElementType.FIELD})
public @interface MyAnnotation {

    String value() default "";

}
