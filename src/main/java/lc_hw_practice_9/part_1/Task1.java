package lc_hw_practice_9.part_1;

public class Task1 {
    public static void main(String[] args) {
        MathOperation addition = (double a, double b) -> a + b;
        MathOperation subtract = (double a, double b) -> a - b;
        MathOperation multiplay = (double a, double b) -> a * b;
        MathOperation divide = (double a, double b) -> a / b;

        System.out.println(addition.apply(1,2));
        System.out.println(subtract.apply(5,4));
        System.out.println(multiplay.apply(3,5));
        System.out.println(divide.apply(3,2));
    }
}
