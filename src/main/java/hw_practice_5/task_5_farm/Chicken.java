package hw_practice_5.task_5_farm;

public class Chicken extends Pet{
    Chicken(String product){
        super(product);
    }
    @Override
    public void provideProduct(){
        System.out.println("Курица дает " + this.getProduct());
    }
    @Override
    public void needCare(){
        System.out.println("Требует зерно ");
    }
}
