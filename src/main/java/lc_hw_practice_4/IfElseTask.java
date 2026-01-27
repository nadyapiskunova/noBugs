package lc_hw_practice_4;

import java.util.Scanner;

public class IfElseTask {
    public static void getSign(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");

        int num = scanner.nextInt();
        if(num > 0){
            System.out.println("Число положительное");
        } else if(num < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }

    }

    public static void getNumber(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        } else if (num2 > num1){
            System.out.println(num2);
        } else {
            System.out.println("Числа равны");
        }
    }

    public static void printScore(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку: ");
        int score = scanner.nextInt();
        if(score == 5){
            System.out.println("Отлично");
        } else if (score == 4){
            System.out.println("Хорошо");
        } else if (score == 3){
            System.out.println("Удовлетворительно");
        } else if (score == 1 || score == 2){
            System.out.println("Неудовлетворительно");
        } else
            System.out.println("Такой оценки не существует");
    }
    public static void checkNumIven(){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void checkSale(int age){
        if(age < 18){
            System.out.println("25%");
        } else if (age >= 65){
            System.out.println("30%");
        } else {
            System.out.println("Нет скидка");
        }
    }

    public static void checkExamScore(int score){
        if (score >= 90){
            System.out.println("Отлично");
        } else if (score >= 75){
            System.out.println("Хорошо");
        } else if (score >= 60){
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }


    public static void main(String[] args) {

        //getSign();
        //getSign();
        //getSign();
        //getNumber();
        //printScore();
        //checkNumIven();
        //checkNumIven();
        //checkSale(12);
        //checkSale(43);
        //checkSale(68);
        checkExamScore(91);
        checkExamScore(77);
        checkExamScore(60);
        checkExamScore(0);

    }
}
