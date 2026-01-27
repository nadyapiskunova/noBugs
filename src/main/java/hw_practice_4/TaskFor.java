package hw_practice_4;

import java.util.Scanner;

public class TaskFor {
    public static void main(String[] args) {
        // Вывод чисел от 1 до 100, делящихся на 3
        //printDivisibleByThree();

        //Сумма чисел от 1 до n
        // getSumAllNum();

        //Таблица умножения для числа
       // printMultiplayTable();

        // Проверка на простое число
        //checkSimpleNum();

        // Вывод чисел от 1 до 10
        printNum10();


    }
    public static void printDivisibleByThree(){
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void getSumAllNum(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printMultiplayTable(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void checkSimpleNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= num - 1; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Число является простым");
        } else {
            System.out.println("Число не является простым");
        }
    }

    public static void printNum10(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }


}
