package hw_practice_4;


import java.util.Scanner;

public class TaskWhile {
    public static void main(String[] args) {
        //printFactorial();

        //printNum();

        printInvertNum();
    }

    public static void printFactorial(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= num){
            result = i * result;
            i++;
        }
        System.out.println(result);
    }
    public static void printNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        int i = 1;
        while (i <= num){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
    public static void printInvertNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("ВВедите число: ");
        int num = scanner.nextInt();
        while (num >= 1){
            System.out.println(num);
            num--;
        }
    }
}
