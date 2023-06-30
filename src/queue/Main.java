package queue;

import set.Human;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        Queue<Human> humans = new PriorityQueue();
        //FIFO
        //FILO
        humans.add(new Human("Name3" , 1));
        humans.add(new Human("Name2" , 2));
        humans.add(new Human("Name1" , 3));
        humans.add(new Human("Name1" , 4));
        humans.add(new Human("Name1" , 11));
        humans.add(new Human("Name1" , 225));
        humans.add(new Human("Name1" , 2));



        for (Human human : humans) {
            System.out.println(human.toString());
        }
    }

}
