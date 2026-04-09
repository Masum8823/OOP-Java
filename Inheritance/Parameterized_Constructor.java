// Task 2:
// Create a class Book with:
// ✓ title, author, price
// ✓ A parameterized constructor to initialize all variables
// ✓ A method display() to print book details
// Create 2 Book objects with different values.

class Book {

    String title;
    String author;
    double price;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class Parameterized_Constructor {
    public static void main(String[] args) {

        Book b1 = new Book("Basic GK Hour", "Alal", 250);
        Book b2 = new Book("Onneshon Bangla", "Milon", 600);

        b1.display();
        b2.display();
    }
}