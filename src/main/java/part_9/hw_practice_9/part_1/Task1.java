package part_9.hw_practice_9.part_1;



public class Task1 {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiplay = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println(addition.apply(1,3));
        System.out.println(subtract.apply(5,2));
        System.out.println(multiplay.apply(5, 3));
        System.out.println(divide.apply(3, 2));
    }
}
