package HomeWorkApp6;

public class Main {

    public static void main(String[] args) {

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//   Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
        Dog dogBobik = new Dog(600, 20);
        Cat catBarsik = new Cat(300, 100);

        System.out.println("Создано животных - " + Animal.getCountAnimal());
        System.out.println("Создано собак - " + Dog.getCountDog());
        dogBobik.run(500);
        dogBobik.swim(10);
        System.out.println("Создано кошек - " + Cat.getCountCat());
        catBarsik.run(200);
        catBarsik.swim(20);
    }
}
