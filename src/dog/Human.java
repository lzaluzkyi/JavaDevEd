package dog;

public class Human {

    String name;

    int age;

    double weight;

    Dog dog;

    private Juice juice;

    private int sipCapacity;


    public Human(){
        System.out.println("Hello in empty i am im constructor");
    }

    public Human(String name , int sipCapacity) {
        this.name = name;
        this.sipCapacity = sipCapacity;
    }

    //    public Human(String name , int age , double weight , String dogName){
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.dog = new Dog(dogName);
//    }
//
//    public Human(String name, int age, double weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//
//    public void printInfo(){
//        System.out.println(this.name);
//        System.out.println(this.age);
//        System.out.println(this.weight);
//    }
//
//
//    public String dogInteraction(){
//       return this.dog.leakFace(this.name);
//    }
//
//    public Dog getDog(){
//        if (this.dog == null){
//            Dog unnamed = new Dog("Unnamed");
//            this.dog = unnamed;
//        }
//        return this.dog;
//    }

    public Juice getJuice(){
        return this.juice;
    }

    public void setJuice(Juice juice){
        this.juice = juice;
    }

    public boolean isJuiceExist(){
        boolean isJuiceExist = getJuice() != null;
        return isJuiceExist;
    }

    public void drinkJuice(int sipCount){
        System.out.println(this.name +" drink "+ getJuice().getFruit() +" juice");
        this.getJuice().drink(sipCount , this.sipCapacity);
    }

    public Juice findMyJuice(String position){
        if (getJuice().getPosition() == position){
            return getJuice();
        }
        return null;
    }

    public void changeJuiceOwner(Human newOwner){
        newOwner.setJuice(this.getJuice());
        this.setJuice(null);
    }



}
