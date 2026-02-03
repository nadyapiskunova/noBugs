package hw_practice_5.task_2_pet;

public class Cat extends Pet{
    @Override
    public void active(){
        System.out.println("Кот гуляет");
    }
    @Override
    public void eat(){
        System.out.println("Кот ест влажный корм");
    }
}
