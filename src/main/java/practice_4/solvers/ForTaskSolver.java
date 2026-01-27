package practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        // таблица умножения
        // multiplayTable(5);

        // метод выводит сумму всех чисел
       // System.out.println(sumOfAllNumber(10));

        // выводит все простые числа от 1 до 10
       //  printAllSimpleNumbers();

        // определение простого числа
        System.out.println(checkNumberIsSimple(7));
        System.out.println(checkNumberIsSimple(6));

    }
    public static void multiplayTable(int number){
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
    public static int sumOfAllNumber(int n){
        int sum = 0;
        // шаг 1, sum = 0; i = 1 -> sum = 1
        // шаг 2, sum = 1; i = 2 -> sum = 3
        // шаг 3, sum = 3; i = 3 -> sum = 6
        // шаг 4, sum = 6; i = 4 -> sum = 10

        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
    public static void printAllSimpleNumbers(){
        // простое число делится само на себя и на делитель
        for(int i = 2; i <= 100; i++){
            boolean isSimple = true;
            for (int j = 2; j < i-1; j++){
                if (i % j == 0){
                    isSimple = false;
                    break;
                }
            }
            if (isSimple){
                System.out.println(i);
            }
        }
    }
    public static boolean checkNumberIsSimple(int number){
        boolean isSimple = true;
        for (int i = 2; i <= number-1; i++){
            if (number % i == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }
}
