// Task 4:
// Create a class Account with:
// ✓ private balance
// ✓ protected accountNumber
// Create subclass SavingsAccount and test which variables are accessible.

class Account {
    private double balance = 7000;
    protected int accountNumber = 12345;

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    void testAccess() {

        // System.out.println(balance); Not accessible (private) we can use setter getter method 

        System.out.println("Account No: " + accountNumber); 
        showBalance(); 
    }
}

public class L2Task4 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount();
        s1.testAccess();
    }
}