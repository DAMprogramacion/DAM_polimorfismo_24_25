package teoria.interfaces.comparable;

import java.time.LocalDate;
import java.util.Objects;

public final class Person implements Comparable<Person>{
    private String namePerson;
    private String surname;
    private final LocalDate birthDay;
    private final String id;

    public Person(LocalDate birthDay, String id, String surname, String namePerson) {
        this.birthDay = birthDay;
        this.id = id;
        this.surname = surname;
        this.namePerson = namePerson;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", surname, namePerson, id, birthDay);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public int compareTo(Person person) {
        //return this.surname.compareTo(person.surname);  //por apellidos
        //return birthDay.compareTo(person.birthDay); //mayor a menor
        return person.birthDay.compareTo(birthDay); //menor a mayor
    }
}



