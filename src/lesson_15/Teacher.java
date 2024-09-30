package lesson_15;

public class Teacher {

    // 1. Создаём ПОЛЯ КЛАССА
    String name;
    String science;
    int age;
    int experience;

    // 2. Пишем КОНСТРУКТОРы КЛАССА
    public Teacher(String name, String science, int age, int experience) {
        this.name = name;
        this.science = science;
        this.age = age;
        this.experience = experience;
    }

    // 3. Пишем методы, которые опишут поведение объектов
    public void teach(){
        System.out.println("I am teaching");
    }

    public void checkHomeWork(){
        System.out.println("I am checking the homework of my student");
    }

    public void whoIAm(){
        System.out.printf("I am teacher, my name is %s, i teach the %s, I am %d years old and i have %d years of experions\n", name, science, age, experience);
    }

} // class area
