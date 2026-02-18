package practice_7.restaurant_manager;

public class Main {
    public static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Картошка фри");
        manager.addNewOrder("Спагетти");
        manager.addNewOrder("Маргарита");
        manager.printOrders();

        manager.deleteOrders("Спагетти");
        manager.printOrders();

    }



}
