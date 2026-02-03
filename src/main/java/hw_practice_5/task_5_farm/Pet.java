package hw_practice_5.task_5_farm;

public abstract class Pet {
    private String product;

    Pet(String product){
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    abstract void provideProduct();
    abstract void needCare();


}
