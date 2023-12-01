package task1;

import java.util.Random;

public class Dog extends Animal {
    private int weight;
    public Dog(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", color='" + weight + '\'' +
                '}';
    }

    public void makeSound() {
        System.out.println("Baw-wau-wau");
    }
}
