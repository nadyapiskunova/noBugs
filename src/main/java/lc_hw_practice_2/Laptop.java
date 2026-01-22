package lc_hw_practice_2;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    String getBrand(){
        return brand;
    }
    int getPrice(){
        return price;
    }
    void setBrand(String newBrand){
        brand = newBrand;
    }
    void setPrice(int newPrice){
        price = newPrice;
    }
    void printInfo(){
        System.out.println("Название товара: " + getBrand() + ", цена товара: " + getPrice());
    }

}
