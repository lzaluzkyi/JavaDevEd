package innerClass;

import java.util.Arrays;
import java.util.List;

public class Human {

    private String name;

    private Integer age;

    private List<Pet> pets;

    class Pet {

        private String name;

        public Pet(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void printInfo() {
            System.out.println(age);
            System.out.println(Human.this.name);
        }
    }

    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Human(String name, Integer age, String petName) {
        this.name = name;
        this.age = age;
        List<Pet> pets = Arrays.asList(new Pet(petName));
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public Pet createPet(String name) {
        return new Pet(name);
    }
}
