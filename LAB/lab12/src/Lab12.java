/*
Stworzyc klase
Person: imie, nazwisko, plec(enum), wiek
Stworzyc Klase PersonService która będzie miała nastepujące funkcjonlaności :
- zwrócenie listy zawierajacej osoby podanej plci
- zwrocenie listy osob pelnoletnich >= 18 lat
- zwrocenie listy osob z danym nazwiskiem
- zwrocenie listy osob z danym imieniem
- zwrocenie sumy wieku wszystkich podanych w liscie
- zwrocenie mapy zawierajacej jako klucz imie + nazwisko(polaczone w jednego stringa), jako wartosc wiek
- zwrocenie listy osob z wiekiem pomnożonym przez 2
Przekazujemy do funkcji Listę oraz pozostałe parametry i na niej wykonujemy operacje
 */

import java.util.ArrayList;
import java.util.List;

public class Lab12 {

    public static void main(String[] args) {

        Person p1 = new Person("Adam", "Kowalski", Gender.MEZCZYZNA, 20);
        Person p2 = new Person("Adam", "Babacki", Gender.MEZCZYZNA, 24);
        Person p3 = new Person("Michal", "Dab", Gender.MEZCZYZNA, 40);
        Person p4 = new Person("Ania", "Kania", Gender.KOBIETA, 17);
        Person p5 = new Person("Mariola", "Bak", Gender.KOBIETA, 90);

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);

        list.forEach(System.out::println);

        System.out.println(PersonService.listByGender(list, Gender.KOBIETA));

        System.out.println(PersonService.listAdults(list));

        System.out.println(PersonService.listByName(list, "Adam"));

        System.out.println(PersonService.listBySurname(list, "Kania"));

        System.out.println(PersonService.sumAge(list));

        System.out.println(PersonService.getMap(list));

        System.out.println(PersonService.multiplyAgeList(list));
    }
}
