package hw_practice_5.task_3_restaurant;

public class Drink extends Dish {
    private int volume;

    Drink (int volume){
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    @Override
    public void print(){
        super.print();
        System.out.print("Напиток");
        System.out.println("Объем " + getVolume()+ " мл.");
    }
}
