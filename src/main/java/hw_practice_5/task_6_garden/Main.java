package hw_practice_5.task_6_garden;

public class Main {
    public static void main(String[] args) {
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        Garden garden = new Garden();

        garden.addPlant(orchid);
        garden.getCare();

        garden.addPlant(cactus);
        garden.getCare();

    }
}
