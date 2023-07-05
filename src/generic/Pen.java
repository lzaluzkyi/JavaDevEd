package generic;

public class Pen implements Savable , Comparable<Savable>{

    private String name;

    private Integer count;

    public Pen(String name, Integer count) {
        this.name = name;
        this.count = count;
    }


    @Override
    public Integer getCount() {
        return this.count;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Savable o) {
        return this.count - o.getCount();
    }
}
