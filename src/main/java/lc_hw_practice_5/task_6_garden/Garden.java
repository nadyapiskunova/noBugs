package lc_hw_practice_5.task_6_garden;

public class Garden {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
    }

    public void giveCare(){
        plant.needCare();
    }
}
