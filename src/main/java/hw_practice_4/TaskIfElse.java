package hw_practice_4;

import lc_hw_practice_3.Person;

import java.util.Scanner;

public class TaskIfElse {
    public static void main(String[] args) {

        // Определение знака числа
        // checkNumScan();

        // Поиск наибольшего из двух чисел
        //findMaxNum();

        //Вывод оценки по шкале 1–5
        //printScores();

        // Проверка на чётность
        //checkParity();

        //Определение размера скидки по возрасту
        // checkSale();
        //checkSale();
        //checkSale();

        //Оценка результата теста по баллам
        printResultExam();
        printResultExam();
        printResultExam();
        printResultExam();
        printResultExam();



    }
    public static void checkNumScan(){
        Scanner  scanner = new Scanner(System.in);

        System.out.print("Введите число: ");

        int num = scanner.nextInt();

        if (num > 0){
            System.out.println("Число положительное");
        } else if (num < 0){
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число равно нулю");
        }
    }
    public static void findMaxNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("Максимальное число: " + num1);
        } else if (num2 > num1) {
            System.out.println("Максимальное число: " + num2);
        }
        else {
            System.out.println("Числа равны");
        }
    }

    public static void printScores(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку от 1 до 5: ");
        int score = scanner.nextInt();

        if(score == 5){
            System.out.println("Отлично");
        } else if (score == 4) {
            System.out.println("Хорошо");
        } else if (score == 3){
            System.out.println("Удовлетворительно");
        } else if (score > 5){
            System.out.println("Такой оценки не существует");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }

    public static void checkParity(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        if(num % 2 == 0){
            System.out.println("Число четное");
        } else{
            System.out.println("Число нечетное");
        }
    }

    public static void checkSale(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        if(age < 18){
            System.out.println("Скидка 25%");
        } else if (age >= 65){
            System.out.println("Скидка 30%");
        } else {
            System.out.println("Без скидки");
        }
    }

    public static void printResultExam(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш результат от 0 до 100: ");
        int result = scanner.nextInt();
        if (result >= 90){
            System.out.println("Отлично");
        } else if (result >= 75) {
            System.out.println("Хорошо");
        } else if (result >= 60){
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}

