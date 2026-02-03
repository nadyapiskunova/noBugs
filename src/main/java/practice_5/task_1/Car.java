package practice_5.task_1;

public class Car extends Transport {
    public Car(){
        super(70, 4);
    }


    @Override
    void start() {
        System.out.println("Машина поехала");
    }
}
