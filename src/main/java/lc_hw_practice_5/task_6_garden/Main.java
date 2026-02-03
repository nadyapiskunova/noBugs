package lc_hw_practice_5.task_6_garden;

public class Main {
    public static void main(String[] args) {
        Plant cactus = new Cactus();
        Plant orchid = new Orchid();

        Garden garden = new Garden();

        garden.addPlant(cactus);
        garden.giveCare();

        System.out.println();

        garden.addPlant(orchid);
        garden.giveCare();
    }
}
