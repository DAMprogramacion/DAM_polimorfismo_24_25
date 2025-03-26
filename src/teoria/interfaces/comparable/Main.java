package teoria.interfaces.comparable;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(LocalDate.of(2000, 6, 29), "12345678a",
                "garcía fernández", "gabriel");
        Person person2 = new Person(LocalDate.of(2000, 6, 29), "12345678a",
                "garcía fernández", "gabriel");
        Person person3 = new Person(LocalDate.of(2006, 6, 1), "12345678b",
                "munuera fernández", "esperanza");
        Person person4 = new Person(LocalDate.of(1999, 7, 2), "12345678c",
                "lópez fernández", "marisa");
        List<Person> people1 = new ArrayList<>();
        people1.add(person1); people1.add(person2);
        people1.add(person3); people1.add(person4);
        System.out.printf("Number of people in the list: %d%n", people1.size());
        Set<Person> people2 = new HashSet<>();
        people2.add(person1); people2.add(person2);
        people2.add(person3); people2.add(person4);
        System.out.printf("Number of people in the set: %d%n", people2.size());
        System.out.println("===============");
        people1.forEach(System.out::println);
        System.out.println("===============");
        people2.forEach(System.out::println);
        System.out.println("===============");
        Collections.sort(people1);
        people1.forEach(System.out::println);
        System.out.println("=======por apellidos========");
        people2.stream().
                sorted(Comparator.comparing(Person::getSurname)).
                forEach(System.out::println);
        System.out.println("=======por id========");
        people2.stream().
                sorted(Comparator.comparing(Person::getId)).
                forEach(System.out::println);
    }
}
