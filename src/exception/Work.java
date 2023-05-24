package exception;

public class Work {

    private Human[] workers;

    public Work() {
        workers = new Human[10];
        for (int i = 0; i < workers.length - 1; i++) {
            workers[i] = new Human();
            workers[i].setName("Test" + i);
            workers[i].setId(new Long(i));

        }
        workers[0] = new Human();
        workers[workers.length - 2].setId(new Long(workers.length - 2));
    }

    public void printWorkersInfo() {
        for (int i = 0; i < workers.length; i++) {
            try {
                workers[i].printInfo();
            } catch (Exception e) {
                throw new IllegalArgumentException("Some human have some problem", e);
            }
        }

    }

}
