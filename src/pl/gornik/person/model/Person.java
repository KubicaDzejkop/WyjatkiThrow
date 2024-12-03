package pl.gornik.person.model;

import pl.gornik.person.exception.IllegalNumberException;
import pl.gornik.person.exception.IllegalValueException;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String pesel;

    public Person(String name, String surname, int age, String pesel) {
        if (name == null){
            throw new IllegalValueException("Imię nie może być nullem");
        }
        if (name.isEmpty()){
            throw new IllegalValueException("Imie nie może być puste");
        }
        if (surname == null || surname.isEmpty()){
            throw new IllegalValueException("Nazwisko nie może być nullem lub nie może być puste");
        }
        if (age < 0 || age > 120){
            throw new IllegalNumberException("Wiek nie może być ujemny lub większy niż 120");
        }
        if (pesel == null || pesel.length() != 11){
            throw new IllegalValueException("Pesel nie może być nullem lub musi mieć 11 znaków");
        }

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
