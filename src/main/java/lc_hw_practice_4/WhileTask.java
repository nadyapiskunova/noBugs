package lc_hw_practice_4;

import java.util.Scanner;

public class WhileTask {

    public static void printFactorialNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= num){
            result = i * result;
            i++;
        }
        System.out.println(result);

    }

    public static void printEvenNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;

        while (i <= num){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printInvertNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        while (1 <= num){
            System.out.println(num);
            num --;
        }
    }

    public static void main(String[] args) {
        //printFactorialNum();
        // printEvenNum();
        printInvertNum();
    }
}
