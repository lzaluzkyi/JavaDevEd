package lambda;

import java.util.function.BiFunction;

public class Human {

    private int age;


    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human whoIsOlder(BiFunction<Human , Human , Human> function , Human human){
       return function.apply(this , human);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }
}
