package reflection;

import set.Human;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {

        Human human = new Human("Test", 18);
        Human human2 = new Human("Test", 55);
        Class clazz = human.getClass();
        Class<Human> humanClass = Human.class;
        String name = clazz.getName();
        System.out.println(name);
        System.out.println(clazz.getCanonicalName());
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            if (constructor.getParameterCount() == 1) {
                constructor.setAccessible(true);
                Object o = constructor.newInstance("test");
                Human human1 = (Human) o;
                System.out.println(human1);
            }
        }
        Field age = clazz.getDeclaredField("age");
        Class<?> type = age.getType();
        age.setAccessible(true);
        Object o = age.get(human);
        System.out.println(o);
        age.set(human , 55);
        o = age.get(human);
        System.out.println(o);
        Annotation[] annotations = age.getAnnotations();
        Override annotation1 = age.getAnnotation(Override.class);
        System.out.println(annotation1);
        for (Annotation annotation : annotations) {
            System.out.println(annotation.annotationType());
            if (annotation.annotationType().equals(Deprecated.class)){
                System.out.println("You use deprecated field");
            }
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.toString());
            // if method have private access we invoke him
            if (declaredMethod.getModifiers() == 2){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(human);
            }
            String name1 = declaredMethod.getName();
            if (name1.equals("equals")){
                System.out.println(declaredMethod.invoke(human , human2));
            }
        }

    }


}
