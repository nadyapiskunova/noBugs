package part_12.complex_tasks.task_6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    LocalDate april = LocalDate.parse("2026-04-01");
    LocalDate march = LocalDate.parse("2026-03-31");
    Task<Integer> taskAprilNewHigh = new Task<>(1, Task.Status.NEW, Task.Priority.HIGH, april);
    Task<Integer> taskMarchDoneLow = new Task<>(2, Task.Status.DONE, Task.Priority.LOW, march);
    Task<Integer> taskAprilDoneLow = new Task<>(3, Task.Status.DONE, Task.Priority.LOW, april);

    @Test
    public void testAddTaskValid(){
        TaskService<Integer> service = new TaskService<>();
        service.addTask(taskAprilNewHigh);

        assertEquals(1, service.getAllTask().size());
    }
    @Test
    public void testAddTaskInvalid(){
        TaskService<Integer> service = new TaskService<>();
        service.addTask(taskAprilNewHigh);

        assertThrows(IllegalArgumentException.class, () ->{
            service.addTask(taskAprilNewHigh);
        }, "Задача с таким id уже существует");
    }

    @Test
    public void testRemoveTask(){
        TaskService<Integer> service = new TaskService<>();
        service.addTask(taskAprilNewHigh);

        assertTrue(service.removeTask(1));
        assertFalse(service.removeTask(10));
    }

    @Test
    public void testGetFilterTaskByStatus(){
        TaskService<Integer> service = new TaskService<>();
        service.addTask(taskAprilNewHigh);
        service.addTask(taskMarchDoneLow);

        assertEquals(1,service.getFilterTaskByStatus(Task.Status.DONE).size());
        assertEquals(2,service.getFilterTaskByStatus(Task.Status.DONE).getFirst().getId());
    }

    @Test
    public void testGetFilterTaskByPriority(){
        TaskService<Integer> service = new TaskService<>();
        service.addTask(taskAprilNewHigh);
        service.addTask(taskMarchDoneLow);
        service.addTask(taskAprilDoneLow);

        assertEquals(2, service.getFilterTaskByPriority(Task.Priority.LOW).size());
        assertEquals(2, service.getFilterTaskByPriority(Task.Priority.LOW).get(0).getId());
        assertEquals(3, service.getFilterTaskByPriority(Task.Priority.LOW).get(1).getId());
    }

    @Test
    public void testGetSortedTaskByDate(){
        TaskService<Integer> service = new TaskService<>();
        service.addTask(taskAprilNewHigh);
        service.addTask(taskMarchDoneLow);
        service.addTask(taskAprilDoneLow);

        assertEquals(2, service.getSortedTaskByDate().get(0).getId());
    }

}
