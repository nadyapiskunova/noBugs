package lc_hw_practice_8.additional_task.task_3;

public class Main {
    public static void main(String[] args) {
        NumberBox<Double> numberBox = new NumberBox<>();

        numberBox.addNumber(1.0);
        numberBox.addNumber(2.0);
        numberBox.addNumber(3.0);

        numberBox.printSumNumber();

    }
}
