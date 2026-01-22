package lc_hw_practice_2;

public class Product {
    String name;
    int price;

    Product(String name, int price){
        this.name = name;
        this.price = price;
    }
    String getName(){
        return name;
    }
    int getPrice(){
        return price;
    }
    void setName(String newName){
        name = newName;
    }
    void setPrice(int newPrice){
        price = newPrice;
    }
    void applyDiscount(int discount){
        price = price - (price * discount / 100);
    }
    void printInfo(){
        System.out.println("Название товара: " + getName() + ". Цена с учетом скидки: " + getPrice());
    }
}
