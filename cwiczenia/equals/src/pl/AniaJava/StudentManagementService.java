package pl.AniaJava;

import java.util.ArrayList;

public class StudentManagementService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void printAllStudents() {
        System.out.println("*** Students ***");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void removeStudent(Student student) {
        if (!students.contains(student)) {
            System.out.println("This student does not exist in database");
            return;
        }
        students.remove(student);
    }

    public Student findStudentWithTheHighestAverage() {

        Student max = students.get(0);
        for (Student s : students) {
            if (s.getAverage() > max.getAverage()) {
                max = s;
            }
        }

        return max;
    }
}
