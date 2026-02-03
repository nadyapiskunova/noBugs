package hw_practice_5.task_2_pet;

public class Dog extends Pet {
    @Override
    public void active(){
        System.out.println("Собака гуляет");
    }
    @Override
    public void eat(){
        System.out.println("Собака ест мокрый корм");
    }
}
