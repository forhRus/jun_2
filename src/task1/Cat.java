package task1;

import java.util.Random;

public class Cat extends Animal {
    private static Random random = new Random();
    private String color;
    private static String[] names = {"Пушок", "Мурзик", "Мурка", "Барсик",
            "Леопольд", "Том", "Киса"};
    private static String[] colors = {"Белый", "Черный", "Рыжий", "Черепаха",
            "Полосатый", "Серый", "Белые тапочки-лол"};

    public Cat() {
        super(names[random.nextInt(names.length)], random.nextInt(1, 5));
        this.color = colors[random.nextInt(colors.length)];
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
