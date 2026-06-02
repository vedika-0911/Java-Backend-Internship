public class SingletonDemo {

    private static SingletonDemo obj = new SingletonDemo();

    private SingletonDemo() {}

    public static SingletonDemo getInstance() {
        return obj;
    }

    public static void main(String[] args) {

        SingletonDemo s1 = getInstance();
        SingletonDemo s2 = getInstance();

        System.out.println(s1 == s2);
    }
}