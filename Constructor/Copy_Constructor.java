// Task 4:
// Create a class Person with:
// ✓ name, age
// ✓ Constructor with parameters
// ✓ Another constructor that takes a Person object and copies values
// Create one object, then copy it into another.

class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
    //Copy Constructor
    Person(Person n) {
        name = n.name;
        age = n.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {

        Person p1 = new Person("Masum", 23);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}