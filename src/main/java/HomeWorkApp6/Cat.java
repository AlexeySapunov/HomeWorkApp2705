package HomeWorkApp6;

public class Cat extends Animal {

    private static int countCat;

    public Cat(int run, int swim) {
        super(run, swim);
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void run(int r) {
        if (r <= 200) {
            System.out.println("Барсик пробежал " + r + " m");
        }
    }

    @Override
    public void swim(int s) {
        if (s != 0) {
        System.out.println("Кошки не умеют плавать");
        }
    }

}
