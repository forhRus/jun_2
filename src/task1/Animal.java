package task1;

public abstract class Animal {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
