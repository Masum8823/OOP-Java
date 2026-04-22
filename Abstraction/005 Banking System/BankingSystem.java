abstract class Loan {
    double amount = 100000; 

    abstract void calculateInterest();
}

class HomeLoan extends Loan {
    double interest;

    void calculateInterest() {
        interest = amount * 0.08;
        System.out.println("Home Loan Interest: " + interest + " BDT");
    }
}

class CarLoan extends Loan {
    double interest;

    void calculateInterest() {
        interest = amount * 0.10;
        System.out.println("Car Loan Interest: " + interest + " BDT");
    }
}

class EducationLoan extends Loan {
    double interest;

    void calculateInterest() {
        interest = amount * 0.06;
        System.out.println("Education Loan Interest: " + interest + " BDT");
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        Loan home = new HomeLoan();
        Loan car = new CarLoan();
        Loan edu = new EducationLoan();

        System.out.println("---- Loan Interest Calculation ----\n");

        home.calculateInterest();
        car.calculateInterest();
        edu.calculateInterest();
    }
}