package pl.AniaJava;

public class Email{

    private String message;
    private Employee from;

    Email(Employee from, String message){
        this.from = from;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public Employee getFrom(){
        return from;
    }
}

