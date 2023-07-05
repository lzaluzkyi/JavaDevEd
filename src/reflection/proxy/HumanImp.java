package reflection.proxy;

public class HumanImp implements Human {

    int age;

    public HumanImp(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Deprecated
    @Override
    public void sayYourAge(){
        System.out.println("My age is " + age);
    }
}
