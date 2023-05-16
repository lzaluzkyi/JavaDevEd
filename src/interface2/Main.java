package interface2;

public class Main {

    public static void main(String[] args) {

        Movable movable = new Dog();
        Movable movable1 = new Car(120);

        Car car = new Car(150);

        car.move();
        movable.move();
        movable1.move();

    }

}
