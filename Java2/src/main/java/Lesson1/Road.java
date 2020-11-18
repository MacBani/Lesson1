package Lesson1;
import interfaces.Runnable;

public class Road implements Barrier {

    private int distance;

    public Road(int distance){
        this.distance = distance;
    }

    @Override
    public void take(Person person) {
        person.run(distance);
    }
}
