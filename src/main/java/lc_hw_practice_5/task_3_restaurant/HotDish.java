package lc_hw_practice_5.task_3_restaurant;

public class HotDish extends Dish{
    private int temperature;

    HotDish (int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return this.temperature;
    }
    @Override
    public void print(){
        System.out.println("Горячее блюдо с температурой " + getTemperature() + " градусов");
    }
}
