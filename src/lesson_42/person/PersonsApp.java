package lesson_42.person;

import java.util.*;

public class PersonsApp {
    public static void main(String[] args) {

        Person person = new Person("Max", 25, "Java developer");
        Person person1 = new Person("John", 45, "SEO");
        Person person2 = new Person("Hanna", 18, "tester");
        Person person3 = new Person("Julia", 23, "HR");
        Person person4 = new Person("Sebastian", 50, "Cleaner");

        Map<Integer, Person> mapPepsons = new HashMap<>();

        mapPepsons.put(person.getId(), person);
        mapPepsons.put(person1.getId(), person1);
        mapPepsons.put(person2.getId(), person2);
        mapPepsons.put(person3.getId(), person3);
        mapPepsons.put(person4.getId(), person4);

        System.out.println("mapPepsons -> " + mapPepsons);

        // Из какой-то части приложения (например из слоя view) приходит id person.
        // и мне нужно его найти в моем "хранилище"
        int id = 3;
        //мы быстро нашли нужно персона сразу по его id,
        // а не лопатили всех пёрсонов, в поиске с нужным id
        Person personFromMap = mapPepsons.get(id);
        System.out.println("personFromMap -> " + personFromMap);

        //ищем Person с несуществующим в мапе id
        System.out.println("Person с несуществующим в мапе id -> " + mapPepsons.get(1000));


        //нужно выдать список пёрсонов, возрастом больше 18 лет
        //метод принимающий int age и выдающий список персонов
        List<Person> personsByAge = new ArrayList<>();

        Collection<Person> peole = mapPepsons.values();
        for (Person p : peole) {
            if (p.getAge() > 18) {
                personsByAge.add(p);
            }
        }
        // возвращаю заполненную коллекцию
        System.out.println("personsByAge: " + personsByAge);
    }
}
