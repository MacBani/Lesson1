package Lesson2;

public class HW22 {
    public static void main(String[] args) {
        int[]a = new int[12];
        a[0]  = 1 ;
        a[1]  = 5 ;
        a[2]  = 3 ;
        a[3]  = 2 ;
        a[4]  = 11;
        a[5]  = 4 ;
        a[6]  = 5 ;
        a[7]  = 2 ;
        a[8]  = 4 ;
        a[9]  = 8 ;
        a[10] = 9 ;
        a[11] = 1 ;

        for (int i = 0; i < 12; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        for(int element : a){
            System.out.print(element + " ");

        }
    }
}
