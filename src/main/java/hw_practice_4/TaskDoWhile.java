package hw_practice_4;

import java.util.Scanner;

public class TaskDoWhile {
    public static void main(String[] args) {
        //getPositiveNum();

        //checkPass();

        //printNum10();

        //overProgram();

        countDigits();
    }

    public static void getPositiveNum(){
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.print("Введите число: ");
            num = scanner.nextInt();
        } while (num < 0);
    }

    public static void checkPass(){
        Scanner scanner = new Scanner(System.in);
        String pass;
        do {
            System.out.print("Введите пароль: ");
            pass = scanner.nextLine();
        } while (!pass.equals("123"));
    }

    public static void printNum10(){
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void overProgram(){
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
    }

    public static void countDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:" );
        int num = scanner.nextInt();
        int i = 0;
        do{
            num = num / 10;
            i++;
        } while (num > 0);
        System.out.println(i);
    }

}
