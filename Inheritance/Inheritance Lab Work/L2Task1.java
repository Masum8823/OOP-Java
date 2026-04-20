// Task 1:
// Create a class Student with attributes:
// ✓ name
// ✓ roll
// Also create a subclass Result that adds:
// ✓ marks
// Now write a method to display all information’s.

class Student {
    String name;
    int roll;
}

class Result extends Student {
    int marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}

public class L2Task1 {
    public static void main(String[] args) {

        Result r1 = new Result();

        r1.name = "Masum";
        r1.roll = 1349;
        r1.marks = 88;

        r1.display();
    }
}
