package lc_hw_practice_5.task_3_restaurant;

public class Main {
    public static void main(String[] args) {
        Dish hotDish = new HotDish(50);
        Dish drink = new Drink(250);

        Menu menu = new Menu();

        menu.addDish(hotDish);
        menu.showInfo();

        System.out.println();

        menu.addDish(drink);
        menu.showInfo();
    }
}
