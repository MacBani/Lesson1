package Lesson6;

public class Animals {

    protected String name;
    double limitRun;
    double limitJump;
    double limitSwim;

    public Animals(double limitRun, double limitJump, double limitSwim){
        this.limitJump = limitJump;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;

    }

    public void run(double run){
        if(run > limitRun){
            System.out.println("run: false");
        } else {
            System.out.println("run: true");
        }
    }

    public void jump(double jump){
        if(jump > limitJump){
            System.out.println("jump: false");
        } else {
            System.out.println("jump: true");
        }
    }

    public void swim(double swim){
        if(swim > limitSwim){
            System.out.println("swim: false");
        } else {
            System.out.println("swim: true");
        }
    }
}
