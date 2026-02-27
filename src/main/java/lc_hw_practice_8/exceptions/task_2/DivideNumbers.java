package lc_hw_practice_8.exceptions.task_2;

public class DivideNumbers {
    public static double divideNumbers(double a, double b){
        if(b == 0){
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            divideNumbers(1, 0);
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль запрещено!");
        }
        finally {
            System.out.println("Операция завершена");
        }

    }
}
