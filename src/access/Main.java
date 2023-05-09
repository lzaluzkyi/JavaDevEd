package access;

public class Main {

    public static void main(String[] args) {
        System.out.println(Robot.robotCount);
        Robot robot = new Robot();
        robot.setName(null);
        String name = robot.getName();
        System.out.println(name);
        robot.setName("Help me");
        robot.setName(null);
        System.out.println(robot.getName());

        robot.setAge(-1);
        System.out.println(robot.getAge());
        robot.setAge(1);
        System.out.println(robot.getAge());
        robot.setAge(-2);
        System.out.println(robot.getAge());
        System.out.println(robot.daysOnWorkWithAgeTest() + " result");
        robot.setDaysOnWork(-2);
        System.out.println(robot.daysOnWorkWithAgeTest() + " result");

        System.out.println(robot.getWorkDesc());
        System.out.println(robot.getWorkDesc());
        System.out.println(Robot.robotCount);
        Robot robot1 = new Robot();
        System.out.println(Robot.robotCount);
        Robot.discount();
        System.out.println(Robot.robotCount);

        Robot[] robots = new Robot[2];

        robots[0] = new Robot();


    }



}
