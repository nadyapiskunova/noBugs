package hw_practice_5.task_4_aquarium;

public class Aquarium {
    private MarineCreature marineCreature;

    public void addMarineCreature(MarineCreature marineCreature){
        this.marineCreature = marineCreature;
    }

    public void showBehavior(){
        marineCreature.move();
    }

}
