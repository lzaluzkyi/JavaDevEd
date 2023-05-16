package object;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Name", 18);
        Student student1 = new Student("Name", 18);
        student = null;
        student = new Student("Name", 18);
        System.out.println(student.getClass());
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student.equals(student1));
        System.out.println(student1.equals(student));

        Object[] ob = new Object[4];
        ob[0] = student;
        ob[1] = new Test();
        ob[2] = new Random();
        ob[3] = student;
        for (int i = 0; i < ob.length; i++) {
            System.out.println(ob[i].equals(new Student("Name" , 18)));
            System.out.println(ob[i].getClass() == student.getClass());
        }

    }


}
