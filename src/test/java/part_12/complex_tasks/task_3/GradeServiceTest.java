package part_12.complex_tasks.task_3;

import org.junit.jupiter.api.Test;
import part_12.complex_tasks.task_3.exceptions.InvalidGradeException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * positive for addGrade
 * 1) добавить запись с валидными данными -> проверить количество записей
 *
 * negative for addGrade
 * 1) добавить запись с отрицательной оценкой -> проверить исключение
 *
 * positive for averageGrade
 * 1) добавить две записи, сравнить полученное значение
 *
 * negative for averageGrade
 * 1) посчитать среднее по несуществующему предмету -> 0.0
 */

public class GradeServiceTest {
    @Test
    public void testAddGradeWithValidData(){
        GradeService<Integer> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Bloom", "Math", 100));

        assertEquals(1, service.getAllGrade().size());
    }

    @Test
    public void testAddGradeWithNegativeGrade(){
        GradeService<Integer> service = new GradeService<>();

        assertThrows(InvalidGradeException.class, () ->{
            service.addGrade(new StudentGrade<>("Bloom", "Math", -10));
        }, "Оценка отрицательная");
    }

    @Test
    public void testAverageGradeByValidSubject(){
        GradeService<Double> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Bloom", "Math", 50.0));
        service.addGrade(new StudentGrade<>("Stella", "Math", 50.0));

        assertEquals(50.0, service.averageGrade("Math"));
    }

    @Test
    public void testAverageGradeByInvalidSubject(){
        GradeService<Double> service = new GradeService<>();
        service.addGrade(new StudentGrade<>("Bloom", "Math", 50.0));
        service.addGrade(new StudentGrade<>("Stella", "Math", 50.0));

        assertEquals(0.0, service.averageGrade("M"));
    }

}
