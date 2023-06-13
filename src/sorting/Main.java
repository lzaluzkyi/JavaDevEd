package sorting;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        MyComparator myComparator = new MyComparator();
        NameComparator nameComparator = new NameComparator();
        List<Human> humans = new ArrayList<>();

        humans.add(new Human("Test4" , 15));
        humans.add(new Human("Test2" , 1));
        humans.add(new Human("Test1" , 111));
        humans.add(new Human("Test4" , 12));
        humans.add(new Human("Test4" , 111));

        print(humans);
        System.out.println();
        humans.sort(myComparator);
        print(humans);
        System.out.println();
        humans.sort(null);
        print(humans);
        System.out.println();
        humans.sort(nameComparator);
        print(humans);

    }

    private static void print(List<Human> humans) {
        for (Human human : humans) {
            System.out.println(human.toString());
        }
    }


}

//[ -1 ]
//[ 0 ]
//[ 1 ]
//[ 3 ]
//[ 22 ]
//[ 1 ]
//[ 55 ]

// 1 - (-1) = 2