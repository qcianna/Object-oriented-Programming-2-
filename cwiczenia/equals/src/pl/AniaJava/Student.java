package pl.AniaJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private final int indexNum;
    private final String name;
    private final String surname;
    private String email;
    private ArrayList<Double> grades = new ArrayList<>();

    Student(int indexNum, String name, String surname){
        this.indexNum = indexNum;
        this.name = name;
        this.surname = surname;
    }

    public String toString(){
        String s = new String(name + " " + surname + " (" + indexNum + ")");
        if(!grades.isEmpty()){
            s += " - " + grades;
        }
        return s;
    }

    public String getEmail(){
        return email;
    }

    public  void setEmail(String email){
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void addGrade(Double grade){
        grades.add(grade);
    }

    public double getAverage(){
        double sum = 0;
        for(double g: grades){
            sum += g;
        }
        return sum/grades.size();
    }

    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if (this == obj)
            return true;
        if (!getClass().equals(obj.getClass()))
            return false;

        Student student = (Student) obj;

        if (!name.equals(student.name)) return false;
        if (!surname.equals(student.surname)) return false;
        if (indexNum != student.indexNum) return false;
        if (!email.equals(student.email)) return false;
        return grades.equals(student.grades);
    }
}
