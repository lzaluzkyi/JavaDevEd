package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        List<String> strings1 = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.add("String");
        strings1.add("String1");
        strings.add("String1");
        strings1.add("String2");
        strings.add("String2");
        strings.add(0 , "String3");
        strings.add(0 , "String3");
        int size = strings.size();
        System.out.println(size);
        String secondElement = strings.get(2);
        System.out.println(secondElement);
        strings.remove("String3");
        strings.remove(1);
        strings.addAll(strings);
        strings.addAll(1 , strings);
        System.out.println(strings.contains("String3"));
        strings.retainAll(strings1);

        List<String> strings2 = strings.subList(2, strings.size());
        int string3 = strings.indexOf("String2");
        System.out.println(string3);
        System.out.println(strings.lastIndexOf("String2"));

        strings.set(0 , "Testetse");

        strings.get(10);

        for (String string : strings) {
            System.out.println((i++) + " " + string);
        }



        for (String string : strings2) {
            System.out.println( string);
        }

        String [] strings3 = new String[0];

    }

}
