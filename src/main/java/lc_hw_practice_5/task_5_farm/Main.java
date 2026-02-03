package lc_hw_practice_5.task_5_farm;

public class Main {
    public static void main(String[] args) {
        Pet cow = new Cow("молоко");
        Pet chicken = new Chicken("яйцо");

        Farm farm = new Farm();

        farm.managePet(cow);

        System.out.println();

        farm.managePet(chicken);

    }
}
