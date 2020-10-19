package Lesson2;

public class HW2 {
    public static void main(String[] args) {
        int[]a = new int[10];

        for (int i = 0; i < a.length ; i++) {
            a[i] = (int) (Math.random() * 2);

            if(a[i] == 0){
                a[i] = 1;
            } else a[i] = 0;


        }
        for(int element : a){
            System.out.println(element + " ");

        }


    }

}
