package complex_tasks.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * ТЕСТ КЕЙСЫ
 * Добавление элементов:
 *      добавить 1 элемент в пустой менеджер
 *      добавить 1 элемент в НЕпустой менеджер
 *      добавить 1 элемент несколькими потоками (проверка интеграции)
 */
public class EntityManagerTest {

    @Test
    public void addEntityTest(){
        EntityManager<Student> manager = new EntityManager<>();
        int initialSize = manager.getAll().size();
        Student expectedStudents = new Student("Коля", 17, true);
        Student expectedStudentsNewObj = new Student("Коля", 17, true);
        manager.add(expectedStudents);

        // добавить элемент:
        // ожидание 1: он содержится в финальном списке
        // ожидание 2: то, что было добавлено, равно тому что мы передали
        // ожидание 3: добавлен 1 элемент

        // ожидание 1
        assertTrue(manager.getAll().contains(expectedStudents));

        // ожидание 2
        Student  actualStudent = manager.getAll().getFirst();

        // сравнение как объект
        // assertEquals(expectedStudents, actualStudent); -> нужно понять переопределен ли Equals, тут всегда будет тру потому что проверяет один и тот же объект

        assertEquals(expectedStudentsNewObj, actualStudent);

        // ожидание 3:
        assertEquals(initialSize + 1, manager.getAll().size());

    }
}
