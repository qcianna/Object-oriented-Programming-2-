package pl.AniaJava;

public class CheckingAccount extends BasicAccount{

    CheckingAccount(String name, double money, String pin){
        super(name, money, pin);
        type = "checking account";
    }

    public void withdraw(double n){
        super.withdraw(n);
        if(money < 100){
            checkLow = true;
        }
        checkCounter++;
    }

    public void deposit(double n){
        super.deposit(n);
        checkCounter++;
    }
}
