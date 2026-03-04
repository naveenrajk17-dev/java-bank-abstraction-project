package Bank_Abstraction_Java;

// Canara class extends from Account class
class Canara extends Account {
    String acc_holder_name;

    Canara() {}

    Canara(String acc_holder_name,double balance)
    {
        super(balance);
        this.acc_holder_name=acc_holder_name;
    }

    public void deposit(double amt)
    {
        balance +=amt;
        System.out.println("In Canara Amount Deposited Successfully");
    }

    public void withdraw(double amt)
    {
        if(balance>=amt)
        {
            balance -=amt;
            System.out.println("Withdrawn in Canara Successfull");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
