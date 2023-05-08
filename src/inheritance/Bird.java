package inheritance;

public class Bird extends Animal{


    public Bird(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(super.name + " Клює зерно");
    }
}
