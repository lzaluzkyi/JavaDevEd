package thread;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public class Human {

    private Integer age;

    private Set<String> names = new CopyOnWriteArraySet();

    public static AtomicInteger count = new AtomicInteger(0);

    public static void increase(){
         count.incrementAndGet();
    }

    public Human(Integer age) {
        this.age = age;
    }

    public void addNewName(String name) {
        names.add(name);
    }

    public void removeNewName(String name) {

        names.remove(name);
    }

     public void printAllNames() {
        System.out.println(names);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Set<String> getNames() {
        return names;
    }

    public void setNames(Set<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", names=" + names +
                '}';
    }
}
