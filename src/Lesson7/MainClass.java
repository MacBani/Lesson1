package Lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 50, false), new Cat("Muscat", 50, false), new Cat("Busik", 5, false)};
        Plate plate = new Plate(100);
        plate.info();
        for (Cat a : cats){
            a.eat(plate);
            plate.info();
        }
    }
}