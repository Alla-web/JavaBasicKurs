package lesson_43.homeWork_43.Task3;

import lesson_43.Cat;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonApp {
    /*
    Дан список Person с полями name, age, city.
    Используйте Stream API для фильтрации людей, которые старше определенного возраста
     и проживают в определенном городе, а затем соберите их в список.
     Например, старше 25 лет и проживающих в городе "Berlin"
     */
    public static void main(String[] args) {

        System.out.println(filteredPersons(getPersonsList(), 25, "Berlin"));
    }

    private static List<Person> filteredPersons(List<Person> people, int minAge, String city) {

        Stream<Person> personStream = people.stream()
                .filter(person -> person.getAge() > minAge)
                .filter(person -> Objects.equals(city, person.getCity()))
                        .sorted(Comparator.comparing(Person::getAge));

        List<Person> filteredPeople = personStream.collect(Collectors.toList());
        return filteredPeople;
    }

    private static List<Person> getPersonsList() {
        return List.of(
                new Person("Max", 44, "Charkow"),
                new Person("Max", 40, "Berlin"),
                new Person("Wlad", 25, "Kiew"),
                new Person("Nataly", 39, "Charkow"),
                new Person("Rita", 24, "Berlin"),
                new Person("Mary", 27, "Berlin")
        );
    }

}
