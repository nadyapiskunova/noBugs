package part_12.complex_tasks.task_6;

import java.time.LocalDate;

public class Task<T>{
    private T id;
    private Status status;
    private Priority priority;
    private LocalDate date;

    public enum Status {
       NEW, IN_PROGRESS, DONE
    }
     public enum Priority{
         LOW, MEDIUM, HIGH
     }

    public Task(T id, Status status, Priority priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}
