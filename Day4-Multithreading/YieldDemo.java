public class YieldDemo extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
        }

    }

    public static void main(String[] args) {

        YieldDemo t1 = new YieldDemo();
        t1.start();

        Thread.yield();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread");
        }

    }
}