package list.linked;

import sorting.Human;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Name" , 18);
        Human human1 = new Human("Name2 " , 11);
        Human human2 = new Human("Name3" , 22);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(human);
        myLinkedList.add(human1);
        myLinkedList.add(human2);
        myLinkedList.add(human);
        myLinkedList.add(human2);
        System.out.println(myLinkedList.get(4).toString());

        List<Integer> integers = new LinkedList<>();
        List<Integer> integers1 = new ArrayList<>();


    }

}
