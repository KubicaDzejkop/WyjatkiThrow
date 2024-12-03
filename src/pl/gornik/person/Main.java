package pl.gornik.person;

import pl.gornik.person.exception.IllegalNumberException;
import pl.gornik.person.exception.IllegalValueException;
import pl.gornik.person.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Podaj imię");
                String name = scanner.nextLine();
                System.out.println("Podaj nazwisko");
                String surname = scanner.nextLine();
                System.out.println("Podaj wiek");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj pesel");
                String pesel = scanner.nextLine();

                Person person = new Person(name, surname, age, pesel);
                persons.add(person);

            } catch (IllegalValueException e) {
                System.out.println("Błąd podania wartości " + e.getMessage());
                e.printStackTrace();
            } catch (IllegalNumberException e) {
                System.out.println("Błąd podania wartości liczbowej " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Nieoczekiwany błąd");
                e.printStackTrace();
            }
            for (Person person : persons){
                System.out.print(person.getName() + " " + person.getSurname() + ", \n");
            }
        }
    }
}