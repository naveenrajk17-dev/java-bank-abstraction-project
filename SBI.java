package Bank_Abstraction_Java;

//SBI class extends from Account class
class SBI extends Account{
    String acc_holder_name;

    SBI() {}

    SBI(String acc_holder_name,double balance)
    {
        super(balance);
        this.acc_holder_name=acc_holder_name;
    }

    public void deposit(double amt)
    {
        balance +=amt;
        System.out.println("In SBI Amount Deposited Successfully");
    }

    public void withdraw(double amt)
    {
        if(balance>=amt)
        {
            balance -=amt;
            System.out.println("Withdrawn in SBI Successfull");
            return;
        }
        System.out.println("Insufficient Balance");
    }
}
