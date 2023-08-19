package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("неурыфв");
        MyInterface<String, Integer> myInterface = new MyInterface<String, Integer>() {
            @Override
            public void add(String s, Integer s1) {
                System.out.println(s + s1);
            }
        };
        myInterface.add("Hello", 4);
        MyInterface<String, String> myInterface1 = (s, s1) -> {
            System.out.println(s + s1);

        };
        MyInterface<String, Integer> myInterface2 = (s1, x) -> System.out.println(s1 + x);
        myInterface1.add("123", "321");

        MyInterface2 myInterface21 = () -> System.out.println("heelo");

        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("test");
        BiConsumer<String, Integer> biConsumer = (s, x) -> System.out.println(s + x);
        biConsumer.accept("test", 465);

        Function<String, Integer> function = (s) -> Integer.parseInt(s);
        Integer x = function.apply("1");
        System.out.println(x + x);
        Collections.sort(new ArrayList<Integer>(), (z, y) -> z - y);


        Predicate<String> predicate = (s) -> s.length() > 5;
        System.out.println(predicate.test("12345"));
        System.out.println(predicate.test("123456"));

        Supplier<String> supplier = () -> "Test test";

        System.out.println(supplier.get());

        Human human = new Human(122);
        Human human1 = new Human(19);

        Human human4 = human.whoIsOlder((human2, human3) -> {
            if ((human2.getAge() - human3.getAge()) > 0) {
                return human2;
            }
            return human3;
        }, human1);

        System.out.println(human4);


    }

}
