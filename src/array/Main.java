package array;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //  0   1   2   3   4        149
        // [0] [0] [0] [0] [0] ....  [0]
        int[] numbers = new int[7];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50);
        }

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("i = " + i + ", element = " + number);
        }

        //  0   1   2   3   4     5
        // [13] [12] [111] [42] [241]
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            int currentNumber = numbers[i];
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }

        }
        System.out.println("max = " + maxNumber);
        System.out.println("min = " + minNumber);
        Student student1 = new Student(17, "Make");
        Student student2 = new Student(18, "Steve");
        Student student3 = new Student(23, "Lena");

        Student[] students = new Student[3];
        students[0] = student2;
        students[1] = student1;
        students[2] = student3;


        for (int i = 0; i < students.length; i++) {
            Student currentStudent = students[i];
            if (currentStudent.getAge() > 17) {
                currentStudent.printInfo();
            }
        }

        int a = 11;
        if (a % 10 == 0) {
            System.out.println("В наc парне число " + a);
        } else {
            System.out.println("В наc не парне число " + a);
        }

    }
}
