package pl.AniaJava;

public class EmailService {

    public void generateEmailForStudent(Student student, String faculty){
        student.setEmail(student.getName() + "." + student.getSurname() + "@" + faculty + ".pl");
    }
}
