package part_12.complex_tasks.task_3;


public class StudentGrade <T extends Number>{
    private String name;
    private String subject;
    private T grade;

    public StudentGrade(String name, String subject, T graade){
        this.name = name;
        this.subject = subject;
        this.grade = graade;
    }

    public String getName(){
        return name;
    }
    public String getSubject(){
        return subject;
    }
    public T getGrade(){
        return grade;
    }
}
