package map.use;

import dog.Dog;

import java.util.Scanner;

public class PetCreator implements Helper {


    @Override
    public void makeWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pet name");
        String name = scanner.nextLine();
        Dog dog = new Dog(name);
        System.out.println(dog.getName());;
    }

    @Override
    public int getMyCode() {
        return 2;
    }
}
