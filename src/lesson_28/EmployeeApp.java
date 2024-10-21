package lesson_28;

import list.MyArrayGenList;
import list.MyList;

public class EmployeeApp {
    public static void main(String[] args) {

        MyList<Employee> employees = new MyArrayGenList<>();

        Employee employee1 = new Employee("Peter", "Petrov", "21.10.2000");
        Employee employee2 = new Employee("Ivan", "Ivanov", "05.12.1998");
        Employee employee3 = new Employee("Ivan", "Ivanov", "15.01.2001");
        Employee employee4 = new Employee("Ivan", "Ivanov", "15.01.2001");
        // для Джава employee3 и employee4 разные люди
        System.out.println("----------------------------сравнение--------------------------------------------------");
        System.out.println("employee1 == employee2: " + (employee1 == employee2));
        System.out.println("employee2 == employee3: " + (employee2 == employee3));

        // для нас employee3 и employee4 - это один и тот же человек, а Джава сравнивает ссылки,
        // поэтому метод equals() ввыдаёт их разными, а после переопределения метода equals()
        System.out.println("employee3.equals(employee4): " + employee3.equals(employee4));

        System.out.println("employee2.equals(employee3): " + employee2.equals(employee3));


    }

}
