package lc_hw_practice_5.task_3_restaurant;

public class Drink extends Dish{

    private int volume;

    Drink(int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void print(){
        System.out.println("Напиток с объемом " + getVolume() + " мл.");
    }
}
