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

    public void makeKaka(){
        System.out.println("Пес посрав");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
