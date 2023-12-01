package task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

public class Program {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {

        int length = 6;
        Animal[] animal = createArray(length);

        for (Animal an: animal) {
            printInfo(an);
        }
        System.out.println("____________");
        
        for (Animal an: animal) {
            makeSound(an);
        }
    }

    /**
     * Вызываем метод(если есть) через рефликсию
     * @param obj
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    private static void makeSound(Animal obj) throws InvocationTargetException, IllegalAccessException {
        Class clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method m: methods) {
            m.setAccessible(true);
            if(m.getName().equals("makeSound")){
                printInfo(obj);
                m.invoke(obj);
            }
        }
    }

    /**
     * Генерируем массив случайных животных
     * @param length количество животных
     * @return
     */
    private static Animal[] createArray(int length){
        Random random = new Random();
        String[] namesDog = {"Бим", "Дог", "Белка", "Рекс",
                "Кексик", "Песель", "Краз"};
        String[] namesCat = {"Пушок", "Мурзик", "Мурка", "Барсик",
                "Леопольд", "Том", "Киса"};
        String[] colors = {"Белый", "Черный", "Рыжий", "Черепаха",
                "Полосатый", "Серый", "Белые тапочки-лол"};
        Animal[] ar = new Animal[length];
        for (int i = 0; i < length; i++) {
            if((int)(Math.random() * 10) >= 5)
                ar[i] = new Cat(namesCat[random.nextInt(namesCat.length)], random.nextInt(1, 5), colors[random.nextInt(colors.length)]);
            else
                ar[i] = new Dog(namesDog[random.nextInt(namesDog.length)], random.nextInt(1, 8), random.nextInt(4, 20));
        }
        return ar;
    }

    /**
     * Выводим информацию о животных, используя рефлексию
     * @param obj
     * @throws IllegalAccessException
     */
    private static void printInfo(Animal obj) throws IllegalAccessException {
        Class clazz = obj.getClass();
        Class supClazz = clazz.getSuperclass();

        Field[] supFields = supClazz.getDeclaredFields();
        Field[] fields = clazz.getDeclaredFields();

        System.out.printf("class:%s {",clazz.getSimpleName());
        for (Field f: supFields) {
            f.setAccessible(true);
            System.out.printf("%s:%s ", f.getName(), f.get(obj));
        }
        for (Field f: fields) {
            f.setAccessible(true);
            System.out.printf("%s:%s ", f.getName(), f.get(obj));
        }
        System.out.printf("}\n");
    }
}

