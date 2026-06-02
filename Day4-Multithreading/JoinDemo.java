public class JoinDemo extends Thread {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread");
        }

    }

    public static void main(String[] args) throws InterruptedException {

        JoinDemo t1 = new JoinDemo();

        t1.start();
        t1.join();

        System.out.println("Main Thread Finished");

    }
}