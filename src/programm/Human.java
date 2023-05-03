package programm;

public class Human {

    String name;

    int age;

    double weight;

    Dog dog;


    public Human(){
        System.out.println("Hello in empty i am im constructor");
    }

    public Human(String name , int age , double weight , String dogName){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.dog = new Dog(dogName);
    }



    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.weight);
    }


    public void dogInteraction(){
        this.dog.lickFace(this.name);
    }

}
