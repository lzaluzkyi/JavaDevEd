package set;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Human name = new Human("name", 18);
        Human name1 = new Human("name2", 12);
        Human name2 = new Human("name3", 155);
        Human name3 = new Human("name3", 19);
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        Set<Human> humans = new TreeSet<>();
        Set<Human> humans1 = new HashSet<>();
        humans.add(name);
        humans.add(name1);
        humans.add(name2);
        humans.add(name3);
        humans.remove(name3);

        for (Human human : humans) {
            System.out.println(human.toString());
        }
    }

}
