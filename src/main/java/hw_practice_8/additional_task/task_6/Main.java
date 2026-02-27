package hw_practice_8.additional_task.task_6;

public class Main {
    public static void main(String[] args) {
        Elements<Integer> elements = new Elements<>();

        elements.add(2);
        elements.add(3);
        elements.add(4);

        elements.printListElements();
        System.out.println("Last element: " + elements.get());
    }

}
