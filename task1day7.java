
abstract class Account {

    double balance = 0; 

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}


class MyAccount extends Account {


    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + (int)amount);
    }


    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + (int)amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

  
    void showBalance() {
        System.out.println("Balance: " + (int)balance);
    }
}


class task1day7{
    public static void main(String[] args) {

   
        MyAccount acc = new MyAccount();

        acc.deposit(1000);
        acc.withdraw(400);

        acc.showBalance();
    }
}