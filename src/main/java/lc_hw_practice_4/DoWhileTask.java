package lc_hw_practice_4;

import java.util.Scanner;

public class DoWhileTask {
    static Scanner scanner = new Scanner(System.in);

    public static void printPositiveNum(){

        int num;
        do {
            System.out.print("Введите число: ");
            num = scanner.nextInt();
        } while (num <= 0);
    }

    public static void checkPass(){

        String pass;

        do {
            System.out.print("ВВедите пароль: ");
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

    public static void printCommand(){

        String command;

        do {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
    }

    public static void printCountNum(){

        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        int count = 0;
        do {
            num = num / 10;
            count ++;
        } while (num > 0);
        System.out.println(count);
    }

    public static void main(String[] args) {
        //printPositiveNum();

        //checkPass();

        //printNum10();

         //printCommand();

        printCountNum();



    }
}
