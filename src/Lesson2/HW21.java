package Lesson2;

public class HW21 {
    public static void main(String[] args) {
        int[]a = new int[8];
        int b = 0;
        for (int i = 0; i < 8; i++) {
            a[i] = b;
            b += 3;
        }

        for(int element : a){
            System.out.print(element + " ");

        }
    }
}
