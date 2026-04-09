// Create a class Rectangle with:
// ✓ length, width
// ✓ Constructor 1: no parameter (default length = 1, width = 1)
// ✓ Constructor 2: parameterized (length, width)
// ✓ Method area() to calculate area
// Test both constructors.

class Rectangle {

    double length;
    double width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class NoPara_Para_Constructor {
    public static void main(String[] args) {

        Rectangle ra = new Rectangle();
        Rectangle rb = new Rectangle(2, 4);

        System.out.println("Default Constructor Area: " + ra.area());
        System.out.println("Parameterized Constructor Area: " + rb.area());
    }
}