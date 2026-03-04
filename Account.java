package Bank_Abstraction_Java;

abstract class Account {
    double balance;

    Account() {
    }

    Account(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amt);
    abstract void withdraw(double amt);

    void showBalance() {
        System.out.println("Total balance: " + balance);
    }
}

