package hw_practice_7.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.addNumbers(1);
        task1.addNumbers(5);
        task1.addNumbers(3);
        task1.addNumbers(13);
        task1.addNumbers(12);

        task1.printInRemovalOrder();
    }


}
