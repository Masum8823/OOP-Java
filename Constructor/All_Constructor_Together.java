// Create a class Employee with:
// ✓ Variables: name, id, salary
// ✓ Default constructor
// ✓ Parameterized constructor
// ✓ Copy constructor
// ✓ Method showInfo()
// ✓ Method finalize() or close() to simulate destructor
// In main, create multiple employees and test all constructors.
// All_Constructor_Together

class Employee {

    String name;
    int id;
    double salary;

    Employee() {
        name = "Unknown";
        id = 0;
        salary = 0;
    }

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    Employee(Employee e) {
        name = e.name;
        id = e.id;
        salary = e.salary;
    }

    void showInfo() {
        System.out.println("Name: " + name +
                           ", ID: " + id +
                           ", Salary: " + salary);
    }

    protected void finalize() {
        System.out.println("Employee object destroyed");
    }
}

public class All_Constructor_Together {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("Masum", 1349, 10000);
        Employee e3 = new Employee(e2);

        e1.showInfo();
        e2.showInfo();
        e3.showInfo();

        e1 = null;
        e2 = null;
        e3 = null;
        System.gc();
    }
}