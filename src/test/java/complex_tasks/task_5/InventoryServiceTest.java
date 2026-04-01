package complex_tasks.task_5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    @Test
    public void testAddProductWhenIsInventoryOpenTrue(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product product = new Product("Milk", 20.0, "food");

        service.addProduct(product);
        List<Product> productsInCategory = service.filterProductByCategory("food");

        assertEquals(1,productsInCategory.size());
        assertEquals(product,productsInCategory.getFirst());
    }
    @Test
    public void testAddProductWhenIsInventoryOpenFalse(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = false;
        Product product = new Product("Milk", 20.0, "food");

        service.addProduct(product);
        List<Product> productsInCategory = service.filterProductByCategory("food");

        assertEquals(0,productsInCategory.size());
    }
    @Test
    public void testTakeProductWhenListCategoryNotEmpty(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product product = new Product("Milk", 20.0, "food");

        service.addProduct(product);

        assertEquals(product, service.takeProduct("food"));
    }
    @Test
    public void testTakeProductWhenListCategoryIsEmpty(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product product = new Product("Milk", 20.0, "food");

        service.addProduct(product);

        assertEquals(product, service.takeProduct("food"));
        assertThrows(OutOfStockException.class, () -> {
            service.takeProduct("test");
        }, "В этой категории нет товаров или она не существует");
    }
    @Test
    public void testFilterProductByCategoryValid(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product product = new Product("Milk", 20.0, "food");
        service.addProduct(product);
        List<Product> food = service.filterProductByCategory("food");

        assertEquals(1, food.size());
        assertTrue(food.contains(product));

    }
    @Test
    public void testFilterProductByCategoryInvalid(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product product = new Product("Milk", 20.0, "food");
        service.addProduct(product);
        List<Product> food = service.filterProductByCategory("test");

        assertEquals(0, food.size());
        assertFalse(food.contains(product));
    }
    @Test
    public void testFilterProductByPrice(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "food");
        Product bread = new Product("Bread", 15.0, "food");
        Product glass = new Product("Glass", 25.0, "home");
        service.addProduct(milk);
        service.addProduct(glass);

        List<Product> byPrice = service.filterProductByPrice(20);

        assertEquals(2, byPrice.size());
        assertTrue(byPrice.contains(milk));
        assertTrue(byPrice.contains(glass));
        assertFalse(byPrice.contains(bread));
    }





}
