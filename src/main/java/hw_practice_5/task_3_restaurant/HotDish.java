package hw_practice_5.task_3_restaurant;

public class HotDish extends Dish {
    private int temperature;

    HotDish(int temperature){
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
    @Override
    public void print(){
        super.print();
        System.out.print("Горячее блюдо");
        System.out.println();
        System.out.print("Температура " + getTemperature() + " градусов");
        System.out.println();
    }

}
