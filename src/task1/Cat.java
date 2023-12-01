package task1;

import java.util.Random;

public class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.name + '\'' +
                ", age=" + super.age +
                ", color='" + color + '\'' +
                '}';
    }

    public void slepp() {
        System.out.println("I'm sleepingб because I'm a cat");
    }
}
