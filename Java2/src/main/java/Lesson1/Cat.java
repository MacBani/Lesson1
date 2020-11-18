package Lesson1;

public class Cat extends Person {
    public Cat(int runLimit, int jumpLimit, boolean isPossible) {
        super(runLimit, jumpLimit, isPossible);
        type = "Cat";
    }
}
