package lc_hw_practice_5.task_5_farm;

public class Cow extends Pet{

    Cow (String product){
        super(product);
    }

    @Override
    public void givesProduct(){
        System.out.println("Корова дает " + getProduct());
    }

    @Override
    public void needCare(){
        System.out.println("Корова требует выпаса");
    }
}
