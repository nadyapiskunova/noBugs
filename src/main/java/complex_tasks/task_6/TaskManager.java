package complex_tasks.task_6;

import complex_tasks.task_3.StudentGrade;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager <T>{
    List<Task<T>> tasks = new ArrayList<>();

    public synchronized void addTask(Task<T> task){
        boolean exists = tasks.stream()
                .anyMatch(t -> t.getId().equals(task.getId()));
        if (exists){
            throw new IllegalArgumentException("Задача с таким айди уже существует");
        }
        tasks.add(task);
    }

    public synchronized boolean removeTask(T id){
        return tasks.removeIf(t -> t.getId().equals(id));
    }

    public synchronized List<Task<T>> filterTaskByStatus(Task.Status status){
        return tasks.stream()
                .filter(t -> t.getStatus() == status)
                .collect(Collectors.toList());
    }
    public synchronized List<Task<T>> filterTaskByPriority(Task.Priority priority){
        return tasks.stream()
                .filter(t -> t.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public synchronized List<Task<T>> sortedByDate(){
        return tasks.stream()
                .sorted(Comparator.comparing(Task::getDate))
                .collect(Collectors.toList());
    }

    public List<Task<T>> getAllTask(){
        return List.copyOf(tasks);
    }


}
