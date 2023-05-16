package interface2;

public class Car implements Movable{

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void move() {
        System.out.println("car drive with speed : " + speed);
    }
}
