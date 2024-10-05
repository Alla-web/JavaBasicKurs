package lesson_17.ObjectArray;

import java.lang.ref.SoftReference;

public class Employee {
    private String name;
    private int age;
    private double salary;

    // Конструкторы
    public Employee() {

    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Сэттеры
    public void setName(String name){
        this.name = name;
    }



    public void setAge(int age) {
        if (age < 18 || age > 35) {
            System.out.println("Wrong age");
            return;
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 0 || salary > 5000) {
            System.out.println("Wrong salary");
            return;
        }
        this.salary = salary;
    }

    // Методы

    // Печать инфо о сотруднике в троку
    public String toString() {
        return String.format("Employee %s, age: %d, salary: %f", name, age, salary);
    }

    // печать инфо о сотрудниках (массива)
    public void printEmployeesArray(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees != null && employees[i] != null) {
                System.out.print(employees[i].toString());
                System.out.println();
            } else {
                System.out.println("null");
                return;
            }

        }
    }


}// class area
