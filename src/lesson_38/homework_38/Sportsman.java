package lesson_38.homework_38;

public class Sportsman implements Comparable<Sportsman>{
    String name;
    int age;
    int score;

    public Sportsman(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nSportsman{" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", score: " + score +
                '}';
    }

    //----------------------------------------Comparable---------------------------------
    // метод интерфейса Comparable,
    // который мы обязаны реализовать после имплементации интерфейса Comparable

    //сортировка в естественном порядке по ИМЕНИ
    @Override
    public int compareTo(Sportsman sp1) {
        return this.name.compareToIgnoreCase(sp1.name);
    }


}
