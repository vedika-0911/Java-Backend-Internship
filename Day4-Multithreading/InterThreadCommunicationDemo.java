class Customer {

    int amount = 10000;

    synchronized void withdraw(int amount) {

        if (this.amount < amount) {
            System.out.println("Waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
        }

        this.amount -= amount;
        System.out.println("Withdrawal Completed");
    }

    synchronized void deposit(int amount) {

        this.amount += amount;
        System.out.println("Amount Deposited");

        notify();
    }
}

public class InterThreadCommunicationDemo {

    public static void main(String[] args) {

        Customer c = new Customer();

        new Thread(() -> c.withdraw(15000)).start();

        new Thread(() -> c.deposit(10000)).start();

    }
}