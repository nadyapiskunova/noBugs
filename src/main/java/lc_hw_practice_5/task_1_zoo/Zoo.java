package lc_hw_practice_5.task_1_zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
    }

    public void showBehaviour(){
        animal.move();
        animal.sound();
    }
}
