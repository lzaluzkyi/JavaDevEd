package map.tree;

import set.Human;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("yes", 1111111);
        Human human2 = new Human("yes", -11);
        Human human3 = new Human("yes", 111);
        Human human4 = new Human("yes", 454);
        Human human5 = new Human("yes", 464);

        Map<Human , Integer> humanToInteger = new TreeMap<>();
        humanToInteger.put(human , human.getAge());
        humanToInteger.put(human2 , human2.getAge());
        humanToInteger.put(human3 , human3.getAge());
        humanToInteger.put(human4 , human4.getAge());
        humanToInteger.put(human5 , human5.getAge());

        System.out.println(humanToInteger.get(human2).toString());
    }

}
