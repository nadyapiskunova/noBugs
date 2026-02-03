package lc_hw_practice_5.task_8_museum;

public class Manuscript extends Exhibit{

    @Override
    public void storageConditions(){
        System.out.println("Требует контролируемой влажности");
    }

    @Override
    public void history(){
        System.out.println("Манускрипт шумерский");
    }
}
