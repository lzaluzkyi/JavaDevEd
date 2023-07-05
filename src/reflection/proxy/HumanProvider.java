package reflection.proxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HumanProvider {

    public static Human create(Integer age) {
        HumanImp human = new HumanImp(age);

        Class<Human>[] humanClass = new Class[1];
        humanClass[0] = Human.class;

        Human proxy = (Human) Proxy.newProxyInstance(
                human.getClass().getClassLoader(),
                humanClass, new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Annotation annotation = method.getAnnotation(Deprecated.class);
                        if (annotation!=null){
                            System.out.println("u use deprecated method");
                        }
                        return method.invoke(human , args);
                    }
                });
        return proxy;

    }


}
