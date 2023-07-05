package set;

import com.sun.xml.internal.ws.developer.Serialization;

public class Human implements Comparable<Human>{

    private String name;

    @Deprecated
    @Serialization
    private Integer age;


    public Human(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Human(String name) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return age != null ? age.equals(human.age) : human.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Human o) {
        return o.age - this.age;
    }

    private void test(){
        System.out.println("we in private method");
    }

    protected void test2(){
        System.out.println("we in private method");
    }

     void test3(){
        System.out.println("we in private method");
    }
}
