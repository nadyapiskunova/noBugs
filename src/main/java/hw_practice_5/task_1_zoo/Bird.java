package hw_practice_5.task_1_zoo;

public class Bird extends Animal{

    @Override
    public void sound(){
        System.out.println("Птица чирикает");
    }
    public void move(){
        System.out.println("Птица летает");
    }
}
