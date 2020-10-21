package lesson3;


import java.util.Scanner;

public class hw31 {
    public static void main(String[] args) {
        Game();
    }

    public static void Game(){
        System.out.println("Угадайте число от 0 до 9");
        int number = (int) (Math.random()*9);
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 3 ; i++) {
            int answer = console.nextInt();
            if (answer > number) {
                System.out.println("Загаданное число меньше");
            } else if(answer < number){
                System.out.println("Загаданное число больше");
            } else if (answer == number){
                break;
            }
        }

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int repeat = console.nextInt();
        if(repeat == 1){
                Game();
            }
    }
}
