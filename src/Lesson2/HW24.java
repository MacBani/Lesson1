package Lesson2;

public class HW24 {
    public static void printMas(int m[]){
        for(int n : m){
            System.out.print(n + "  ");
        }
    }
    public static void main(String[] args) {
        int[]a = new int[5];
        int max = -1;
        int min = 101;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
        printMas(a);
        for (int i = 0; i < a.length ; i++) {
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }

        }
        System.out.println();
        System.out.println(max + " " + min);
    }
}
