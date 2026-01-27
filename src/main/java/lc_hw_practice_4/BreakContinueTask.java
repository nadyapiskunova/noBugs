package lc_hw_practice_4;

import java.util.Scanner;

public class BreakContinueTask {

    public static void printPositiveNumSum(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if (num > 0){
                sum = sum + num;
                System.out.println(sum);
            } else {
                break;
            }

        }
    }

    public static void skipMultiplesOfThree(){
        for (int i = 1; i <= 20; i++){
            if (i % 3 == 0){
                continue;
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printAllPositiveNum(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            if (num <= 0){
                continue;
            }
            else {
                System.out.println(num);
            }
        }
    }

    public static void printCommand(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Введите команду: ");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
        }
    }

    public static void main(String[] args) {
        //printPositiveNumSum();

        //skipMultiplesOfThree();

        //printAllPositiveNum();

        printCommand();

    }
}
