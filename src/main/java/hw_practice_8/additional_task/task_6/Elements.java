package hw_practice_8.additional_task.task_6;

import java.util.ArrayList;
import java.util.List;

public class Elements <T> implements Container<T> {
    private List<T> list = new ArrayList<>();
    @Override
    public void add (T item){
        list.add(item);
    }
    @Override
    public T get(){
        return list.getLast();
    }
    public void printListElements(){
        list.forEach(System.out::println);
    }

}
