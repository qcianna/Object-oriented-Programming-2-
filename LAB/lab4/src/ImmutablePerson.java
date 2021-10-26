import java.util.Date;

public class ImmutablePerson implements Cloneable{

    private final String firstName;
    private final String surname;
    private final Date dateOfBirth;

    ImmutablePerson(String firstName, String surname, Date dateOfBirth){
        this.firstName = firstName;
        this.surname = surname;
        this.dateOfBirth = (Date)dateOfBirth.clone();
    }

    public ImmutablePerson clone() throws CloneNotSupportedException{
        return (ImmutablePerson)super.clone();
    }

    public String getInformation(){
        return "Imie: " + firstName + " nazwisko: " + surname + " data urodzenia: " + dateOfBirth;
    }

    public Date getDateOfBirth(){
        return (Date)dateOfBirth.clone();
    }

    public String getFirstName(){
        return firstName;
    }
}