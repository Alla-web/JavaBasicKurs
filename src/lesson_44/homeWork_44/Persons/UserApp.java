package lesson_44.homeWork_44.Persons;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserApp {
    /*
    Напишите метод findUserById(int id), который возвращает Optional<User>.
    Метод принимает List<User> и int id.

    Если пользователь с заданным id существует в списке, вернуть Optional
    с пользователем, иначе вернуть Optional.empty().

    Подсказка:
    Используйте Optional.of(user) или Optional.empty().
     */
    public static void main(String[] args) {
        List<User> users = List.of(
                new User(1, "John"),
                new User(1, "Max"),
                new User(3, "Rita"),
                new User(4, "Ora"));

        System.out.println(findUserById(users, 1));
        System.out.println("----------------------------------");
        System.out.println(findUserById2(users, 1));
    }

    public static Optional<User> findUserById(List<User> users, int id) {

        for (User user : users) {
            if (user.getId() == id)
                return Optional.of(user);
        }
        return Optional.empty();
    }

    public static Optional<User> findUserById2(List<User> users, int id) {

        users.stream()
                .filter(user -> user.getId() == id)
                .peek(System.out::println)//производит
                .collect(Collectors.toList());
        //collect() - собрал всех юзеров с ID 1, которые есть в коллекции
        System.out.println(users);

        System.out.println("------------------------------------");

        Optional<User> user = users.stream()
                .filter(user1 -> user1.getId() == id)
                .peek(System.out::println)
                .findFirst();
        //findFirst() - нашёл первого юзера с ID 1 и выдал его, не смотря на то,
        // что есть ещё один юзер с таким же именем
        return user;
    }
}
