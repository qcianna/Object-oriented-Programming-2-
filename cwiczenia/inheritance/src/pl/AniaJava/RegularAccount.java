package pl.AniaJava;

public class RegularAccount extends BasicAccount{

    RegularAccount(String name, double money, String pin){
        super(name, money, pin);
        type = "regular account";
    }

    public void withdraw(double n){
        super.withdraw(n);
        if(money < 500){
            checkLow = true;
        }
    }
}
