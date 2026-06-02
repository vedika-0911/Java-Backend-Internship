class MemoryManagementDemo {

    public static void main(String[] args) {

        System.out.println("Object Created");

        System.out.println("Garbage Collection Requested");

        System.gc();
    }
}