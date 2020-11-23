package HomeWork2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j){
        super("Ошибка в (" + i + ", " + j + ")" );
    }
}
