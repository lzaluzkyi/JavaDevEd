package generic;

public class Money implements Savable, Comparable<Savable> {

    private String currency;

    private Integer count;

    public Money(String currency, Integer count) {
        this.currency = currency;
        this.count = count;
    }

    @Override
    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency='" + currency + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public int compareTo(Savable o) {
        return this.count - o.getCount();
    }
}
