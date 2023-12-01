package task1;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public void slepp(){
        System.out.println("I'm sleepingб because I'm a cat");
    }
}
