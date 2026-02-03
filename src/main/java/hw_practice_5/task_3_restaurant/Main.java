package hw_practice_5.task_3_restaurant;

public class Main {
    public static void main(String[] args) {
        Dish hotDish = new HotDish(41);
        Dish drink = new Drink(250);

        Menu menu = new Menu();
        menu.displayDescription(hotDish);
       // menu.displayDescription(drink);

    }
}
