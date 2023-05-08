package inheritance;

public class Lion extends Animal{

    public Lion(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(super.name + " Їсть мясо");
    }
}
