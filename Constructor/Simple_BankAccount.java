// Create a class BankAccount with:
// ✓ accountNumber, balance
// ✓ Constructor that does not allow negative balance (if negative, set to 0)
// ✓ Method deposit() and withdraw().
class BankAccount {

    int accountNumber;
    double balance;

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        if (bal < 0)
            balance = 0;
        else
            balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void showBalance() {
        System.out.println("Account: " + accountNumber +
                           " Balance: " + balance);
    }
}

public class Simple_BankAccount {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(101, -10);
        acc.showBalance();

        acc.deposit(100);
        acc.withdraw(20);
        acc.showBalance();
    }
}