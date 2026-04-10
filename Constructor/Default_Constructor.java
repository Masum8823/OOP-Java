// Task 1:
// Create a class Student with:
// ✓ Variables: name, id
// ✓ A default constructor that prints: "Student object created"
// In main(), create an object of Student.

class Student {

    String name;
    int id;

    Student() {
        System.out.println("Student object created");
    }
}

public class Default_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}