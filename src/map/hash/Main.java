package map.hash;

import set.Human;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("test", 18);
        Human human1 = new Human("test2", 11);
        Human human2 = new Human("test3", 22);
        Human human3 = new Human("test4", 55);

        Map<String, Human> nameToHuman = new HashMap();
        String a = new String("string");
        nameToHuman.put("test", human);
        nameToHuman.put("test11", human);
        nameToHuman.put("test22", human);
        nameToHuman.put("test33", human);
        nameToHuman.put("test44", human);
        nameToHuman.put("test2", human1);
        nameToHuman.put(human2.getName(), human2);
        nameToHuman.put(a, human3);
        Human test = nameToHuman.get("test3");
        System.out.println(test.toString());

        Map<Human, String> testMap = new HashMap<>();
        testMap.put(human , human.getName());
        System.out.println(testMap.get(human));
        human.setAge(777);
        System.out.println(testMap.get(human));

        Set<Map.Entry<String, Human>> entries = nameToHuman.entrySet();
        for (Map.Entry<String, Human> entry : entries) {
            entry.getValue();
        }

        Set<String> strings = nameToHuman.keySet();
        for (String string : strings) {
            Human human4 = nameToHuman.get(string);
        }

        nameToHuman.getOrDefault("test12312312312" , new Human("12" , 111));
        nameToHuman.putIfAbsent("test12312312312" , human);
        nameToHuman.remove("test12312312312");

        a = "alsd';asld";
        System.out.println(nameToHuman.get("string").toString());


    }

}
