package hw_practice_4;

import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[] args) {
        // Вывод дня недели по номеру
       // System.out.println(printDay());

        //System.out.println(convertScore());
        //getPriceTicket();
        //readCommand();
        calculate();

    }
    public static String printDay(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int day = scanner.nextInt();
        String dayOfWeek = "";

        switch (day){
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресение";
                break;
            default:
                dayOfWeek = "Не существующее значение";
        }
    return dayOfWeek;
    }

    public static String convertScore(){
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();
        int result = score / 10;
        String grade = "";

        switch (result){
            case 10:
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                grade = "F";
                break;
            default:
                grade = "Некорректное значение";
                break;
        }
        return grade;
    }


    public static void getPriceTicket(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня от 1 до 7: ");
        int day = scanner.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость билет 300 рублей");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость билета 450 рублей");
                break;
            default:
                System.out.println("Некорректное значение");
        }
    }

    public static void readCommand(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду из набора: ");
        System.out.println("start");
        System.out.println("stop");
        System.out.println("restart");
        System.out.println("status");
        String command = scanner.nextLine();
        switch (command){
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Статус системы");
        }
    }

    public static void calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        // после ввода числа нажимаю энтер и в буффере остается /n, nextLine() прочитает его
        // и не даст ввести строку, поэтому делаю еще один nextLine(), чтобы он "съел" /n
        scanner.nextLine();

        System.out.print("Введите оператор: ");
        String operation = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        switch (operation){
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("Делить на ноль нельзя");
                } else {
                    System.out.println(num1 / num2);
                }
            }
        }
    }
}
