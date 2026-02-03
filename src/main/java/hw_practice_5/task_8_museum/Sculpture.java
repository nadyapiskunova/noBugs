package hw_practice_5.task_8_museum;

public class Sculpture extends Exhibit {
    @Override
    void history() {
        System.out.println("Скульптура Древней Греции");
    }

    @Override
    void storageConditions() {
        System.out.println("Скульптура нуждается в реставрации");
    }
}
