package lc_hw_practice_5.task_2_Pet;

public class Dog extends Pet{

    @Override
    public void active(){
        System.out.println("Собака гуляет");
    }

    @Override
    public void eat(){
        System.out.println("Собака ест сухой корм");
    }
}
