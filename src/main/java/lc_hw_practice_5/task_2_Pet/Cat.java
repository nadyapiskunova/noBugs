package lc_hw_practice_5.task_2_Pet;

public class Cat extends Pet{

    @Override
    public void active(){
        System.out.println("Кошка играет");
    }

    @Override
    public void eat(){
        System.out.println("Кошка ест влажный корм");
    }
}
