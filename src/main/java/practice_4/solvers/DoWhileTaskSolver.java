package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // проверка по угадыванию случайного числа
        //findNumber(5);

        // поиск минимального введенного числа
        //findMin();

        // проверка метода по введение логина и пароля
        checkCredantials();
    }


    public static void findNumber(int bound){
        // создаем сканер, который будет сканировать систему вводу на основе System.in
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(5);

        int number;
        do {
            System.out.print("Угадай число: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.println("Верно!");
    }

    public static void findMin(){
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = 2147483647;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);

        System.out.println("Min num: " + min);
    }

    public static void checkCredantials(){
        Scanner scanner = new Scanner(System.in);

        String login;
        String pass;
        do {
            System.out.println("Введите login");
            login = scanner.nextLine();
            System.out.println("Ведите пароль");
            pass = scanner.nextLine();
        } while (!login.equals("root") || !pass.equals("123"));
        System.out.println("Доступ разрешен");
    }
}
