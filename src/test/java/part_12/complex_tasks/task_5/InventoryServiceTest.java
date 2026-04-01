package part_12.complex_tasks.task_5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * addProduct
 * 1) добавить с sInventoryOpen = true -> в списке одно значение
 * 2) добавить с sInventoryOpen = false -> в списке 0
 * takeProduct
 * 1) извлечь когда в категории есть продукт
 * 2) извлечь когда в категории нет продукта
 * filterProductByCategory
 * 1) под категорией есть продукт
 * 2) категория пустая
 * filterProductByPrice
 * 1) в список попадают только продукты с соответствующей ценой
 */
public class InventoryServiceTest {
    @Test
    public void testAddProductWhenIsInventoryOpen(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "Food");

        service.addProduct(milk);
        List<Product> productInCategory = service.filterProductByCategory("Food");

        assertEquals(1, productInCategory.size());
        assertEquals(milk, productInCategory.getFirst());
    }
    @Test
    public void testAddProductWhenIsInventoryOpenIsFalse(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = false;
        Product milk = new Product("Milk", 20.0, "Food");

        service.addProduct(milk);
        List<Product> productInCategory = service.filterProductByCategory("Food");

        assertEquals(0, productInCategory.size());
    }
    @Test
    public void testTakeProductWhenListCategoryNotEmpty(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "Food");

        service.addProduct(milk);
        Product taken = service.takeProduct("Food");

        List<Product> foodList = service.filterProductByCategory("Food");

        assertEquals("Milk", taken.getName());
        assertTrue(foodList.isEmpty());

    }
    @Test
    public void testTakeProductWhenListCategoryIsEmpty(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "Food");

        service.addProduct(milk);
        service.takeProduct("Food");

        assertThrows(OutOfStockException.class, () ->{
            service.takeProduct("Food");
        }, "Категория пустая");
    }

    @Test
    public void testFilterProductByCategoryValid(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "Food");
        service.addProduct(milk);
        List<Product> food = service.filterProductByCategory("Food");

        assertEquals(1, food.size());
        assertTrue(food.contains(milk));
    }
    @Test
    public void testFilterProductByCategoryInvalid(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "Food");
        service.addProduct(milk);
        List<Product> food = service.filterProductByCategory("test");

        assertEquals(0, food.size());
        assertFalse(food.contains(milk));
    }

    @Test
    public void testFilterProductByPrice(){
        InventoryService service = new InventoryService();
        service.isInventoryOpen = true;
        Product milk = new Product("Milk", 20.0, "Food");
        Product glass = new Product("Glass", 25.0, "Home");
        Product bread = new Product("Bread", 15.0, "Food");
        service.addProduct(milk);
        service.addProduct(glass);
        service.addProduct(bread);

        List<Product> byPrice = service.filterProductByPrice(20);

        assertEquals(2, byPrice.size());
        assertTrue(byPrice.contains(milk));
        assertTrue(byPrice.contains(glass));
        assertFalse(byPrice.contains(bread));
    }



}
