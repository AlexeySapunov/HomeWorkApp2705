package HomeWorkApp6;

public class Main {

    public static void main(String[] args) {

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
