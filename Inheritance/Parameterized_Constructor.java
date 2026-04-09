// Task 2:
// Create a class Book with:
// ✓ title, author, price
// ✓ A parameterized constructor to initialize all variables
// ✓ A method display() to print book details
// Create 2 Book objects with different values.

class Parameterized_Constructor {

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

