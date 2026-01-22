package hw_practice_2;

public class Car {
    String brand;
    int year;



    //Создаю конструктор и принимаю два параметра.
    // Эти значения будут использоваться для инициализации объекта
    Car (String brand, int year){
        // Использую this, чтобы явно обратиться к полям текущего объекта
        // Это важно, чтобы отличить поля класса от параметров метода
        this.brand = brand;
        this.year = year;
    }
    // создаю метод getBrand с возвращаемым типом String
    //круглые скобки пустые, потому что метод не принимает параметры
    String getBrand(){
        //метод возвращает значение через оператор return
        return brand;
    }
    int getYear(){
        return year;
    }
    // объявляю метод setBrand, метод не возвращает значение, поэтому использую void
    // метод принимает значение при вызове, объявляю переменную newBrand с типом String
    void setBrand(String newBrand){
        // внутри метода я присваиваю полю brand значение newBrand
        brand = newBrand;
    }

    void setYear(int newYear){
        year = newYear;
    }
    // создаю метод print, который не возвращает значение, поэтому void
    // метод выводит информацию о машине в консоль
    void print(){
        // использую System.out.println, чтобы показать марку и год выпуска машины
        //для получения значений вызываю методы getBrand() и getYear()
        System.out.println("Марка машины " + getBrand() + ", годы выпуска " + getYear());
    }

}
