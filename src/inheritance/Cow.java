package inheritance;

public class Cow extends Animal {

    String color;

    public Cow(String name, String color) {
        super(name);
        this.color = color;
    }

    public void sayColor() {
        System.out.println(super.name + "says: My color is " + this.color);
    }

    @Override
    public void feed() {
        System.out.println(super.name + " Їсть траву");
    }
}
