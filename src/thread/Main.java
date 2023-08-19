package thread;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Human human = new Human(18);

        Thread runnableStarted = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We in runnable");
            }
        });
        Thread thread = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    Human.increase();
                }
            }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    Human.increase();
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    Human.increase();
                }
            }
        };
        Thread thread3 = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    Human.increase();
                }

            }
        };
        Thread thread4 = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10_000; i++) {
                    Human.increase();
                }
            }
        };


        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        runnableStarted.start();

        System.out.println(thread.getPriority());
        System.out.println(thread1.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println("Main");
        Thread.sleep(10);
        System.out.println(Human.count);

    }


}
