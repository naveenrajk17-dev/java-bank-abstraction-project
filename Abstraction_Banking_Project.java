package Bank_Abstraction_Java;

//Abstraction project.

public class Abstraction_Banking_Project {
    public static void main(String[] args) {
        Account acc1 = new SBI("Naveen",10000);
        Account acc2 = new Canara("Raj",1000);

        // O/P based on " Object Creation " here. because in abstract is similar to overriding.

        acc1.deposit(1000);
        acc2.deposit(500);

        acc1.withdraw(100);
        acc2.withdraw(200);

        acc1.showBalance();
        acc2.showBalance();
    }
}
