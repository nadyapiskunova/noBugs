package complex_tasks.task_3;

import complex_tasks.task_3.exceptions.InvalidGradeException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * positive for addGrade
 * 1) добавить студента c оценкой Integer валидными данными -> проверить, что он есть
 *
 * positive for averageGrade
 * 1) добавить 2 оценки за предмет, посчитать среднее
 *
 * negative for addGrade
 * 1) добавить отрицательную оценку -> проверить что есть исключение
 *
 * negative for averageGrade
 * 1) запросить среднее по несуществующему предмету
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
            service.addGrade(new StudentGrade<>("Stella", "Math", -100));;
        }, "Оценка отрицательная");
    }

    @Test
    public void testAverageGradeBySubjects(){
        GradeService<Double> service = new GradeService<>();

        service.addGrade(new StudentGrade<>("Bloom", "Math", 50.0));
        service.addGrade(new StudentGrade<>("Stella", "Math", 50.0));

        assertEquals(50, service.averageGrade("Math"));
    }

    @Test
    public void testAverageGradeByInvalidSubjects(){
        GradeService<Double> service = new GradeService<>();

        service.addGrade(new StudentGrade<>("Bloom", "Math", 50.0));
        service.addGrade(new StudentGrade<>("Stella", "Math", 50.0));

        assertEquals(0.0, service.averageGrade("M"));
    }

}
