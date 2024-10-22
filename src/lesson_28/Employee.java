package lesson_28;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirsday;

    //constructor
    public Employee(String firstName, String lastName, String dateOfBirsday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirsday = dateOfBirsday;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public String getDateOfBirsday() {
        return dateOfBirsday;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirsday(String dateOfBirsday) {
        this.dateOfBirsday = dateOfBirsday;
    }

    //methods
    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirsday='" + dateOfBirsday + '\'' +
                '}';
    }

    // метод equals() от IntelLig Idea такой же

    @Override
    public int hashCode() {
        int result = Objects.hashCode(firstName);
        result = 31 * result + Objects.hashCode(lastName);
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        // Если ссылка на объекты (1-й - объект, от имени которого вызывается метод equals() и
        // 2-й - объект, аргумент, который передан в метод для сравнения с 1-м) одинаковая,
        // объекты точно равны
        if (this == obj) return true;

        // Если obj не является экземпляром класса Employee, объекты не равны
        if (!(obj instanceof Employee)) return false;

        // Приведение объекта к типу Employee
        Employee employee = (Employee) obj;

        // при таком сравнении возможно появление NullPointerException
        //firstName.equals(employee.firstName);
        // При сравнении любого сравнения с null должно возвращаться false

        // Безопасно сравнивать объекты, учитывая возможность null значений
        // можно через класс Objects с переопределённым методом equals()
            // в нашем случае
        // Безопасное сравнение полей firstName, lastName и dateOfBirsday
        // Используем Objects.equals() для защиты от NullPointerException
        return Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(dateOfBirsday, employee.dateOfBirsday);
    }

}
