package part_12.complex_tasks.task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService <T> {
    final private List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task){
        boolean exists = tasks.stream()
                .anyMatch(t -> t.getId().equals(task.getId()));
        if(exists){
            throw new IllegalArgumentException ("Задача с таким id уже существует");
        }
        tasks.add(task);
    }

    public synchronized boolean removeTask(T id){
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    public synchronized List<Task<T>> getFilterTaskByStatus(Task.Status status){
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }

    public synchronized List<Task<T>> getFilterTaskByPriority(Task.Priority priority){
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task<T>> getSortedTaskByDate(){
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    public List<Task<T>> getAllTask(){
        return List.copyOf(tasks);
    }

}
