package reflection.proxy;

public class Main {

    public static void main(String[] args) {

        Human human = HumanProvider.create(11);
        human.sayYourAge();

    }

}
