package part_12.complex_tasks.task_1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends User>{
    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    public void addEntity(T entity){
        entities.add(entity);
    }

    public boolean removeEntity(T entity){
        return entities.remove(entity);
    }

    public List<T> getAllEntity(){
        return List.copyOf(entities);
    }

    public List<T> getEntityFilterByAge(int min, int max){
        return entities.stream()
                .filter(e -> e.getAge() >= min && e.getAge() <= max)
                .collect(Collectors.toList());
    }

    public List<T> getEntityFilterByName(String name){
        return entities.stream()
                .filter(e -> e.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<T> getEntityFilterByIsActive(boolean isActive){
        return entities.stream()
                .filter(User::isActive)
                .collect(Collectors.toList());
    }

}
