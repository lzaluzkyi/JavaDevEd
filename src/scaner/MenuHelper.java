package scaner;

import java.util.Scanner;

public class MenuHelper {


    public void printMenu(){
        System.out.println("Hello I am program for adding students to group and add new group!!!!");
        System.out.println("Press 1 for add group");
        System.out.println("Press 2 for add new student to group");
        System.out.println("Press 3 for show group info");
        System.out.println("Press 4 for find student in group");



        System.out.println("Press 0 for exit");
    }

    public StudentGroup createGropeText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter group name");
        String groupName = sc.nextLine();
        System.out.println(groupName);
        return new StudentGroup(groupName);
    }

    public Student createAndAddStudentText(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name");
        sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        System.out.println("Enter student age");
        sc = new Scanner(System.in);
        int studentAge = sc.nextInt();
        return new Student(studentName , studentAge);
    }

}
