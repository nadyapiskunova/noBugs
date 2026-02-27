package lc_hw_practice_8.generics.task_1;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setElement("Java");
        System.out.println(stringBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(23);
        System.out.println(integerBox.getElement());
    }
}
