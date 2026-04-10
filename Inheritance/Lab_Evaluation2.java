/*
========================================================
Program Title: School Management System
========================================================

Problem Description:

Write a Java program to demonstrate the concept of 
Inheritance and Method Overriding using three classes:
Person, Student, and Teacher.

--------------------------------------------------------
Class 1: Person (Base Class)
--------------------------------------------------------
Data Members:
- name (String)
- age (int)
- address (String)

Tasks:
- Create a constructor to initialize all variables
- Create a method displayInfo() to print all details

--------------------------------------------------------
Class 2: Student (Derived Class)
--------------------------------------------------------
Inherits: Person

Additional Data Members:
- Rollnumber (String)
- Department (String)
- Marks (int)

Tasks:
- Create constructor and call parent constructor using super
- Override displayInfo() method to include student details
- Create method calculategrade():
    Marks >= 80       → Print "A+"
    Marks 75 - 79     → Print "A"
    Otherwise         → Print "Normal Result"

--------------------------------------------------------
Class 3: Teacher (Derived Class)
--------------------------------------------------------
Inherits: Person

Additional Data Members:
- Teacher_id (int)
- Subject (String)
- Salary (double)

Tasks:
- Create constructor using super
- Override displayInfo() method
- Create method calculatesalary():
    If Teacher_id is EVEN:
        Reduce salary by 5%
    If Teacher_id is ODD:
        Increase salary by 15%

--------------------------------------------------------
Main Method:
--------------------------------------------------------
- Take input from user using Scanner
- Create objects of Person, Student, Teacher
- Call:
    displayInfo() for all
    calculategrade() for Student
    calculatesalary() for Teacher

--------------------------------------------------------
Concepts Used:
--------------------------------------------------------
- Inheritance
- Method Overriding
- Constructor & super keyword
- Conditional Statements
- User Input (Scanner)

========================================================
*/

import java.util.*;

class Person{
  String name;
  int age;
  String address;
  
    Person(String name, int age, String address){
      this.name = name;
      this.age = age;
      this.address = address;
    }
    
    void displayInfo(){
      System.out.println("Name: " + name);
      System.out.println("Age " + age);
      System.out.println("Address " + address);
    }
}

class Student extends Person{
  String Rollnumber;
  String Department;
  int Marks;
  
    Student(String name, int age, String address, String Rollnumber, String Department, int Marks){
      super(name,age,address);
      this.Rollnumber = Rollnumber;
      this.Department = Department;
      this.Marks = Marks;
    }
    
    @Override
    void displayInfo(){
      super.displayInfo();
      System.out.println("Rollnumber " + Rollnumber);
      System.out.println("Department " + Department);
      System.out.println("Marks " + Marks);
    }
    
    void calculategrade(){
      if (Marks>=80){
        System.out.println("A+");
      } 
      else if (Marks>=75 || Marks<80){
        System.out.println("A");
      } 
      else{
        System.out.println("Normal Result");
      }
    }
  
}

class  Teacher extends Person{
  int Teacher_id;
  String Subject;
  double Salary;
  
  Teacher(String name, int age, String address, int Teacher_id, String Subject, double Salary){
    super(name,age,address);
    this.Teacher_id = Teacher_id;
    this.Subject = Subject;
    this.Salary = Salary;
  }
  
  @Override
  void displayInfo(){
    super.displayInfo();
    System.out.println("Teacher_id " + Teacher_id);
    System.out.println("Subject " + Subject);
    System.out.println("Salary " + Salary);
  }
  
  void calculatesalary(){
    if(Teacher_id%2 == 0){
      Salary += (Salary * ((-5)/100.0));
      System.out.println("Salary after Reduction: " + Salary);
    }
    
    else{
      Salary += Salary * (15/100.0);
      System.out.println("Salary after Bonus: " + Salary);
    }
  }
  
}

public class Lab_Evaluation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Person Info:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Address: ");
        String address = sc.nextLine();
        
        Person p1 = new Person(name, age, address);
        p1.displayInfo();
        
        System.out.println("\nEnter Student Info:");
        System.out.print("Roll Number: ");
        String roll = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();

        Student s1 = new Student(name, age, address, roll, dept, marks);
        s1.displayInfo();
        s1.calculategrade();

        System.out.println("\nEnter Teacher Info:");
        System.out.print("Teacher ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Subject: ");
        String subject = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Teacher t1 = new Teacher(name, age, address, id, subject, salary);
        t1.displayInfo();
        t1.calculatesalary();

        sc.close();
    //Solution for the Java Inheritance Lab Evaluation.
    }
}