class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class InheritanceDemo extends Animal {

    public static void main(String[] args) {
        InheritanceDemo obj = new InheritanceDemo();
        obj.sound();
    }
}