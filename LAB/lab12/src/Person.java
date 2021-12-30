public class Person {

    private String name;
    private String surname;
    private Gender gender;
    private int age;

    Person(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    public String toString() {
        return name + " " + surname + " " + gender + " " + age;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int wiek) {
        this.age = wiek;
    }
}

enum Gender {KOBIETA, MEZCZYZNA};
