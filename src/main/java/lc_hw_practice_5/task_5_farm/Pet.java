package lc_hw_practice_5.task_5_farm;

public abstract class Pet {
    private String product;

    Pet (String product){
        this.product = product;
    }

    public String getProduct(){
        return this.product;
    }

    abstract void givesProduct();

    abstract void needCare();


}
