package innerClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Name" , 18);
        Human.Pet pet = human.createPet("Pet name");
        Human human1 = new Human("name "  , 4444 , "Pet name");
        List<Human> humans = new ArrayList<>();
        humans.add(human);
        humans.add(human1);

        new Human("Name " , 18) {
            @Override
            public Pet createPet(String name) {
                System.out.println("I create new pet");
                return super.createPet(name);
            }
        };


        Collections.sort(humans ,
                new Comparator<Human>() {
                    @Override
                    public int compare(Human o1, Human o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });
        humans.add(new Human("sad" , 123));
    }


}
