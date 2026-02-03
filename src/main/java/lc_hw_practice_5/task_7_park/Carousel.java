package lc_hw_practice_5.task_7_park;

public class Carousel extends Attraction{

    @Override
    public void needMaintenance(){
        System.out.println("Карусель: требует технического обслуживания");
    }

    @Override
    public void printInfo(){
        System.out.println("Карусель: это увлекательный аттракцион");
    }
}
