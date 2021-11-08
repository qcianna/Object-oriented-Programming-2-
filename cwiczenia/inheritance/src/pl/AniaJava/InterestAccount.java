package pl.AniaJava;

public class InterestAccount extends BasicAccount{

    InterestAccount(String name, double money, String pin){
        super(name, money, pin);
        type = "interest account";
    }
}
