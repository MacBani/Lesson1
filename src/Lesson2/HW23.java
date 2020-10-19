package Lesson2;

public class HW23 {
    public static void printMas(int m[][]){
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j < m[i].length ; j++) {
                System.out.printf("%3d", m[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int start = 4;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                if (i == j){
                    a[i][j] = 1;
                }
                if(i + j == 4){
                    a[i][j] = 1;
                }

            }
        }



        printMas(a);
    }
}
