package lc_hw_practice_7.arrayDeque;

public class Main {
    public static void main(String[] args) {
//        Task1 task1 = new Task1();
//
//        task1.addNumber(12);
//        task1.addNumber(3);
//        task1.addNumber(16);
//        task1.addNumber(87);
//        task1.addNumber(13);
//
//        task1.printNumbers();

//        Task2 task2 = new Task2();
//
//        task2.addElements("Apple");
//        task2.addElements("Peach");
//        task2.addElements("Mango");
//        task2.addElements("Banana");
//        task2.addElements("Melon");
//
//        task2.printInvertElements();

        Task3 task3 = new Task3();
        task3.addElementsFirstAndLast("Apple", "Banana");
        task3.addElementsFirstAndLast("Hello", "World");
        task3.addElementsFirstAndLast("Melon", "Watermelon");
        task3.addElementsFirstAndLast("Java", "Python");
        task3.addElementsFirstAndLast("Cat", "Dog");

        task3.printElement();
        task3.removeElements();

        task3.printElement();
        task3.removeElements();

        task3.printElement();
        task3.removeElements();

        task3.printElement();
        task3.removeElements();

    }
}
