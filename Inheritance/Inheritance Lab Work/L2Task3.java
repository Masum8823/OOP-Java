// Task 3:
// Create a class Shape with method draw().
// Also create subclasses:
// ✓ Circle
// ✓ Rectangle
// ✓ Triangle
// Each overrides draw().
// Call them in main.

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle");
    }
}

public class L2Task3 {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();

        s1.draw();
        s2.draw();
        s3.draw();
    }
}