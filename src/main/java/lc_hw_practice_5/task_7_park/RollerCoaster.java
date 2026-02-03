package lc_hw_practice_5.task_7_park;

public class RollerCoaster extends Attraction{

    @Override
    public void needMaintenance(){
        System.out.println("Американские горки: требуют проверки безопасности");
    }

    @Override
    public void printInfo(){
        System.out.println("Американские горки: экстремальный аттракцион");
    }
}
