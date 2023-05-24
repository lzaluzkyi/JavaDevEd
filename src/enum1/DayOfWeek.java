package enum1;

public enum DayOfWeek {

    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

    final int numberOfDay;

    DayOfWeek(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public void printTourInfo() {
        System.out.println(this + "   " + this.numberOfDay);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
