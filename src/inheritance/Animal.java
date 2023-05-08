package inheritance;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void brith(){
        System.out.println(this.name + " brith");
    }

    public abstract void feed();

}
