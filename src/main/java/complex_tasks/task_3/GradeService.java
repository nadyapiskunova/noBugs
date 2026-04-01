package complex_tasks.task_3;

import complex_tasks.task_3.exceptions.InvalidGradeException;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) throws InvalidGradeException {
        if(grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Оценка не может быть отрицательной");
        }
        grades.add(grade);

    }

    public double averageGrade(String subject){
        return grades.stream()
                .filter(grade -> grade.getSubject().equals(subject))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<StudentGrade<T>> getAllGrade(){
        return List.copyOf(grades);
    }
}



