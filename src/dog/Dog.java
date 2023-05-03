package dog;

public class Dog {

    String name;

    String color;



    public Dog(String name) {
        this.name = name;
    }

    String leakFace(String name){
        return this.name +": I leak face " + name;
    }

}
