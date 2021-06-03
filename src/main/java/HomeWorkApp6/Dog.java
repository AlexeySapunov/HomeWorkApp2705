package HomeWorkApp6;

public class Dog extends Animal {

    private static int countDog;

    public Dog(int run, int swim) {
        super(run, swim);
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void run(int r) {
        if (r <= 500) {
            System.out.println("Бобик пробежал " + r + " m");
        }
    }

    @Override
    public void swim(int s) {
        if (s <= 10) {
            System.out.println("Бобик проплыл " + s + " m");
        }
    }
}
