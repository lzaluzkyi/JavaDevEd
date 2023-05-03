package array;

public class Student {

    private int age;

    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printInfo(){
        System.out.println("My name is "+ name);
        System.out.println("My age is "+ age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
