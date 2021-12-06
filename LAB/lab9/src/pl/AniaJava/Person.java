package pl.AniaJava;

public class Person {

    private String name;
    private String surname;
    private int age;

    Person(){}

    Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString(){
        return "Person{name='" + name + "', surname='" + surname + "', age=" + age + "}";
    }

    public int getAge() {
        return age;
    }

    public boolean equals(Object o){
        if(this == o) return true;

        Person p = (Person) o;
        if(!name.equals(p.name)) return false;
        if(!surname.equals(p.surname)) return false;
        return age == p.age;
    }

    public int hashCode(){
        return name.hashCode() + surname.hashCode() + String.valueOf(age).hashCode();
    }
}
