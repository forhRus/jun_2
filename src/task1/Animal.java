package task1;

public abstract class Animal {
    protected String name;
    protected int age;

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
