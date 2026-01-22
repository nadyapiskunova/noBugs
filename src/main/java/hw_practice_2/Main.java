package hw_practice_2;

import java.sql.SQLOutput;

public class Main {
    // объявляю точку входа в программу — метод main
    // модификатор доступа public, static, и принимает массив строк в качестве аргументов
    public static void main(String[] args) {
        // здесь будет выполняться основной код программы

        // создаю новый объект car1 класса Car
        // передаю конструктору значения: бренд "bmv" и год выпуска 1999
        Car car1 = new Car("bmv", 1999);
        // вызываю метод setYear для объекта car1, чтобы обновить год выпуска
        car1.setYear(2001);
        // вызываю метод print() у объекта car1, чтобы вывести информацию о машине на экран
        car1.print();

        Rectangle rectangle = new Rectangle(6, 10);
        rectangle.setWidth(3);
        System.out.println("Площадь треугольника равна: " + rectangle.calculateArea(rectangle.getWidth(), rectangle.getHeight()));

        Book book = new Book("Война и мир", "А.Толстой");
        book.setAuthor("Л.Толстой");
        book.printInfo();

        BankAccount account = new BankAccount("Иванов", 123);
        account.deposit(50);
        account.withdraw(10);
        account.printBalance();

        Point point = new Point(11, 31);
        point.setX(22);
        point.print();

        Circle circle = new Circle(5);
        circle.setRadius(4);
        System.out.println("Площадь окружности:" + circle.calculateArea(circle.getRadius()) + ", длина окружности: " + circle.calculateCircumference(circle.getRadius()));

        Teacher teacher = new Teacher("Мария", "Литература");
        teacher.setSubject("Русский");
        teacher.printInfo();

        Product product = new Product("Молоко", 150);
        product.setPrice(100);
        product.applyDiscount(10);
        System.out.println("Цена товара с учетом скидки: " + product.getPrice());

        Laptop laptop = new Laptop("Lenovo", 10000);
        laptop.setPrice(20000);
        laptop.printInfo();






    }
}
