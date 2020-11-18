package Lesson1;

import interfaces.Jumpable;
import interfaces.Runnable;

public class Wall implements Barrier {


    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public void take(Person person) {
        person.jump(height);
    }
}
