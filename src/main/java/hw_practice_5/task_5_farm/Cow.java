package hw_practice_5.task_5_farm;

public class Cow extends Pet{
    Cow(String product){
        super (product);
    }
    @Override
    public void provideProduct(){
        System.out.println("Корова дает " + this.getProduct());
    }
    @Override
    public void needCare(){
        System.out.println("Корова нуждается в выпасе");
    }
}

