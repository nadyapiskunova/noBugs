package hw_practice_5.task_7_park;

public class RollerCoaster extends Attraction {
    @Override
    public void info(){
        System.out.println("Американские горки: экстремальный аттракцион");
    }

    @Override
    public void maintenance(){
        System.out.println("Американские горки: требует проверки безопасности");
    }
}
