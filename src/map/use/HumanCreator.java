package map.use;

import set.Human;

import java.util.Scanner;

public class HumanCreator implements Helper{
    @Override
    public void makeWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter human name");
        String name = scanner.nextLine();
        scanner = new Scanner(System.in);
        System.out.println("Enter age");
        int age = scanner.nextInt();
        Human human = new Human(name, age);
        System.out.println(human.toString());
    }

    @Override
    public int getMyCode() {
        return 1;
    }
}
