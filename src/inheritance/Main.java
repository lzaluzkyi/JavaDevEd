package inheritance;

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion("Simba");
        Cow cow = new Cow("Buryonka","Red");
        Fish fish = new Fish("Future fish roll");
        Bird bird = new Bird("Чвірік чвірік");

        Animal[] zoo = new Animal[5];
        zoo[0] = bird;
        zoo[1] = cow;
        zoo[2] = lion;
        zoo[3] = fish;



        for (int i = 0; i < zoo.length; i++) {
            Animal currentAnimal = zoo[i];
            if (currentAnimal != null) {
                currentAnimal.feed();
                currentAnimal.brith();
            }
        }


    }
}
