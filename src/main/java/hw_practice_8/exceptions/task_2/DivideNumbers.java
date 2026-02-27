package hw_practice_8.exceptions.task_2;

public class DivideNumbers {
    public static double divideNumbers(double a,double b){
        if (b == 0){
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return a / b;
    }
    public static void main(String[] args) {
        try {
            double result = divideNumbers(2,0);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e){
            System.out.println("Ошибка: деление на ноль!");
        }
        finally {
            System.out.println("Операция завершена.");
        }

    }
}
