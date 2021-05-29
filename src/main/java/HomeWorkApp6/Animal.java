package HomeWorkApp6;

public abstract class  Animal {

    protected int run;
    protected int swim;

    private static int countAnimal;

    public Animal(int run, int swim) {
        countAnimal++;
        this.swim = swim;
        this.run = run;
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

    public abstract void run(int r);

    public abstract void swim(int s);
}

