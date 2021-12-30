import java.util.*;
import java.util.stream.Collectors;

public class PersonService {

    public static List<Person> listByGender(List<Person> list, Gender gender) {
        return list.stream()
                .filter(p -> (p.getGender().equals(gender)))
                .collect(Collectors.toList());
    }

    public static List<Person> listAdults(List<Person> list) {

        return list.stream()
                .filter(p -> (p.getAge() >= 18))
                .collect(Collectors.toList());
    }

    public static List<Person> listByName(List<Person> list, String imie) {

        return list.stream()
                .filter(p -> (p.getName().equals(imie)))
                .collect(Collectors.toList());
    }


    public static List<Person> listBySurname(List<Person> list, String nazwisko) {

        return list.stream()
                .filter(p -> (p.getSurname().equals(nazwisko)))
                .collect(Collectors.toList());
    }

    public static int sumAge(List<Person> list) {

        return list.stream()
                .mapToInt(Person::getAge)
                .sum();
    }

    public static Map<String, Integer> getMap(List<Person> list) {

        return list.stream()
                .collect(Collectors.toMap(p -> p.getName() + " " + p.getSurname(), Person::getAge));
    }

    public static List<Person> multiplyAgeList(List<Person> list) {

        return list.stream()
                .map(p -> new Person(p.getName(), p.getSurname(), p.getGender(), 2 * p.getAge()))
                .collect(Collectors.toList());
    }
}
