package lc_hw_practice_4;

import java.util.Scanner;

public class SwitchTask {

    public static void printDay(){
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректное число");
        }
    }

    public  static void getPriceTicket(){
        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();

        switch (price){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Стоимость билета 300");
                break;
            case 6:
            case 7:
                System.out.println("Стоимость билета 450");
                break;
            default:
                System.out.println("Значение некорректное");

        }
    }

    public static void translateScore(){
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        int num = score / 10;
        switch (num){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Значение некорректное");

        }
    }

    public static void printTextCommand(){
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        switch (command){
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система остановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Статус системы");
            default -> System.out.println("Некорректная команда");
        }
    }

    public static void calculateTwoNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите оператор: ");
        String operator = scanner.nextLine();

        System.out.print("Введите число 2: ");
        int num2 = scanner.nextInt();

        switch (operator){
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" ->{
                if (num2 == 0){
                    System.out.println("На ноль делить нельзя");
                } else {
                    System.out.println(num1 / num2);
                }
            }
            default -> System.out.println("Значение некорректное");
        }



    }

    public static void main(String[] args) {
        //printDay();
        //getPriceTicket();
        // translateScore();
        //printTextCommand();
        calculateTwoNum();




    }
}
