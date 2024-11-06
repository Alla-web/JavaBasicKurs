package lesson_38.homework_38.Task1;

public class Sportsmans implements Comparable<Sportsmans>{
    String name;
    int age;
    double score;

    public Sportsmans(String name, int age, double score) {
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

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "\nSportsmans{" +
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
    public int compareTo(Sportsmans sp1) {
        return this.name.compareToIgnoreCase(sp1.name);
    }


}
