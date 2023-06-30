package map.use;

public class Exit implements Helper {
    @Override
    public void makeWork() {
        System.exit(666);
    }

    @Override
    public int getMyCode() {
        return 3;
    }
}
