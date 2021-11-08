package pl.AniaJava;

public abstract class BasicAccount {

    protected String type;
    protected boolean checkLow;
    private String name;
    protected double money;
    private String pin;
    protected int checkCounter;

    BasicAccount(String name, double money, String pin){
        this.name = name;
        this.money = money;
        this.pin = pin;
    }

    public String toString(){
        return "type: " + type + ", owner: " + name + ", balance: " + money;
    }

    public void withdraw(double n){
        if(n > money || n <= 0){
            System.out.println("You can't do that :c");
            return;
        }
        money -= n;
    }

    public void deposit(double n){
        if(n <= 0){
            System.out.println("You can't do that :c");
            return;
        }
        money += n;
    }

    public double getBalance(){
        return money;
    }

    public double getMonthlyInterest(){
        return 0.02*money;
    }

    public double getMonthlyCost(){
        return (0.1*money < 10) ? 0.1*money : 10;
    }

    public void monthlyUpdate(){
        money -= getMonthlyCost();
        if(checkLow){
            money -= 10;
        }
        checkLow = false;
        if(checkCounter != 0){
            money -= checkCounter*0.5;
            checkCounter = 0;
        }
    }

    public boolean equals(Object other){

        if(this == other) return true;
        BasicAccount account = (BasicAccount)other;
        if(money != account.money) return false;
        else if(!name.equals(account.name)) return false;
        else if(!type.equals(account.type)) return false;
        else if(!pin.equals(account.pin)) return false;
        return true;
    }
}
