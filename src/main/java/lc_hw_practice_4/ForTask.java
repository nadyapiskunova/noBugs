package lc_hw_practice_4;

import java.util.Scanner;

public class ForTask {

    public static void printNum3(){
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void printSum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printMultiplayTable(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println( num + " x " + i + " = " + num * i);
        }
    }

    public static void checkSimpleNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        boolean isSimple = true;
        for (int i = 2; i <= num-1; i++){
            if (num % i == 0){
                isSimple = false;
                break;
            }
        }
        if (isSimple){
            System.out.println("Число является простым");
        } else {
            System.out.println("Число не является простым");
        }
    }

    public static void printNum10(){
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        //printNum3();

        //printSum();

        //printMultiplayTable();

        // checkSimpleNum();
        // checkSimpleNum();

        printNum10();
    }
}
