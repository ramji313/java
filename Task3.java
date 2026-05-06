
abstract class Account {

    double balance = 0; 

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}


class MyAccount extends Account {

   
    void deposit(double amount) {
        balance += amount; 
        System.out.println("Deposited: " + amount);
    }

  
    void withdraw(double amount) {
        balance -= amount; 
        System.out.println("Withdrawn: " + amount);
    }

   
    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Step 3: Main class
public class Task3 {
    public static void main(String[] args) {

        MyAccount acc = new MyAccount();

        // Perform operations
        acc.deposit(1000);
        acc.withdraw(400);

        // Final balance
        acc.showBalance();
    }
}