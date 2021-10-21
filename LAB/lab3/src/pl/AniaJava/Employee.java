package pl.AniaJava;

public class Employee{

    private int l;
    private String name;
    private String surname;
    private String mail;
    private Email email;

    Employee(int l, String name, String surname){
        this.l = l;
        this.name = name;
        this.surname = surname;
    }

    public String getEmail(){
        return mail;
    }

    public Email getLastEmailMessage(){
        return email;
    }

    public String toString(){
        return name + " " + surname;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setEmail(Email email){
        this.email = email;
    }
}


