package hw_practice_5.task_4_aquarium;

public class Main {
    public static void main(String[] args) {
        MarineCreature shark = new Shark();
        MarineCreature starfish = new Starfish();

        Aquarium aquarium = new Aquarium();

        aquarium.addMarineCreature(shark);
        aquarium.showBehavior();

        aquarium.addMarineCreature(starfish);
        aquarium.showBehavior();
    }


}
