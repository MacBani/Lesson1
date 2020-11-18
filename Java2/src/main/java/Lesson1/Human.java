package Lesson1;

import interfaces.Jumpable;
import interfaces.Runnable;

public class Human extends Person{

    public Human(int runLimit, int jumpLimit, boolean isPossible) {
        super(runLimit, jumpLimit, isPossible);
        type = "Human";
    }
}
