public class Lesson1 {

    public static void main(String[] args) {
        byte  a = 10;
        short b = 11;
        int   c = 12;
        long  d = 13;
        float f = 0.6f;
        double z = 0.14;
        boolean bool = true;
        char n = 'c';
        
    }

    public static int cl(int a, int b, int c, int d){
        int q = a * (b + (c / d));
        return q;
    }

    public static boolean comparison (int a, int b){
        int c = a + b;
        boolean q = true;
        if (c >= 10 && c <= 20){
            q = true;
        }
        else q = false;
        return q;
    }

    public static void sign(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean comparision1(int a){
        boolean b;
        if(a < 0){
            b = true;
        } else b = false;
        return b;
    }

    public static void greeting(String name){
        System.out.println("Привет, " + name);
    }

}
