package lesson_24.HomeWork_24.Task1;

import java.security.SecureRandom;

public class Triathlete implements Swimmer, Runner{

    String name;
    int age;

    //constructor
    public Triathlete(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // methods
    @Override
    public void swim() {
        System.out.println("Triathlete " + name + ", age " + age + " swims");
    }

    @Override
    public void run() {
        System.out.println("Triathlete " + name + ", age " + age + " runs");
    }

    public String toString(){
      return String.format("Triathlete %s, age %d", name, age);
    }
}
