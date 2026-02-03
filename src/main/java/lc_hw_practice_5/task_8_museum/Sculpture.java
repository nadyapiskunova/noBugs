package lc_hw_practice_5.task_8_museum;

public class Sculpture extends Exhibit{
    @Override
    public void storageConditions() {
        System.out.println("Нуждается в реставрации");
    }

    @Override
    public void history() {
        System.out.println("Скульптура из Древней Греции");

    }
}
