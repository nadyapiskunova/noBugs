package complex_tasks.task_5;

import java.util.*;
import java.util.stream.Collectors;

public class InventoryService {
    public boolean isInventoryOpen;

    private Map<String, List<Product>> products = new HashMap<>();

    public void addProduct(Product product){
        if(!isInventoryOpen) return;

        products.computeIfAbsent(product.getCategory(), k-> new ArrayList<>()).add(product);
    }

    public Product takeProduct(String category){
        List<Product> listCategory = products.get(category);
        if(listCategory == null || listCategory.isEmpty()){
            throw new OutOfStockException("В этой категории товаров нет");
        }

        return listCategory.removeFirst();
    }

    public List<Product> filterProductByCategory(String category){
            return new ArrayList<>(products.getOrDefault(category, List.of()));
    }

    public List<Product> filterProductByPrice(double price){
        return  products.values().stream()
                .flatMap(List::stream)
                .filter(p -> p.getPrice() >= price)
                .collect(Collectors.toList());
    }

}


