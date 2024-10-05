package lesson_17.ObjectArray;

public class EmployeeApp {
    public static void main(String[] args) {
        // Объекты
        Employee tom = new Employee("Tom", 20, 2500.45);
        System.out.println(tom.toString());

        Employee carlos = new Employee("Carlos", 30, 3000.55);
        System.out.println(carlos.toString());

        Employee mike = new Employee("Mike", 35, 2000.35);
        System.out.println(mike.toString());

        System.out.println("--------------------employees array---------------------------------");

        Employee[] employees = new Employee[5];
        employees[0] = tom;
        employees[1] = carlos;
        employees[2] = mike;
        employees[3]= new Employee("Emily", 32, 2999.45);

        Employee myEmployees = new Employee();
        myEmployees.printEmployeesArray(employees);

        System.out.println("---------------------------Переназначение параметров объектов-------------------------------------------");

        employees[0].setName("Max");
        employees[0].setAge(40);
        employees[0].setSalary(6000.0);
        Employee tomas = new Employee("Tomas", 22, 4555.55);
        employees[1] = tomas;
        employees[4] = new Employee("Garry", 19, 1500.99);
        myEmployees.printEmployeesArray(employees);







    } // main area

} // class area
