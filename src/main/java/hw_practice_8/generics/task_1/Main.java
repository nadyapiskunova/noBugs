package hw_practice_8.generics.task_1;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();

        stringBox.setElement("java");
        System.out.println(stringBox.getElement());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElement(123);
        System.out.println(integerBox.getElement());

        Box<User> userBox = new Box<>();
        userBox.setElement(new User("bloom", 20));
        System.out.println(userBox.getElement());
    }



}
