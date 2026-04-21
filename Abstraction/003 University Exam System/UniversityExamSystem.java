// Abstract Class
abstract class Exam {
    abstract void startExam();
    abstract void evaluate();
    abstract void showResult();
}

// Programming Exam
class ProgrammingExam extends Exam {
    int marks;

    void startExam() {
        System.out.println("Programming Exam Started");
    }

    void evaluate() {
        marks = 85;
        System.out.println("Evaluating based on code output and test cases");
    }

    void showResult() {
        System.out.println("Programming Exam Marks: " + marks);
    }
}

// Theory Exam
class TheoryExam extends Exam {
    int marks;

    void startExam() {
        System.out.println("Theory Exam Started");
    }

    void evaluate() {
        marks = 78;
        System.out.println("Evaluating written answers");
    }

    void showResult() {
        System.out.println("Theory Exam Marks: " + marks);
    }
}

// Viva Exam
class VivaExam extends Exam {
    int marks;

    void startExam() {
        System.out.println("Viva Exam Started");
    }

    void evaluate() {
        marks = 90;
        System.out.println("Evaluating oral performance");
    }

    void showResult() {
        System.out.println("Viva Exam Marks: " + marks);
    }
}

// Main Class
public class UniversityExamSystem {
    public static void main(String[] args) {

        Exam prog = new ProgrammingExam();
        Exam theory = new TheoryExam();
        Exam viva = new VivaExam();

        System.out.println("---- Programming Exam ----");
        prog.startExam();
        prog.evaluate();
        prog.showResult();

        System.out.println("\n---- Theory Exam ----");
        theory.startExam();
        theory.evaluate();
        theory.showResult();

        System.out.println("\n---- Viva Exam ----");
        viva.startExam();
        viva.evaluate();
        viva.showResult();
    }
}