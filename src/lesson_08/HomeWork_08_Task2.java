package lesson_08;

public class HomeWork_08_Task2 {
    public static void main(String[] args) {
        /*
        Task 2
Используйте цикл while для решения задачи:
Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */
        String[] strings = {"Task1", "Task2","Task3","Task4","Task5","Task6","Task7","Task7","Task9","Task10"};
        int index = 0; // начинаеем

        while (index < strings.length) {
            System.out.println("Это строка № -> " + strings[index]);
            index++;
        }

        while (index < 11) {
            System.out.println("Task " +index);
            index++;
        }
        // TODO


    }
}
