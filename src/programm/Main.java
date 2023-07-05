package programm;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println(LocalDate.now());

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello i am a new smart program");
        System.out.println("For continue follow instruction");
        System.out.println("Are u agree?");
        boolean runProgram = sc.nextBoolean();
        if (runProgram){
            System.out.println("Enter your name");
            sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("Enter your age");
            int age = sc.nextInt();
            System.out.println("Enter your weight");
            double weight = sc.nextDouble();
            System.out.println("Enter your dog name");
            sc = new Scanner(System.in);
            String dogName = sc.nextLine();

            Human human = new Human(name , age , weight , dogName);
            human.printInfo();
            human.dogInteraction();
            System.out.println("I am off after running");
        }else {
            System.out.println("I am off");
        }


    }
}
