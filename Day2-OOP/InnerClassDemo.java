public class InnerClassDemo {

    class Inner {
        void display() {
            System.out.println("Inner Class");
        }
    }

    public static void main(String[] args) {

        InnerClassDemo outer = new InnerClassDemo();

        InnerClassDemo.Inner inner = outer.new Inner();

        inner.display();
    }
}