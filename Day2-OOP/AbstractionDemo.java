abstract class Shape {
    abstract void draw();
}

public class AbstractionDemo extends Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }

    public static void main(String[] args) {

        AbstractionDemo obj = new AbstractionDemo();
        obj.draw();
    }
}