package pl.AniaJava;

import java.util.Vector;

public class EmployeeManagementService{

    private Vector<Employee> employees = new Vector<>();

    public void addNewEmployee(Employee e){
        employees.add(e);
        System.out.println("Employee added " + e);
    }

    public void printAllEmployees(){
        for(Employee e: employees){
            System.out.println("Employee: " + e.getName() + " , " + e.getSurname());
        }
    }

    public void changeEmail(Employee e, String newMail){
        if(!employees.contains(e)){
            System.out.println("Nie ma takiego pracownika");
        }
        e.setMail(newMail);
    }

    public void fireEmployee(Employee e){
        employees.remove(e);
    }

    public void sendMailToAllEmployees(String txt){
        for(Employee e: employees){
            e.setEmail(new Email(e, txt));
        }
    }
}
