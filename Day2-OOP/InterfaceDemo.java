interface Vehicle {
    void drive();
}

public class InterfaceDemo implements Vehicle {

    public void drive() {
        System.out.println("Driving");
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();
        obj.drive();
    }
}