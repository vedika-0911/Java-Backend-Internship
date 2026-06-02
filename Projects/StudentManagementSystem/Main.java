package Projects.StudentManagementSystem;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(101, "Vedika", 92.5));
        manager.addStudent(new Student(102, "Rahul", 88.0));
        manager.addStudent(new Student(103, "Ananya", 95.2));

        System.out.println("===== STUDENT RECORDS =====");

        manager.displayStudents();
    }
}