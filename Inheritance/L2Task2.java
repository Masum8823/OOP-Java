// Task 2:
// Create a class Person with a constructor that prints "Person created".
// Create a subclass Teacher with its own constructor that prints "Teacher created".
// Create a Teacher object and observe the output.

class Person {
    Person() {
        System.out.println("Person created");
    }
}

class Teacher extends Person {
    Teacher() {
        System.out.println("Teacher created");
    }
}

public class L2Task2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
    }
}