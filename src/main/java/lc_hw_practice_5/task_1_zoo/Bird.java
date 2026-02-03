package lc_hw_practice_5.task_1_zoo;

public class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Птица летает");
    }

    @Override
    void sound() {
        System.out.println("Птица чирикает");
    }
}
