package practice_7.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {
    //организация хранения по принципу инкапсуляции приватным полем

    // массив, в котором индекс = номер месяца

    //чтобы работать со структурой данных ее нужно инициализировать. Первый способ создать новый ArrayList
    private ArrayList<Double> costsPerMonth; // = new ArrayList<>();

    // второй способ инициализации структуры данных
    // создать конструктор без аргументов и в нём внутри при создании сразу инициализирует внутреннее состояние
    // то есть внутреннее поле costsPerMonth
    public CostCounter(){
        this.costsPerMonth = new ArrayList<>();
    }
    // метод добавления значения по номеру месяца (от 1 до 12) и расходами в этот месяц
    public void addCosts(int month, Double costs){
        costsPerMonth.add(month-1, costs);
    }
    // метод получения значения расхода по месяцу
    public Double getCosts(int month){
        return costsPerMonth.get(month-1);
    }

    // считать месяц с минимальным расходом
    public Double minCostsPerMonth(){
        AtomicReference<Double> min = new AtomicReference<>(costsPerMonth.getFirst());
        costsPerMonth.forEach(
                costsPerMonth ->{
                    if (costsPerMonth < min.get()){
                        min.set(costsPerMonth);
                    }
                }
        );

        return min.get();
    }












}
