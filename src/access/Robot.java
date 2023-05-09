package access;

public class Robot {

    private String name;

    private int age;

    private final String workDesc = "Never change";

    private int daysOnWork;

    public static int robotCount;

    public Robot() {
        robotCount++;
    }

    private Robot(String name, int age, String workDesc, int daysOnWork) {
        setName(name);
        setAge(age);
        this.daysOnWork = daysOnWork;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }else {
            if (this.name == null){
                this.name = "test test";
            }
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }
    }

    public final int daysOnWorkWithAgeTest(){
       return this.age + this.daysOnWork;
    }

    public String getWorkDesc() {
        return workDesc;
    }

    public int getDaysOnWork() {
        return daysOnWork;
    }

    public void setDaysOnWork(int daysOnWork) {
        if (daysOnWork >= 0){
            this.daysOnWork = daysOnWork;
        }
    }
    public static void discount(){
        robotCount--;
    }
}
