package lc_hw_practice_5.task_5_farm;

public class Chicken extends Pet {

    Chicken (String product){
        super(product);
    }

    @Override
    public void givesProduct(){
        System.out.println("Курица дает " + getProduct());
    }

    @Override
    public void needCare(){
        System.out.println("Курица требует зерна");
    }
}
