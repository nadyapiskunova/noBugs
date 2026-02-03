package lc_hw_practice_5.task_3_restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish){
        this.dish = dish;
    }

    public void showInfo(){
        dish.print();
    }
}
