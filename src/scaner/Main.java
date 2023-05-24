package scaner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuHelper helper = new MenuHelper();
        StudentGroup group = null;
        boolean isRun = true;
        while (isRun) {
            helper.printMenu();
            int userInput = sc.nextInt();

            switch (userInput) {
                case (1): {
                    group = helper.createGropeText();
                    break;
                }
                case (2): {
                    Student student = helper.createAndAddStudentText();
                    group.add(student);
                    break;
                }
                case (3): {
                    group.printInfo();
                    break;
                }
                case (4): {
                    sc = new Scanner(System.in);
                    System.out.println("Enter student name");
                    String name = sc.nextLine();
                    group.findStudent(name);
                    break;
                }



                case (0): {
                    isRun = false;
                }

            }
        }
        System.out.println("Goodbye");

    }

}
