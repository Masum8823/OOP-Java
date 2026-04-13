// Create a School Management System using Java Inheritance with the
// functionalities given below:
// ✓ Base class: Person with attribute name and age.
// ✓ Constructor: Initialize name and age when a new object is created.
// ✓ Method: Disp() to display basic information.
// ✓ Student class with an attribute grade inherits Person class.
// ✓ Constructor: Initialize name, age, and grade
// ✓ Print student performance message within a method performance()
// o >= 90 → print “Excellent”
// o 75–89 → print “Good”
// o < 75 → print “Needs improvement”

// ✓ Teacher class with an attribute string type array of subject inherits Person
// class.
// ✓ Constructor: Initialize name, age, and subject.
// ✓ Method: Display the list of classes taught (e.g., 5 classes)
// ✓ Main class:
// ✓ Create multiple objects of the class Student and Teachers using
// constructors.
// ✓ Display all info of the methods and attributes from all objects.

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void disp() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int grade;

    Student(String n, int a, int g) {
        super(n, a);
        grade = g;
    }

    void performance() {
        if (grade >= 90)
            System.out.println("Excellent");
        else if (grade >= 75)
            System.out.println("Good");
        else
            System.out.println("Needs improvement");
    }
}

class Teacher extends Person {
    String[] subject;

    Teacher(String n, int a, String[] sub) {
        super(n, a);
        subject = sub;
    }

    void showSubjects() {
        for (int i = 0; i < subject.length; i++) {
            System.out.println(subject[i]);
        }
    }
}

public class L2Task5 {
    public static void main(String[] args) {

        Student s1 = new Student("Masum", 23, 88);
        Student s2 = new Student("Rahul", 22, 92);

        String[] subs = {"Math", "Java", "DBMS"};
        Teacher t1 = new Teacher("Raihan", 40, subs);

        s1.disp();
        s1.performance();

        s2.disp();
        s2.performance();

        t1.disp();
        t1.showSubjects();
    }
}