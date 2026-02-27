package hw_practice_8.additional_task.task_3;

public class Main {
    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();

        integerNumberBox.addNumber(1);
        integerNumberBox.addNumber(2);
        integerNumberBox.addNumber(3);

        System.out.println(integerNumberBox.printSumNumbers());
    }
}
