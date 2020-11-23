package HomeWork2;

public class Lesson2 {
    static int sum = 0;
    static int i = 0;
    static int j = 0;

    public static boolean array(String[][] a) throws IndexOutOfBoundsException, MyArrayDataException {
        int ArrayInt[][] = new int[4][4];
        //int sum = 0;
        int counter = 0;
        if (a.length != 4 || a[0].length != 4) {
            throw new IndexOutOfBoundsException();
        }

        for (Lesson2.i = 0; i < 4; i++) {
            for (Lesson2.j = 0; j < 4; j++) {
                try {
                    counter = Integer.parseInt(a[i][j]);
                    Lesson2.sum += counter;

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(Lesson2.sum);
        return true;
    }


    public static void main(String[] args) /*throws MyArrayDataException*/ {
      //String B = "a";
        try{
            String[][] a = new String[4][4];
            //for (int i = 0; i < 4; i++) {
               // for (int j = 0; j < 4 ; j++) {
                   // a[i][j] = "100";
                    //a[3][1] = B;
               // }
           // }
            array(a);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Превышен допустимый размер массива");
        } catch (MyArrayDataException ee){
            System.out.println("В ячейке [" + Lesson2.i + "][" + Lesson2.j + "] лежат неверные данные" );
        } finally {
            System.out.println("Результат суммирования = " + Lesson2.sum);
        }

    }
}

