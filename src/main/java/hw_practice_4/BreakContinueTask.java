package hw_practice_4;

import java.util.Scanner;

public class BreakContinueTask {

    public static void sumPositive(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.println("Введи число: ");
            int num = scanner.nextInt();
            if (num > 0){
                sum = num + sum;
                System.out.println(sum);
            }
            else {
                break;
            }
        }

    }

    public static void skipNum(){
        for (int i = 1; i <= 20; i++){
            if(i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printPositiveNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 чисел");
        int i = 0;
        while (i <= 5){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if (num < 0){
                continue;
            }
            System.out.println(num);
            i++;
        }
    }

    public static void printWords(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите слово: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
        }
    }


    public static void main(String[] args) {
        // sumPositive();

        // skipNum();

        // printPositiveNum();

        printWords();


    }
}
