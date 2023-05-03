package programm;

public class Dog {

    String name;

    String color;



    public Dog(String name) {
        this.name = name;
    }

    void lickFace(String name){
        System.out.println(this.name +": I leak face " + name);
    }

}
