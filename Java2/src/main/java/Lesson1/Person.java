package Lesson1;

import interfaces.Jumpable;
import interfaces.Runnable;

public class Person implements Runnable, Jumpable {
    private static int counter = 0;
    private int runLimit;
    private int jumpLimit;
    private boolean isPossible;
    private int humanId;
    protected String type;

    public Person(int runLimit, int jumpLimit, boolean isPossible){
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.isPossible = isPossible;
        counter++;
        humanId = counter;
    }

    public void jump(int height) {
        if(height > jumpLimit){
            isPossible = false;
            System.out.println(type + " " + humanId + " не смог");
        }
        if(height <= jumpLimit){
            isPossible = true;
            System.out.println(type + " " + humanId + " jump to " + height + "m.");
        }

    }

    public void run(int distance) {
        if(distance > runLimit){
            isPossible = false;
            System.out.println(type + " " + humanId + " не смог");
        }
        if(distance <= runLimit){
            isPossible = true;
            System.out.println(type + " " + humanId + " run to " + distance + "m.");
        }
    }


}
