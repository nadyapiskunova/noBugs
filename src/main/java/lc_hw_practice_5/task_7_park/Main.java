package lc_hw_practice_5.task_7_park;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        Park park = new Park();

        park.manageAttraction(rollerCoaster);
        park.showInfo(rollerCoaster);

        System.out.println();

        park.manageAttraction(carousel);
        park.showInfo(carousel);

    }
}
