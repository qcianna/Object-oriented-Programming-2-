package pl.AniaJava;

public class EmailService{

    public void generateEmailForNewEmployee(Employee e, String txt){
        e.setMail(e.getName() + "." + e.getSurname() + "@" + txt + ".com");
    }

    public void sendMail(Employee from, Employee to, String txt){
        to.setEmail(new Email(from, txt));
    }
}

