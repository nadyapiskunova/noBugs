package complex_tasks.task_6;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {
    private LocalDate april = LocalDate.parse("2026-04-01");
    private LocalDate march30 = LocalDate.parse("2026-03-30");

    Task<Integer> taskNewLowApril = new Task<>(1, Task.Status.NEW, Task.Priority.LOW, april);
    Task<Integer> taskNewHighApril = new Task<>(2, Task.Status.NEW, Task.Priority.HIGH, april);
    Task<Integer> taskInProgressHighMarch30 = new Task<>(3, Task.Status.IN_PROGRESS, Task.Priority.HIGH, march30);
    Task<Integer> taskDoneMediumMarch30 = new Task<>(4, Task.Status.DONE, Task.Priority.MEDIUM, april);

    @Test
    public void testAddTaskValid(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);

        assertEquals(1, manager.getAllTask().size());
    }
    @Test
    public void testAddTaskInvalid(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);

        assertThrows(IllegalArgumentException.class, () -> {
            manager.addTask(taskNewLowApril);
        }, "Задача с таким айди уже существует");
    }

    @Test
    public void testRemoveTask(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);

        assertTrue(manager.removeTask(1));
    }

    @Test
    public void testRemoveTaskInvalid(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);

        assertFalse(manager.removeTask(3));
    }

    @Test
    public void testFilterByStatus(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);
        manager.addTask(taskNewHighApril);
        manager.addTask(taskInProgressHighMarch30);

        assertEquals(2, manager.filterTaskByStatus(Task.Status.NEW).size());
        assertEquals(1, manager.filterTaskByStatus(Task.Status.NEW).get(0).getId());
        assertEquals(2, manager.filterTaskByStatus(Task.Status.NEW).get(1).getId());
    }
    @Test
    public void testFilterByPriority(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);
        manager.addTask(taskNewHighApril);
        manager.addTask(taskInProgressHighMarch30);

        assertEquals(2, manager.filterTaskByPriority(Task.Priority.HIGH).size());
        assertEquals(2, manager.filterTaskByPriority(Task.Priority.HIGH).get(0).getId());
        assertEquals(3, manager.filterTaskByPriority(Task.Priority.HIGH).get(1).getId());
    }
    @Test
    public void testSortedByDate(){
        TaskManager<Integer> manager = new TaskManager<>();
        manager.addTask(taskNewLowApril);
        manager.addTask(taskNewHighApril);
        manager.addTask(taskInProgressHighMarch30);

        assertEquals(3, manager.sortedByDate().size());
        assertEquals(3, manager.sortedByDate().get(0).getId());
    }


}
