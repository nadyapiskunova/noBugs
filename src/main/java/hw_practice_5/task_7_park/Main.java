package hw_practice_5.task_7_park;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();

        Park park = new Park();

        park.manageAttraction(rollerCoaster);
        park.printInfo(rollerCoaster);

        System.out.println();

        park.manageAttraction(carousel);
        park.printInfo(carousel);



    }
}
