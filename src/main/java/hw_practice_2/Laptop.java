package hw_practice_2;

public class Laptop {
    String name;
    int price;

    Laptop(String name, int price){
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
    void printInfo(){
        System.out.println("Название: " + getName() + "; Цена: " + getPrice());
    }
}
