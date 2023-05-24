package enum1;

public class Main {

    public static void main(String[] args) {


//        System.out.println(DayOfWeek.SUNDAY.numberOfDay);
//        System.out.println(DayOfWeek.WEDNESDAY);
//        System.out.println(DayOfWeek.THURSDAY);
//        System.out.println(DayOfWeek.FRIDAY);
        DayOfWeek friday = DayOfWeek.valueOf("FRIDAY");
        System.out.println(friday.numberOfDay);
        DayOfWeek[] values = DayOfWeek.values();
        for (int i = 0; i < values.length; i++) {
            DayOfWeek currentDay = values[i];
            System.out.println(currentDay);
        }
        System.out.println(DayOfWeek.MONDAY.hashCode());
        System.out.println(DayOfWeek.FRIDAY.hashCode());
        System.out.println(DayOfWeek.MONDAY.equals(DayOfWeek.MONDAY));
        System.out.println(DayOfWeek.MONDAY.equals(DayOfWeek.FRIDAY));

        String input = "MONDAY";

        DayOfWeek dayOfWeek = DayOfWeek.valueOf(input);

        if (DayOfWeek.MONDAY.equals(dayOfWeek)){
            System.out.println("hey its monday");
        }else if (DayOfWeek.FRIDAY.equals(dayOfWeek)){
            System.out.println("hey its FRIDAY");
        }

        DayOfWeek.WEDNESDAY.printTourInfo();

    }

}
