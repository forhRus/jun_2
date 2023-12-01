package task1;

import java.util.Random;

public class Dog extends Animal {
    private static Random random = new Random();
    private int weight;
    private static String[] names = {"Бим", "Дог", "Белка", "Рекс",
            "Кексик", "Песель", "Краз"};
    public Dog() {
        super(names[random.nextInt(names.length)], random.nextInt(1, 7));
        this.weight = random.nextInt(20);
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
