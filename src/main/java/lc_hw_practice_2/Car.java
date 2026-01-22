package lc_hw_practice_2;

public class Car {
    String brand;
    int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    String getBrand(){
        return brand;
    }
    int getYear(){
        return year;
    }
    void setBrand(String newBrand){
        brand = newBrand;
    }
    void setYear(int newYear){
        year = newYear;
    }
    void print(){
        System.out.println("Название: " + getBrand() + ", год выпуска: " + getYear());
    }
}
