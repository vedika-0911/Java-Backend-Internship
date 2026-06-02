class Engine {
    void start() {
        System.out.println("Engine Started");
    }
}

public class HasARelationshipDemo {

    Engine engine = new Engine();

    public static void main(String[] args) {

        HasARelationshipDemo car = new HasARelationshipDemo();
        car.engine.start();
    }
}