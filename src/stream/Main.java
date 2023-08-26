package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(2);
        integers.add(2);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        Optional<Integer> first = integers.stream().findFirst();
        System.out.println(first.get());
        Optional<Integer> any = integers.stream().findAny();
        System.out.println(any.get());

        Optional<Integer> min = integers.stream().max((a, b) -> a - b);
        System.out.println(min.get());
        Optional<Integer> reduce = integers.stream().reduce((integer, integer2) -> integer + integer2);
        System.out.println(reduce.get());

        List<Integer> collect1 = integers.stream()
                .filter(integer -> integer > 2 && integer < 5)
                .collect(Collectors.toList());
        System.out.println(collect1);

        Stream<Integer> stream = integers.stream();
        List<Integer> collect2 = stream
                .sorted((o1, o2) -> o2 - o1).skip(2).limit(2)
                .collect(Collectors.toList());
        System.out.println(collect2);


        List<Integer> collect3 = integers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect3);

        integers.stream().filter(integer -> integer > 3)
                .peek(integer -> System.out.println(integer))
                .collect(Collectors.toList());

        List<String> collect = integers.stream()
                .distinct()
                .filter(integer -> integer < 4)
                .map(integer -> integer.toString()).collect(Collectors.toList());
        System.out.println(collect);


        List<String> collect4 = collect.stream().flatMap(s -> {
            ArrayList<String> objects = new ArrayList<>();
            objects.add(s);
            return objects.stream();
        }).collect(Collectors.toList());






    }


}
