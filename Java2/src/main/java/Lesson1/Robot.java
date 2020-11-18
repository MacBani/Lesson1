package Lesson1;

public class Robot extends Person {
    public Robot(int runLimit, int jumpLimit, boolean isPossible) {
        super(runLimit, jumpLimit, isPossible);
        type = "Robot";
    }
}
