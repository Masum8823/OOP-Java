// Quiz_Question from Mahadi_Sir

class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }

    void display() {
        System.out.println(name + " salary : " + calculateSalary() + " TK");
    }
}

class Lecturer extends Employee {
    int extraClasses;
    double ratePerClass;

    Lecturer(String name, double baseSalary, int extraClasses, double ratePerClass) {
        super(name, baseSalary);
        this.extraClasses = extraClasses;
        this.ratePerClass = ratePerClass;
    }

    // overriding
    double calculateSalary() {
        return extraClasses * ratePerClass;
    }
}

class LabAssistant extends Employee {
    int overtimeHours;
    double overtimeRate;

    LabAssistant(String name, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    // overriding
    double calculateSalary() {
        return overtimeHours * overtimeRate;
    }
}

class AdminStaff extends Employee {
    double bonus;

    AdminStaff(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    // overriding
    double calculateSalary() {
        return baseSalary - bonus;
    }
}

public class Quiz_Question_Mahadi_Sir {
    public static void main(String[] args) {

        Employee e1 = new Lecturer("Rahim", 30000, 5, 1000);
        Employee e2 = new LabAssistant("Karim", 20000, 10, 1200);
        Employee e3 = new AdminStaff("Sadia", 25000, 5000);

        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            e.display();
        }
    }
}