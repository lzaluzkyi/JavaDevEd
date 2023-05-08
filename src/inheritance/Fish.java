package inheritance;

public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(super.name + " Пливає і ротом ловить їжу для риб");
    }

    @Override
    public void brith() {
        System.out.println(super.name + " Витягує жабрами повітря з води");
    }
}
