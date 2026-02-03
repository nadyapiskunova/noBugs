package hw_practice_5.task_7_park;

public class Carousel extends Attraction {

    @Override
    public void info(){
        System.out.println("Карусель: увлекательный аттракцион");
    }

    @Override
    public void maintenance(){
        System.out.println("Карусель: требует технического обслуживания");
    }
}
